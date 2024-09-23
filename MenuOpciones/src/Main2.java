public class Main2 {
    public static void main(String[] args) {
        int opcion;
        int opcion2 = 0;

        Menu menuprincipal = new Menu("Traductor", 3);
        menuprincipal.guardarOpcion("Salir", 0);
        menuprincipal.guardarOpcion("Traducir Saludo", 1);
        menuprincipal.guardarOpcion("Traducir Despedida", 2);

        Menu menusaludo = new Menu("Traductor de saludo", 3);
        menusaludo.guardarOpcion("frances", 1);
        menusaludo.guardarOpcion("ingles", 2);
        menusaludo.guardarOpcion("volver", 0);

        Menu menudespedida = new Menu("Traductor de despedida", 3);
        menudespedida.guardarOpcion("aleman", 1);
        menudespedida.guardarOpcion("italiano", 2);
        menudespedida.guardarOpcion("volver", 0);

        do {
            menuprincipal.mostrar();
            opcion = menuprincipal.leerOpcion();

            if(opcion==1){
                do{
                    menusaludo.mostrar();
                    opcion2 = menusaludo.leerOpcion();

                    switch (opcion2) {
                        case 1: {
                            System.out.println("saludo frnaces");
                            break;
                        }
                        case 2: {
                            System.out.println("saludo ingles");
                            break;
                        }
                    }

                } while (opcion2 != 0);
            }


            if(opcion==2){
                do{
                    menudespedida.mostrar();
                    opcion2 = menudespedida.leerOpcion();
                    switch (opcion2) {
                        case 1: {
                            System.out.println("adios aleman");
                            break;
                        }
                        case 2: {
                            System.out.println("adios italiano");
                            break;
                        }
                    }
                } while (opcion2 != 0);
            }


        } while (opcion != 0);
    }
}
