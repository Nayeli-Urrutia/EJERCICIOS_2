package umg.Progra2.grupo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios1 {



    public ejercicios1 (){
        //Ejercicio 1.1
        System.out.println( "ÁREA DE UN CÍRCULO");
        System.out.println( "ingrese el radio del circulo");
        Scanner sc = new Scanner(System.in);
        float radio = sc.nextFloat();
        float radio2= radio*radio;
        double Area  = Math.PI * radio2;

        String resultado= String.format("%.2f",Area);
        System.out.println( " el Area del circulo es: " + resultado);
        sc.nextLine();
        sc.nextLine();

        //Ejercicio 1.2
        System.out.println( "CIRCUNFERENCIA DE UN CÍRCULO");
        System.out.println( "ingrese el radio del circulo");
        double radio3 = sc.nextDouble();
        double multi= Math.PI * 2;
        double total = multi * radio3;

        String total2= String.format("%.2f",total);
        System.out.println( " La circunferencia del circulo es: " + total2);
        sc.nextLine();
        sc.nextLine();

        //Ejercicio 1.3
        System.out.println("VOLUMEN DE UN CUBO");
        System.out.println("Ingrese la logitud de la arista");
        double longitud = sc.nextDouble();
        double longitud2 = Math.pow(longitud,3);
        String resultado3 = String.format("%.2f",longitud2);
        System.out.println( "El volumen del Cubo es: "+resultado3);


        System.out.println("Presione Enter para continuar...");
        sc.nextLine();
        sc.nextLine();

    }
}
