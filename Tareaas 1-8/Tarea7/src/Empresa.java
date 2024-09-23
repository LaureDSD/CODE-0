public class Empresa {
    //V&C
    private Empleado[] empleados;
    private static final int TAMAÑO_MAX = 10;
    //CONSTRUCTOR
    public Empresa() {
        this.empleados = new Empleado[TAMAÑO_MAX];
    }
    //G&S
    public Empleado[] getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Empleado[] se) {
       this.empleados=se;
    }

    //METODOS DE USO

    //borrar por dni
    public void borrarPorDNI(String dni){
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<empleados.length){
            if(empleados[i]!=null && empleados[i].getDni().equals(dni)){
                encontrado = true;
                empleados[i]=null;
            }
            i++;
        }
    }
    //añadir empleados
    public void añadirEmpleados(Empleado e) {
        int pos=0;
        boolean posicionEncontrada=false;
        while(pos< empleados.length && !posicionEncontrada){
            if(empleados[pos]==null){
                posicionEncontrada=true;
                empleados[pos]=e;
            }
            pos++;
        }

        /*
        int i=0;

        while(i<empleados.length && empleados[i]!=null){
            i++;
        }
        if(i<empleados.length) {
            empleados[i] = e;
        }
        */

    }

    //METODOS ESPECIALES
    //mostrar empleado
    public void mostrarEmpleado(String dni){
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<empleados.length){
            if(empleados[i]!=null && empleados[i].getDni().equals(dni)){
                encontrado = true;
                if(empleados[i] instanceof EmpleadoFijo){
                    System.out.println("Empelado fijo: "+empleados[i]);
                }else if(empleados[i] instanceof EmpleadoPorHora){
                    System.out.println("Empleado hora: "+empleados[i]);
                }else if(empleados[i] instanceof EmpleadoPorComision){
                    System.out.println("Empleado comision: "+empleados[i]);
                }
            }
            i++;
        }
    }

    //mostrar empleados fijos
    public void mostrarEmpleadosFijos(){
        int i = 0;
        while(i<empleados.length){
            if(empleados[i]!=null && empleados[i] instanceof EmpleadoFijo){
                System.out.println(empleados[i]);
            }
            i++;
        }
    }

    //mostrar empleados por hora
    public void mostrarEmpleadosPorHora(){
        int i = 0;
        while(i<empleados.length){
            if(empleados[i]!=null && empleados[i] instanceof EmpleadoPorHora){
                System.out.println(empleados[i]);
            }
            i++;
        }
    }

    //mostrar empleados por comision
    public void mostrarEmpleadosPorComision(){
        int i = 0;
        while(i<empleados.length){
            if(empleados[i]!=null && empleados[i] instanceof EmpleadoPorComision){
                System.out.println(empleados[i]);
            }
            i++;
        }
    }

    //mostrar empleados
    public void mostrarEmpleados(){
        for(Empleado e : empleados){
            if(e!=null){
                if(e instanceof EmpleadoFijo){
                    System.out.println("Empelado fijo: "+e+" salario: "+e.calcularSalario());
                }else if(e instanceof EmpleadoPorHora){
                    System.out.println("Empleado hora: "+e+" salario: "+e.calcularSalario());
                }else if(e instanceof EmpleadoPorComision){
                    System.out.println("Empleado comision: "+e+" salario: "+e.calcularSalario());
                }
            }
        }
    }

    //mostrar importe salarios total
    public double importeSalariosTotal(){
        double sumaTotal = 0;
        for(Empleado e : empleados){
            if(e!=null){
               sumaTotal += e.calcularSalario();
            }
        }
        return sumaTotal;
    }

    //mostrar horas totales
    public double horasTotales(){
        double sumaTotal = 0;
        for(Empleado e : empleados){
            if(e instanceof EmpleadoPorHora){
                sumaTotal += ((EmpleadoPorHora) e).horasTrabajadas;
            }
        }
        return sumaTotal;
    }

    //mostrar ventas totales
    public double ventasTotales(){
        double sumaTotal = 0;
        for(Empleado e : empleados){
            if(e instanceof EmpleadoPorComision){
                sumaTotal += ((EmpleadoPorComision) e).getVentas();
            }
        }
        return sumaTotal;
    }

    //pagar salarios
    public void pagarSalarios(){
        System.out.println("Realizando transferencias para el pago de salarios por un" +
                "importe  total de["+this.importeSalariosTotal()+"]€");
        for(Empleado e : empleados){
            //reset comision
            if(e instanceof EmpleadoPorComision){
                ((EmpleadoPorComision) e).setVentas(0);
                //reset horas
            }else if(e instanceof EmpleadoPorHora){
                ((EmpleadoPorHora) e).setHorasTrabajadas(0);
            }
        }
    }


}
