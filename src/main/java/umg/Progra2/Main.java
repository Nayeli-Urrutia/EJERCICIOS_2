package umg.Progra2;
import java.util.Scanner;
import umg.Progra2.grupo1.ejercicios1;
import umg.Progra2.grupo2.ejerccio2;
import umg.Progra2.grupo3.ejercicio3;

public class Main {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int opcion;
            ejercicios1 ej1;
            ejerccio2 ej2;
            ejercicio3 ej3;

            do {
                System.out.println("---------------------------------");
                System.out.println("---MENÚ DE EJERCICIOS EN CLASE---");
                System.out.println("---------------------------------");
                System.out.println("1. Ejercicios1");
                System.out.println("2. Ejercicios2");
                System.out.println("3. Ejercicios3");
                System.out.println("4. Salir del Programa");
                System.out.print("Ingrese el número de opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        ej1 = new ejercicios1();
                        break;
                    case 2:
                        ej2 = new ejerccio2();
                        break;
                    case 3:
                        ej3 = new ejercicio3();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                        break;
                }
            } while (opcion != 4);

            sc.close();
        }
    }


