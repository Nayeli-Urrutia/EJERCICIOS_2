package umg.Progra2.grupo2;
import java.util.InputMismatchException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ejerccio2 {

    public ejerccio2(){
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 2.1
        System.out.println( "AREA DE UNA PIRAMIDE CUADRADA");
        System.out.println( " ingrese la Altura del Triangulo");
        double altura = teclado.nextDouble();
        System.out.println(" ingrese la base del Triangulo");
        double base = teclado.nextDouble();
        double Multiplicar = altura * base;
        double Respuesta = Multiplicar / 2;
        String Final = String.format("%.2f",Respuesta);

        System.out.println(" El Area de la piramide es: " + Final);
        teclado.nextLine();
        teclado.nextLine();

        //Ejercicio 2.2
        System.out.println( "VOLUMEN DE UNA PIRAMIDE CUADRADA");
        System.out.println( " ingrese la Altura del Triangulo");
        double altura2 = teclado.nextDouble();
        System.out.println(" ingrese la base del Triangulo");
        double base2 = teclado.nextDouble();

        double Multiplicar2 = altura2 * base2;
        double Respuesta2 = Multiplicar2 / 3;
        String Final2 = String.format("%.2f",Respuesta2);
        System.out.println(" El Volumen del Triangulo es: " + Final2);
        teclado.nextLine();
        teclado.nextLine();

        //Ejercicio 2.3
        System.out.println( "AREA DE UN TRIANGULO");
        System.out.println( " ingrese la Altura del Triangulo");
        double altura3 = teclado.nextDouble();
        System.out.println(" ingrese la base del Triangulo");
        double base3 = teclado.nextDouble();
        double Multiplicar3 = altura * base;
        double Respuesta3 = Multiplicar3 / 2;
        String Final3 = String.format("%.2f",Respuesta3);

        System.out.println(" El Area del Triangulo es: " + Final3);
        teclado.nextLine();
        teclado.nextLine();
    }

}

