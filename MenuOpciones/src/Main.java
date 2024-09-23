public class Main {
    public static void main(String[] args) {
        int opcion;


        Menu menu1 = new Menu("Traductor de Saludos", 6);
        menu1.guardarOpcion("SALIR", 0);
        menu1.guardarOpcion("Galego", 1);
        menu1.guardarOpcion("Ingles", 2);
        menu1.guardarOpcion("Aleman", 3);
        menu1.guardarOpcion("Frances", 4);
        menu1.guardarOpcion("Italiano", 5);

        do {
            menu1.mostrar();
            opcion = menu1.leerOpcion();

            switch (opcion) {
                case 1:{
                    System.out.println("Boos dias");
                    break;
                }
                case 2:{
                    System.out.println("good morniing");
                    break;
                }
                case 3:{
                    System.out.println("Gutten morgen");
                    break;
                }
                case 4:{
                    System.out.println("Bonyur");
                    break;
                }
                case 5:{
                    System.out.println("boono dia");
                    break;
                }
            }

        } while (opcion != 0);
    }
}