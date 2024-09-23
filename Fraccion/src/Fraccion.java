public class Fraccion {

    //ATRIBUTOS
    private int numerador;
    private int denominador;

    //CONSTRUCTOR
    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //G&S
    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    //METODOS
    public double valor() {
        if (this.denominador == 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (double) this.numerador / this.denominador;
        }
    }

    //MOSTRAR MULTIPLE
    public void mostrar() {
        System.out.print(this.numerador + "/" + this.denominador);
    }
    public void mostrarconsalto() {
        System.out.println(this.numerador + "/" + this.denominador);
    }
    public void mostrarresultadoconsalto() {
        System.out.println(this.numerador + "/" + this.denominador + " = " + this.valor());
    }

    public int comparar(Fraccion f) {
        if (this.valor() == f.valor()) {
            return 0;
        } else if (this.valor() > f.valor()) {
            return 1;
        } else {
            return -1;
        }
    }

    public Fraccion multiplicar(Fraccion f) {
        return new Fraccion(this.numerador * f.numerador, this.denominador * f.denominador);
    }

    public Fraccion dividir(Fraccion f) {
        return new Fraccion(this.numerador * f.denominador, this.denominador * f.numerador);
    }

    public static int maxComunDivisor(int a, int b) {
        int temporal;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static int minComunMultiplo(int a, int b) {
        return (a * b) / maxComunDivisor(a, b);
    }

    public Fraccion sumar(Fraccion f) {
        int numerComun, denumComun;
        if (this.denominador == f.denominador) {
            //SUMA MISMO DENOMINADOR
            numerComun = this.numerador + f.numerador;
            denumComun = this.denominador;
        } else {
            //SUMA DIFERENTE DENOMINADOR
            denumComun = minComunMultiplo(this.denominador, f.denominador);
            int num1 = (denumComun / this.denominador) * this.numerador;
            int num2 = (denumComun / f.denominador) * f.numerador;
            numerComun = num1+num2;
        }
        //REDUCIR



        return new Fraccion(numerComun, denumComun);
    }


    public Fraccion restar(Fraccion f) {
        int numer, denum;
        if (this.denominador == f.denominador) {
            //RESTA MISMO DENOMINADOR
            if (this.numerador > f.numerador) {
                numer = this.numerador - f.numerador;
            } else {
                numer = f.numerador - this.numerador;
            }
            denum = this.denominador;
        } else {
            //RESTA DIFERENTE DENOMINADOR
            denum = minComunMultiplo(this.denominador, f.denominador);
            int num1 = denum / this.denominador * this.numerador;
            int num2 = denum / f.denominador * f.numerador;
            if(num1>num2) {
                numer = num1 - num2;
            }else{
                numer = num2 - num1;
            }
        }
        //REDUCIR



        return new Fraccion(numer, denum);
    }
}
