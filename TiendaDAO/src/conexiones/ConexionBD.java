package conexiones;

import codigosDeError.ErrorConexionBD_Exception;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.StringTokenizer;

public class ConexionBD {

    //Parametros
    private static final String FICCHERO_CFG = "src/Config/ConfigDB.cfg";
    private static final String FICHERO_CFG_CIFRADO = "src/Config/bd.cfg";
    private static final String FICHERO_CFG_PROPERTIES = "src/Config/configuracion.properties";
    //private static final String CLAVE = "8FUY9E87YV7YSF78E789EDWE";

    //Variables
    private static String url;
    private static String usuario;
    private static String password;
    private static String clase;

    public ConexionBD() throws Exception {
        /*Extra Obtiene datos de bd.cfg y crea fichero de config cifrado*/
        generarArchivoCifrado();

        /*SELECCION DE FICHERO*/
        int ficheroConfiguracion = 1;
        switch (ficheroConfiguracion) {
            /* Carga los parámetros de la conexión del fichero de configuracion.prperties*/
            case 0 -> lectorArchivoProperties();
            /* Carga los parámetros de la conexión del fichero de bd.cfg */
            case 1 -> lectorArchivoCifradoCfg();
            /* Carga los parámetros de la conexión del fichero de ConfigDB.cfg */
            default -> lectorArchivoCfg();
        }


    }

    //Conexion  /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Connection getConnection() {
        try {
            /*Abre la conexión con la BD y la retorna*/
            Class.forName(clase);
            return DriverManager.getConnection(url, usuario, password);

        } catch (Exception e) {
            throw new ErrorConexionBD_Exception("Error al obtener conexion con base de datos: "+e.getMessage());
        }
    }

    //DESCONEXION /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void closeConnection(Connection connection){
        // Cierra la conexión con la BD
        try {
            //System.out.println("cerrada");
            connection.close();
        }catch (SQLException e){
            throw new ErrorConexionBD_Exception("Error al desconectar la base de datos:" + e.getMessage());
        }
    }

    //CARGAR CONFIG /////////////////////////////////////////////////////////////////////////////////////////////////
    private static String lectorArchivoCfg(){
        try{
        //EXTRA AÑADIDO PARA CIFRADOS
        StringBuilder texto = new StringBuilder();
            //Bufer Reader
            BufferedReader buffer = new BufferedReader(
                    new FileReader(FICCHERO_CFG)
            );
            String linea = buffer.readLine();
            while (linea != null) {
                //EXTRA AÑADIDO PARA CIFRADOS
                texto.append(linea).append("\n");
                //Tokenizer
                tokenizerLineas(linea);
                linea = buffer.readLine();
            }
            buffer.close();
            //EXTRA AÑADIDO PARA CIFRADOS
            return texto.toString();
        }catch (Exception e){
            throw new ErrorConexionBD_Exception("Error lectura fichero congiguracion: "+e.getMessage());
        }
    }

    //LECTOR FICHEROS CIFRADOS  /////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void lectorArchivoCifradoCfg(){
        try{
            //Bufer Reader
            BufferedReader buffer = new BufferedReader(
                    new FileReader(FICHERO_CFG_CIFRADO));
            //String linea = Cifrado.descifrar(buffer.readLine(), CLAVE);
            String linea = Cifrado.descifrar(buffer.readLine(),Cifrado.getClave(FICHERO_CFG_CIFRADO));
            while (linea != null) {
                //Tokenizer
                tokenizerLineas(linea);
                linea = Cifrado.descifrar(buffer.readLine(),Cifrado.getClave(FICHERO_CFG_CIFRADO));
            }
            buffer.close();
        }catch (Exception e){
            throw new ErrorConexionBD_Exception("Error lectura de fichero cifrado: "+e.getMessage());
        }
    }

    //LEER FICHERO CONFIG Y CIFRARLO / DEPENDE DE AÑADIDO PARA CIFRADOS LECTURA FICHEROS
    private static  void generarArchivoCifrado() {
        try {
            BufferedWriter buffer = new BufferedWriter(
                    new FileWriter(FICHERO_CFG_CIFRADO)
            );
            //buffer.write(Cifrado.cifrar(lectorArchivoCfg(),CLAVE));
            buffer.write(Cifrado.cifrar(lectorArchivoCfg(), Cifrado.setClave(FICHERO_CFG_CIFRADO)));
            buffer.close();
        }catch (Exception e){
            throw new ErrorConexionBD_Exception("Error al generar archivo ccifrado: "+e.getMessage());
        }
    }

    //Tokenizer /////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void tokenizerLineas(String texto) {
        try {
            StringTokenizer linea = new StringTokenizer(texto, "\\\n ");
            while (linea.hasMoreTokens()) {
                String token = linea.nextToken();
                if (token.equals("URL:")) {
                    url = linea.nextToken().trim();
                }
                if (token.equals("USER:")) {
                    usuario = linea.nextToken().trim();
                }
                if (token.equals("PASSWORD:")) {
                    password = linea.nextToken().trim();
                }
                if (token.equals("CLASS:")) {
                    clase = linea.nextToken().trim();
                }
            }
        }catch (Exception e){
            throw new ErrorConexionBD_Exception("Error tokenizer: "+e.getMessage());
        }
    }

    //Properties /////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void lectorArchivoProperties()  {
        try {
            Properties properties= new Properties();
            BufferedReader ficherop = new BufferedReader(
                    new FileReader(FICHERO_CFG_PROPERTIES)
            );
            properties.load(ficherop);
            url = properties.getProperty("URL");
            clase = properties.getProperty("CLASS");
            usuario= properties.getProperty("USER");
            password = properties.getProperty("PASSWORD");
        } catch (Exception e) {
            throw new ErrorConexionBD_Exception("Error lectura fichero properties: "+e.getMessage());
        }
    }
}
