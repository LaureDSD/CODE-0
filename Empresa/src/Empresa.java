public class Empresa {

    //VARIABLES
    private String nombre;
    private Empleado[] empleados;

    private static final int MAX_NUM_EMPLEADOS = 1000;


    //CONSTRUCTOR
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[MAX_NUM_EMPLEADOS];
    }

    //G&S
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //METODOS

    //AÑADIR EMPLEADO
    public void añadirEmpleado(Empleado empleado) {

        int i=0;
        while(this.empleados.length>i){
            if(this.empleados[i]==null){
                this.empleados[i]= empleado;
               i=this.empleados.length;
                System.out.println("Empleado añadido posicion"+ i);
            }
            i++;
        }
    }

    //NUMERO EMPLEADOS
    public int numEmpleados() {
        int contador=0;
        int i=0;
        while(this.empleados.length>i){
            if(this.empleados[i]!=null){
                   contador++;
            }
            i++;
        }
        return contador;
    }

    //MOSTRAR EMPRESA Y EMPLEADOS
    public void mostrarEmpresa() {
        System.out.println(this.nombre);
        int i=0;
        while(this.empleados.length>i){
            if(this.empleados[i]!=null){
                System.out.println(empleados[i]);
            }
            i++;
        }
    }

    //MUESTRA POR SALARIO
    public void filtrarEmpleados(double salario) {
        int i=0;
        while(this.empleados.length>i){
            if(this.empleados[i]!=null && this.empleados[i].getSalario()>salario){
                System.out.println("numero de empleadosde '"+this.nombre+"' son: '"+empleados[i]+"'");
            }
            i++;
        }
    }

    public void salarioMaxMinMedio() {
        double mayor=Double.MIN_VALUE;
        double menor=Double.MAX_VALUE;
        double media;
        double sumasalario = 0;

        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getSalario()>mayor){
                    mayor=this.empleados[i].getSalario();
                }else{
                    menor=this.empleados[i].getSalario();
                }
                sumasalario =sumasalario+this.empleados[i].getSalario();
            }
        }
        media=sumasalario/numEmpleados();
        System.out.println("Mayor: "+mayor+" Menosr: "+menor+" Media: "+media);
    }

    public Empleado empleadoSlarioMax() {
        double mayor=Double.MIN_VALUE;
        int posicion = -1;

        for(int i=0 ;this.empleados.length>i;i++){

            if(this.empleados[i]!=null){
                if(this.empleados[i].getSalario()>mayor){
                    mayor=this.empleados[i].getSalario();
                    posicion=i;
                }
            }
        }
        if(posicion==-1){
            return null;
        }else{
            return this.empleados[posicion];
        }
    }

    public Empleado empleadoSlarioMin() {
        double menor=Double.MAX_VALUE;
        int posicion = -1;
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getSalario()<menor){
                    menor=this.empleados[i].getSalario();
                    posicion=i;
                }
            }
        }
        if(posicion==-1){
            return null;
        }else{
            return this.empleados[posicion];
        }
    }
    public void aumnetoSalario(double incremento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                this.empleados[i].setSalario(((this.empleados[i].getSalario()/100)*incremento)+this.empleados[i].getSalario());
                System.out.println(this.empleados[i]);
            }
        }
    }

    public void aumnetoSalarioDepartamento(double incremento , String departamento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDepartamento().equals(departamento)) {
                    this.empleados[i].setSalario(((this.empleados[i].getSalario() / 100) * incremento) + this.empleados[i].getSalario());
                }
            }
        }
    }

    public void empleadosDepartamento(String departamento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDepartamento().equals(departamento)) {
                    System.out.println(this.empleados[i]);
                }
            }
        }
    }
}