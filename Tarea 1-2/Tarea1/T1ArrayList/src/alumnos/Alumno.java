package alumnos;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno>{
    private String nome;
    //private int nota;
    ArrayList<Integer> notas = new ArrayList<>();

    public Alumno(String nome, String notaSeparadas) {
        this.nome = nome;
        String[] listadonotas = notaSeparadas.split(" ");
        for(String s : listadonotas) {
            int nota = Integer.valueOf(s);
            this.notas.add(nota);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int compareTo(Alumno a){
        return Integer.compare(calcularMedia(this.notas),calcularMedia(a.notas));
    }






    public int calcularMedia(ArrayList<Integer> n){
        int suma=0;
        for (Integer listaNotas : n) {
                suma+=listaNotas;
        }
        return suma/n.size();
    }

}
