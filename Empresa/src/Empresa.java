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
    public boolean añadirEmpleado(Empleado empleado) {
        int i=0;

        while(i<empleados.length && this.empleados[i]!=null){
            i++;
        }
        if(i<empleados.length){
            this.empleados[i]=empleado;
            return true;
        }else{
            return false;
        }

    }

    //NUMERO EMPLEADOS
    public int numEmpleados() {
        int contador=0;

        for(Empleado e:empleados){
            if(e!=null){
                contador++;
            }
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

    //MUESTRA EMPLEADOS POR SALARIO MAYOR
    public void filtrarEmpleados(double salario) {
        int i=0;
        while(this.empleados.length>i){
            if(this.empleados[i]!=null && this.empleados[i].getSalario()>salario){
                System.out.println("numero de empleadosde '"+this.nombre+"' son: '"+empleados[i]+"'");
            }
            i++;
        }
    }

    //EMPLEADO SALARIO MAX, MIN Y MEDIA
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

    //EMPLEADO SALARIO MAXIMO
    public Empleado empleadoSlarioMax() {

        /*double mayor=Double.MIN_VALUE;
        boolean condicion=false;
        int posicion = 0;

        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getSalario()>mayor){
                    mayor=this.empleados[i].getSalario();
                    condicion=true;
                    posicion=i;
                }
            }
        }
        if(condicion){
            return this.empleados[posicion];
        }else{
            return null;
        }
        */

        Empleado eMaxSalario = null;
        double mayorSalario = Double.MIN_VALUE;
        for (Empleado e:empleados){
            if(e!=null && e.getSalario()>mayorSalario){
                mayorSalario=e.getSalario();
                eMaxSalario = e;
            }
        }
        return eMaxSalario;
    }

    //EMPLEADO SALARIO MINIMO
    public Empleado empleadoSlarioMin() {
        double menor=Double.MAX_VALUE;
        boolean condicion=false;
        int posicion = 0;

        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getSalario()<menor){
                    menor=this.empleados[i].getSalario();
                    condicion=true;
                    posicion=i;
                }
            }
        }
        if(condicion){
            return this.empleados[posicion];
        }else{
            return null;
        }
    }
    //AUMENTO SALARIO
    public void aumnetoSalario(double incremento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                double nuevosalario = ((this.empleados[i].getSalario()/100)*incremento)+this.empleados[i].getSalario();
                this.empleados[i].setSalario(nuevosalario);
              //System.out.println(this.empleados[i]);
            }
        }
    }

    //AUMENTO SALARIO POR DEPARTAMENTO
    public void aumnetoSalarioDepartamento(double incremento , String departamento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDepartamento().equals(departamento)) {
                    double nuevosalario = ((this.empleados[i].getSalario()/100)*incremento)+this.empleados[i].getSalario();
                    this.empleados[i].setSalario(nuevosalario);
                  //  System.out.println(this.empleados[i]);
                }
            }
        }
    }

    //MUESTRA EMPLEADO DE DEPARTAMENTO
    public void empleadosDepartamento(String departamento){
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDepartamento().equals(departamento)) {
                    System.out.println(this.empleados[i]);
                }
            }
        }
    }

    //MUESTRA EMPLEADOS POR DNI
    public Empleado buscarPorDni(String dni){
        boolean condicion=false;
        int posicion = 0;
        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDni().equals(dni)) {
                    System.out.println(this.empleados[i]);
                    condicion=true;
                }
            }
        }
        if(condicion){
            return this.empleados[posicion];
        }else{
            return null;
        }
    }

    //ELIMINA EMPLEADOS POR DNI
    public boolean borrarPorDni(String dni){
        boolean condicion=false;

        for(int i=0 ;this.empleados.length>i;i++){
            if(this.empleados[i]!=null){
                if(this.empleados[i].getDni().equals(dni)) {
                    System.out.println("Se borrara: "+this.empleados[i]);
                    this.empleados[i]=null;
                    condicion=true;
                }
            }
        }
        if(condicion){
            return true;
        }else{
            return false;
        }
    }

}