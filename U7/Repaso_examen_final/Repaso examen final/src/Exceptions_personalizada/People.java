package Exceptions_personalizada;

public class People {
    String name;
    int age;

    public People(String name, int age)throws MiException {
        if (name.equals(null)){
            throw new MiException("Nombre del people no puede ser nulo");
        }
        this.name = name;
        this.age = age;
    }

}
