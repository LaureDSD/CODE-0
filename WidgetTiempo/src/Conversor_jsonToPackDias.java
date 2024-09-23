import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Conversor_jsonToPackDias {
    String idConcello;
    String nomeConcello;
    ArrayList<Dia> dias;
    private String fecha ;
    private int temperaturaMax;
    private int temperaturaMin;
    private int uvMax;
    private String aviso;
    private int manha;
    private int temperaturaMaxmanha;
    private int temperaturaMinmanha;
    private int pchoivamanha;
    private int ventomanha;
    private int tarde;
    private int temperaturaMaxtarde;
    private int temperaturaMintarde;
    private int pchoivatarde;
    private int ventotarde;
    private int noche;
    private int temperaturaMaxnoche;
    private int temperaturaMinnoche;
    private int pchoivanoche;
    private int ventonoche;
    private String enlace;
    private String datos;
    public Conversor_jsonToPackDias(String id) {
        this.enlace = "https://servizos.meteogalicia.gal/mgrss/predicion/jsonPredConcellos.action?idConc="+id+"&request_locale=gl";
        this.dias = new ArrayList<>();
        descargar();
        convertir();
    }

    public void convertir(){
            StringTokenizer linea = new StringTokenizer(datos, "[]{},:\"");
            while (linea.hasMoreTokens()) {
                String token = linea.nextToken();
                if(token.equals("predConcello")){
                    linea.nextToken();
                    idConcello = linea.nextToken();
                    linea.nextToken();
                    //System.out.println(">>>>>>ID:"+idConcello);
                }
                //MOSTRAR
                //System.out.println(token);
                //
                if(token.equals("dataPredicion")){
                    fecha = linea.nextToken().replace("T00","");
                    linea.nextToken();
                    linea.nextToken();
                    //System.out.println(">>>>>>Fecha:"+fecha);
                }
                if(token.equals("nivelAviso")){
                    aviso = linea.nextToken();
                }
                if(token.equals("ceo")){
                    linea.nextToken();
                    manha = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    tarde = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    noche = Integer.parseInt(linea.nextToken());
                    //System.out.println(">>>>>>Ceo: "+manha+","+tarde+","+noche);
                }
                if(token.equals("pchoiva")){
                    linea.nextToken();
                    pchoivamanha = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    pchoivatarde = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    pchoivanoche = Integer.parseInt(linea.nextToken());
                }
                if(token.equals("tMax")){
                    temperaturaMax = Integer.parseInt(linea.nextToken());
                    //System.out.println(">>>>>Maxima:"+temperaturaMax);
                }
                if(token.equals("tMin")){
                    temperaturaMin = Integer.parseInt(linea.nextToken());
                    //System.out.println(">>>>>Minima:"+temperaturaMin);
                }
                if(token.equals("tmaxFranxa")){
                    linea.nextToken();
                    temperaturaMaxmanha = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    temperaturaMaxtarde = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    temperaturaMaxnoche = Integer.parseInt(linea.nextToken());
                }
                if(token.equals("tminFranxa")){
                    linea.nextToken();
                    temperaturaMinmanha = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    temperaturaMintarde = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    temperaturaMinnoche = Integer.parseInt(linea.nextToken());
                }
                if(token.equals("uvMax")){
                    uvMax = Integer.parseInt(linea.nextToken());
                }
                if(token.equals("vento")){
                    linea.nextToken();
                    ventomanha = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    ventotarde = Integer.parseInt(linea.nextToken());
                    linea.nextToken();
                    ventonoche = Integer.parseInt(linea.nextToken());

                    dias.add(new Dia(fecha,temperaturaMax,temperaturaMin,uvMax,aviso,
                            manha,temperaturaMaxmanha,temperaturaMinmanha, pchoivamanha,ventomanha,
                            tarde,temperaturaMaxtarde,temperaturaMintarde,pchoivatarde,ventotarde,
                            noche,temperaturaMaxnoche,temperaturaMinnoche,pchoivanoche,ventonoche));
                }
                if(token.equals("nome")){
                    nomeConcello = linea.nextToken();
                    //System.out.println(">>>>>Nome:"+nomeConcello);
                }
            }
    }



    public void descargar(){

        StringBuilder concat = new StringBuilder();

        String linea;
        try {
            // Crea un objeto URL con la dirección proporcionada
            URL url = new URL(enlace);


            // Abre una conexión URL
            URLConnection urlConnection = url.openConnection();


            // Obtiene el InputStream de la conexión
            InputStream inputStream = urlConnection.getInputStream();


            // Crea un lector de InputStreamReader para leer el contenido
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream)
            );
            // Lee línea por línea y muestra en pantalla
            while ((linea = bufferedReader.readLine()) != null) {
                concat.append(linea);
            }
            // Cierra el lector
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        this.datos = concat.toString();
    }

    public String getIdConcello() {
        return idConcello;
    }

    public String getNomeConcello() {
        return nomeConcello;
    }

    public ArrayList getDias() {
        return dias;
    }
}
