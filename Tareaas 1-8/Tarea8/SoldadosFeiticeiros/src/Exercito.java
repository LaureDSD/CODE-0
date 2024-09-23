import java.util.Random;


public class Exercito implements Loita {
    String RESET = "\u001B[0m";
    private String nome;
    private String nomeSimple;
    private Guerreiro[] guerreiros;
    private int numGuerreiros;
    private final int MAXGUERREIROS = 100;
    private String color;

    public Exercito(String nome,String color) {
        //Completar
        this.nome = nome;
        this.color = color;
        this.numGuerreiros = 0;
        this.guerreiros = new Guerreiro[MAXGUERREIROS];
        this.nomeSimple = "";
    }
    public Exercito(String nome,String nomeSimple,String color) {
        //Completar
        this.nome = nome;
        this.color = color;
        this.numGuerreiros = 0;
        this.guerreiros = new Guerreiro[MAXGUERREIROS];
        this.nomeSimple = nomeSimple;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Guerreiro[] getGuerreiros() {
        return guerreiros;
    }

    public void setGuerreiros(Guerreiro[] guerreiros) {
        this.guerreiros = guerreiros;
    }


    public void engadirGuerreiro(Guerreiro g) {
        if (numGuerreiros < MAXGUERREIROS) {
            guerreiros[numGuerreiros] = g;
            g.setColor(this.color);
            g.setExercito(this.nomeSimple);
            numGuerreiros++;
        }
    }

    public void lanzarAtaque(Exercito outroExercito,Tablero tablero) {
        //Completar
        Random aleatorio = new Random();
        Guerreiro rival;
        int i = 0;
        while (i < numGuerreiros) {
            if (outroExercito.numGuerreiros > 0) {
                rival = outroExercito.guerreiros[aleatorio.nextInt(0, outroExercito.numGuerreiros)];
                tablero.imprimirTablero(this,outroExercito);
                guerreiros[i].atacar(rival);

            }
            i++;
        }
    }

    public void lanzarAtaque(Exercito outroExercito) {
        //Completar
        Random aleatorio = new Random();
        Guerreiro rival;
        int i = 0;
        while (i < numGuerreiros) {
            if (outroExercito.numGuerreiros > 0) {
                rival = outroExercito.guerreiros[aleatorio.nextInt(0, outroExercito.numGuerreiros)];
                guerreiros[i].atacar(rival);
                }
                i++;
            }
        }

    public void desprazar(int x ,int y) {
        //Completar
        Random aleatorio = new Random();
        int i = 0;
        while (i < numGuerreiros) {
           guerreiros[i].setPosicionX(aleatorio.nextInt(0,x));
            guerreiros[i].setPosicionY(aleatorio.nextInt(0,y));
            i++;
        }
    }

    //COSAS MIAS---------------------------------------------------------------------------------
    public void generarGuerra(Exercito rival,Tablero tablero){
        int ronda=0;

        while(!this.derrotado() && !rival.derrotado()) {
            System.out.println();
            System.out.println(RESET +">>>>>>>>>>>>>>>>>Batalla: "+ ronda+"<<<<<<<<<<<<<<<<<<<<<<");
            this.lanzarAtaque(rival,tablero);
            rival.lanzarAtaque(this,tablero);
            this.desprazar(tablero.getEjex(), tablero.getEjey());
            rival.desprazar(tablero.getEjex(), tablero.getEjey());
            ronda++;
        }
        System.out.println();
        if(rival.derrotado()){
            System.out.println(RESET +">>["+this.color+this.nome+" Gana a guerra"+ RESET +"]<<\n");
        }else{
            System.out.println(RESET +">>["+rival.color+rival.nome+" Gana a guerra"+ RESET +"]<<\n");
        }
    }

    //COSAS MIAS---------------------------------------------------------------------------------
    public void comparar(Exercito rival){



        int totalSV1 = 0,totalSV2 = 0;
        int totalSF1 = 0,totalSF2 = 0;
        int totalFV1 = 0,totalFV2 = 0;
        int totalFF1 = 0,totalFF2 = 0;
        int totalSalud1 = 0,totalSalud2 = 0;
        int totalPoder1 = 0,totalPoder2 = 0;


        //*quitar
        int i = 0;
        while(this.numGuerreiros>i){
            if(this.guerreiros[i] instanceof Soldado){
                totalPoder1+=((Soldado) this.guerreiros[i]).getArma().getDano();
            }else if(this.guerreiros[i] instanceof Feiticeiro){
                totalPoder1+=((Feiticeiro) this.guerreiros[i]).getPoder();
            }
            if(this.guerreiros[i].getSaude()>0) {
                totalSalud1 += this.guerreiros[i].getSaude();
                if(this.guerreiros[i] instanceof Soldado){
                    totalSV1++;
                }else if(this.guerreiros[i] instanceof Feiticeiro){
                    totalFV1++;
                }
            }else{
                if(this.guerreiros[i] instanceof Soldado){
                    totalSF1++;
                }else if(this.guerreiros[i] instanceof Feiticeiro) {
                    totalFF1++;
                }
            }
            i++;
        }

        // quitar

            int x = 0;
            while (rival.numGuerreiros > x) {
                if (rival.guerreiros[x] instanceof Soldado) {
                    totalPoder2 += ((Soldado) this.guerreiros[x]).getArma().getDano();
                } else if (rival.guerreiros[x] instanceof Feiticeiro) {
                    totalPoder2 += ((Feiticeiro) rival.guerreiros[x]).getPoder();
                }
                if (rival.guerreiros[x].getSaude() > 0) {
                    totalSalud2 += rival.guerreiros[x].getSaude();
                    if (rival.guerreiros[x] instanceof Soldado) {
                        totalSV2++;
                    } else if (rival.guerreiros[x] instanceof Feiticeiro) {
                        totalFV2++;
                    }
                } else {
                    if (rival.guerreiros[x] instanceof Soldado) {
                        totalSF2++;
                    } else if (rival.guerreiros[x] instanceof Feiticeiro) {
                        totalFF2++;
                    }
                }
                x++;
            }

        System.out.println(this.color+this.nome+" Derrota["+this.derrotado()+"] >>"+rival.color+" Derrota["+rival.derrotado()+"]"+rival.nome);
        System.out.println(this.color+"\t\tTotal Soldados V\t["+totalSV1+"] >> "+rival.color+"["+totalSV2+"]");
        System.out.println(this.color+"\t\tTotal Soldados F\t["+totalSF1+"] >> "+rival.color+"["+totalSF2+"]");
        System.out.println(this.color+"\t\tTotal Feiticeiros V\t["+totalFV1+"] >> "+rival.color+"["+totalFV2+"]");
        System.out.println(this.color+"\t\tTotal Feiticeiros F\t["+totalFF1+"] >> "+rival.color+"["+totalFF2+"]");
        System.out.println(this.color+"\t\tHP Final\t\t\t["+totalSalud1+"] >> "+rival.color+"["+totalSalud2+"]");
        System.out.println(this.color+"\t\tATK Maximo\t\t\t["+totalPoder1+"] >> "+rival.color+"["+totalPoder2+"]\n" + RESET);
    }


    public boolean derrotado(){
        int total = 0;
        int i = 0;
        while(numGuerreiros>i){
            if(guerreiros[i].getSaude()>0) {
                total += guerreiros[i].getSaude();
            }
            i++;
        }
        return total<=0;
    }

    @Override
    public String toString() {
        //Completar
        StringBuilder stringBuilder = new StringBuilder();
        String aviso = "Sin Ejercito";

        stringBuilder.append(this.color+"-- Exercito:["+this.nome+"] Guerreiros:["+this.numGuerreiros+"] --\n[<\n");
        if(this.numGuerreiros>0) {
            for (int i = 0; i < numGuerreiros; i++) {
                if (guerreiros[i] instanceof Feiticeiro) {
                    stringBuilder.append("| Mago:" + ((Feiticeiro) guerreiros[i]).toString()).append("\n");
                } else if (guerreiros[i] instanceof Soldado) {
                    stringBuilder.append("| Soldado:" + ((Guerreiro) guerreiros[i]).toString()).append("\n");
                }
            }
        }else{
            stringBuilder.append("Sin soldados alistados \n");
        }
        stringBuilder.append(">]"+RESET);
        System.out.println();
        return stringBuilder.toString();
    }
}
