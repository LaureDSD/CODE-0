public class Gato{
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws MiExcepcion{
        if (nombre.length() >= 3){
            this.nombre = nombre;
        }else{
            throw new MiExcepcion("Caracteres insuficientes");
        }
        if(edad>0) {
            this.edad = edad;
        }else{
            throw new MiExcepcion("No admite valores negativos");
        }
    }





    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws Exception {
        if (nombre.length() >= 3){
            this.nombre = nombre;
        }else{
            throw new Exception("Caracteres insuficientes");
        }
    }





    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws MiExcepcion {
        if(edad>0) {
            this.edad = edad;
        }else{
            throw new MiExcepcion("No admite valores negativos");
        }
    }





    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
