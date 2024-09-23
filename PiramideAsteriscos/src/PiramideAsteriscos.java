import java.util.Random;

public class PiramideAsteriscos {
    //Atrbutos
    private int altura;

    //Constructor

    public PiramideAsteriscos() {
        int  random = 0;
        Random aleatorio = new Random();
        this.altura = aleatorio.nextInt(1,20);
    }

    public PiramideAsteriscos(int altura) {
        if(altura<1 || altura>20){
            this.altura = 0;
        }else {
            this.altura = altura;
        }
    }

    //St&gt

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura<1 || altura>20){
            this.altura = 0;
        }else {
            this.altura = altura;
        }
    }

    //Metodos
    void imprimir (){

        int espacio;
        int contador = -1;

        espacio = altura;
        //---------------------------------------------------------------------------
        int a=0;
        while (a < altura) {
            a++;
            System.out.println();
            contador = contador + 2;
//---------------------------------------------------------------------------
            int c=0;
            espacio--;
            while (c < espacio) {
                c++;
                System.out.print("   ");
            }
//----------------------------------------------------------------------------
            int b=0;
            while (b < contador) {
                b++;
                System.out.print(" * ");
            }
        }
        System.out.println();
    }

    void aleatoria(){


    }
    void aumentaraltura(int aumento){
        this.altura=this.altura+aumento;
    }
}
