import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tamañoTableroEjeX=3;
		int tamañoTableroEjeY=3;

		Scanner teclado = new Scanner(System.in);
		Tablero tableroBase = new Tablero(tamañoTableroEjeX,tamañoTableroEjeY);

		Arma espada = new Arma("Espada", 10);
		Arma lanza = new Arma("Lanza", 15);
		Arma daga = new Arma("Daga", 5);

		Exercito exercitoNorte = new Exercito("Exercito do Norte","EN","\u001b[31m");
		Soldado s1 = new Soldado("Soldado 1", 100, 0,0, espada);
		Soldado s2 = new Soldado("Soldado 2", 100, 0,1, lanza);
		Soldado s3 = new Soldado("Soldado 3", 100, 0,2, daga);
		Feiticeiro f1 = new Feiticeiro("Feiticeiro 1", 100, 0,0, 20);

		Exercito exercitoPoñente = new Exercito("Exercito de Poñente","EP","\u001b[34m");
		Soldado s4 = new Soldado("Soldado 4", 100, 2,1, espada);
		Soldado s5 = new Soldado("Soldado 5", 100, 2,2, lanza);
		Soldado s6 = new Soldado("Soldado 6", 100, 2,3, daga);
		Feiticeiro f2 = new Feiticeiro("Feiticeiro 2", 100, 2,2, 25);

		Exercito exercitoShaggy = new Exercito("Exercito Shaggy","\u001b[35m");
		Arma presencia = new Arma("presencia", Integer.MAX_VALUE);
		Soldado shaggy = new Soldado("Soldado 6", Integer.MAX_VALUE, 0,0, presencia);
		exercitoShaggy.engadirGuerreiro(shaggy);

		exercitoNorte.engadirGuerreiro(s1);
		exercitoNorte.engadirGuerreiro(s2);
		exercitoNorte.engadirGuerreiro(s3);
		exercitoNorte.engadirGuerreiro(f1);

		exercitoPoñente.engadirGuerreiro(s4);
		exercitoPoñente.engadirGuerreiro(s5);
		exercitoPoñente.engadirGuerreiro(s6);
		exercitoPoñente.engadirGuerreiro(f2);



		menuSimulador(exercitoNorte,exercitoPoñente,teclado,tableroBase,tamañoTableroEjeX,tamañoTableroEjeX);

	}



	public static void menuSimulador(Exercito exercito2, Exercito exercito1, Scanner teclado,Tablero tableroBase,int tamañox,int tamañoy){
		boolean ejecutar = true;
		boolean completada = false;
		int menu1;
		int menu2;
		exercito1.desprazar(tamañox,tamañoy);
		exercito2.desprazar(tamañox,tamañoy);
		System.out.println("Simulador de guerras");
		do {
			Exercito exercitoPoñente = exercito1;
			Exercito exercitoNorte = exercito2;
			System.out.println("Menu" +
					"\n[1]Ver exercitos" +
					"\n[2]Ver estadisticas");
			if (!completada){
				System.out.println("[3]Ejecutar simulacion");}
			System.out.println("[0]Salir");
			menu1=teclado.nextInt();
			if(menu1==1){
				tableroBase.imprimirTablero(exercitoNorte,exercitoPoñente);
				System.out.println(exercitoNorte);
				System.out.println(exercitoPoñente);
			}
			if(menu1==2){
				exercitoNorte.comparar(exercitoPoñente);
			}
			if(menu1==3 && !completada){
				menu2 = 0;
				do{
					System.out.println("Menu" +
							"\n[1]Inicia exercito Norte" +
							"\n[2]Inicia exercito Ponente" +
							"\n[0]Salir");
					menu2 = teclado.nextInt();
					if (menu2==1) {
						exercitoNorte.generarGuerra(exercitoPoñente,tableroBase);
						completada=true;
					}
					if (menu2==2) {
						exercitoPoñente.generarGuerra(exercitoNorte,tableroBase);
						completada=true;
					}
					menu2 = 0;
				}while(menu2!=0);
			}
			if(menu1==0){
				ejecutar=false;
			}
		}while(ejecutar);
	}

}
