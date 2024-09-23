package Ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMap_ArrayList_Switch_Tokenizer {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    private HashMap<String, Vehiculo> matriculados;

    public HashMap_ArrayList_Switch_Tokenizer(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.matriculados = new HashMap<>();
    }

    public boolean addVehiculo(Vehiculo v) throws Exception {
        try {

            //Exercicio 1
            if (v == null || v.getPrecio() > 0) {
                if (v instanceof Coche && ((Coche) v).getNumeroPuertas() >= 2 && ((Coche) v).getNumeroPuertas() <= 5) {
                    vehiculos.add(v);
                    return true;
                } else if (v instanceof Furgoneta) {
                    vehiculos.add(v);
                    return true;
                }
            }
            return false;
        }catch (Exception e){
            throw new Exception("addVehiculo"+e.getMessage());
        }
    }

    void mostrarVehiculos() {
        //Exercicio 2
        System.out.println("Concesionario: "+nombre);
        for(Vehiculo v : vehiculos){
            if(v instanceof Coche){
                System.out.println("Coche: "+v);
            }else if(v instanceof Furgoneta){
                System.out.println("Furgoneta: "+v);
            }
        }

    }

    boolean eliminarVehiculo(String marca, String modelo) {
        //Exercicio 3
        Vehiculo v = new Vehiculo(marca,modelo,0);


        /*
        boolean encontrado = false;
        int i =0;
        while(i< vehiculos.size() && vehiculos.get(i).equals(v)){
            i++;
            encontrado = true;
        }
        if(encontrado==true){
        vehiculos.remove(i);
        }
        */

            return vehiculos.remove(v);

    }

    void ordenarVehiculos() {
		//Exercicio 4
        Collections.sort(vehiculos);
    }

    public boolean mostrarCoches (Combustible combustible, int puertas, double precioMax){
        //Exercicio 5
        int contador =0;
        Coche coche;
        boolean encontrado = false;
            for (Vehiculo v : vehiculos) {
                if (v instanceof Coche) {
                    coche = (Coche) v;
                    if (coche.getCombustible() == combustible){
                        if (coche.getNumeroPuertas() == puertas) {
                            if (coche.getPrecio() <= precioMax) {
                                contador++;
                                System.out.println("Enconmtrados:" + contador+") "+v);
                                encontrado = true;
                            }
                        }
                    }
                }
            }
        return encontrado;
    }


    boolean cargarVehiculos(String fichero) {
		//Exercicio 6
        boolean agregado = false;
        try {
            BufferedReader archivo = new BufferedReader(new FileReader(fichero));
            String linea;
            String modelo;
            String marca ;
            double precio;
            int puertas, capacidad;
            String combust;
            Combustible c = null;

            while ((linea=archivo.readLine())!=null){
                StringTokenizer tokens = new StringTokenizer(linea,",");
                while(tokens.hasMoreElements()){
                    String palabra = tokens.nextToken().trim().toLowerCase();
                        nombre = tokens.nextToken().trim();
                    if(palabra.equals("coche")){
                        marca=tokens.nextToken().trim();
                        modelo=tokens.nextToken().trim();
                        precio=Double.parseDouble(tokens.nextToken().trim());
                        puertas=Integer.parseInt(tokens.nextToken().trim());
                        combust=tokens.nextToken().trim();
                        switch (combust){
                            case "gasolina" -> c=Combustible.GASOLINA;
                            case "electrico" -> c=Combustible.ELECTRICO;
                            case "diesel" -> c=Combustible.DIESEL;
                        }
                        vehiculos.add(new Coche(marca,modelo,precio,puertas,c));
                        agregado = true;
                    }else if(palabra.equals("furgoneta")){
                        marca=tokens.nextToken().trim();
                        modelo=tokens.nextToken().trim();
                        precio=Double.parseDouble(tokens.nextToken().trim());
                        capacidad=Integer.parseInt(tokens.nextToken().trim());
                        vehiculos.add(new Furgoneta(marca,modelo,precio,capacidad));
                        agregado = true;
                    }
                }
            }
            archivo.close();
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (NoSuchElementException e) {
            System.out.println("Elemento no existe");
        }catch (NullPointerException e){
            System.out.println("Nulo");
        }catch (NumberFormatException e){
            System.out.println("Formato invalido");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return agregado;
    }
	
	
	public void mostrarCoches2 (Combustible combustible, int puertas, double precioMax) throws VehiculoNoEncontradoException {
        // Exercicio 7

        //Exercicio 5
        int contador =0;
        Coche coche;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                coche = (Coche) v;
                if (coche.getCombustible() == combustible){
                    if (coche.getNumeroPuertas() == puertas) {
                        if (coche.getPrecio() <= precioMax) {
                            contador++;
                            System.out.println("Enconmtrados:" + contador+") "+v);
                        }
                    }
                }
            }
        }
        if(contador==0){
            throw new VehiculoNoEncontradoException("Error, no encontrado");
        }
    }
	
	public boolean matricular(String matricula, Vehiculo vehiculo) {
        // Exercicio 8
        matriculados.put(matricula,vehiculo);
        return matriculados.containsKey(matricula);
    }

    public void mostrarMatriculadosMarca(String marca){
        // Exercicio 8
        System.out.println("Ejercicio 8");
        Vehiculo v;
        for (Map.Entry key_value: matriculados.entrySet()) {
            System.out.println(key_value);
            v = (Vehiculo) key_value.getValue();
            if(v.getMarca().equals(marca)){
                System.out.println(key_value.getKey());
            }
        }
    }
}
