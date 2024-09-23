public class Tablero {

    String RESET = "\u001B[0m";
    private int ejex;
    private int ejey;

    private final String[][] mapa;

    public Tablero(int x , int y) {
        this.ejex=x;
        this.ejey=y;
        mapa= new String[this.ejex][this.ejey];
    }

    public int getEjex() {
        return ejex;
    }

    public void setEjex(int ejex) {
        this.ejex = ejex;
    }

    public int getEjey() {
        return ejey;
    }

    public void setEjey(int ejey) {
        this.ejey = ejey;
    }


    public void imprimirTablero( Exercito atacante,Exercito defensor){




        String[][] exercitoAtaque = new String[this.ejex][this.ejey];
        String[][] exercitoDEF = new String[this.ejex][this.ejey];





        for(Guerreiro e1 : atacante.getGuerreiros()){
            if(e1!=null) {
                exercitoAtaque[e1.getPosicionX()][e1.getPosicionY()] = e1.getColor()+e1.getExercito()+RESET;
            }
        }
        for(Guerreiro e2 : defensor.getGuerreiros()){
            if(e2!=null) {
                exercitoDEF[e2.getPosicionX()][e2.getPosicionY()] = e2.getColor()+e2.getExercito()+RESET ;
            }
        }


            for (int y = 0; y < ejey; y++) {
                System.out.println();
                for(int x=0 ;x<ejex;x++) {

                //rescribe tablero con defensores
                this.mapa[x][y] = exercitoDEF[x][y];

                //escribe atacantes en vacios
                if(this.mapa[x][y]==null) {
                    this.mapa[x][y] = exercitoAtaque[x][y];

                //suma def + atacante
                }else if(exercitoAtaque[x][y]!=null && exercitoDEF[x][y]!=null){
                    this.mapa[x][y]=exercitoAtaque[x][y]+">>"+exercitoDEF[x][y];
                }

                //imprime
                if(this.mapa[x][y]==null) {
                    System.out.print("[______]");
                }else{
                    if(exercitoAtaque[x][y]!=null && exercitoDEF[x][y]!=null){
                        System.out.print("["+this.mapa[x][y]+"]");
                    }else{
                        System.out.print("[--"+this.mapa[x][y]+"--]");
                    }

                }



            }
        }
        System.out.println();






    }
}
