package umg.Progra2.grupo3;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio3 {

    public ejercicio3() {
        Scanner sns = new Scanner(System.in);

        //Ejercicio 3.1
        System.out.println("VOLUMEN DE UN PRISMA RETANGULAR");
        System.out.print("Ingrese el área base del prisma: ");

        double base = sns.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double altura = sns.nextDouble();
        double volumen = base * altura;
        String Final1 = String.format("%.2f", volumen);
        System.out.println("El volumen del prisma rectangular es: " + Final1);

        //Enter para continuar
        sns.nextLine();
        sns.nextLine();

        //Ejercicio 3.2
        System.out.println("ÁREA DE UN PARALELOGRAMO");
        System.out.println("Ingresar la altura del Paralelogramo: ");
        double alturaParalelo = sns.nextDouble();
        System.out.println("Ingresar la base del Paralelogramo: ");
        double baseParalelo = sns.nextDouble();
        double AreaParalelo = baseParalelo * alturaParalelo;
        String Final2 = String.format("%.2f", AreaParalelo);
        System.out.println("El área del Paralelogramo es: " + Final2);

        //Enter para continuar
        sns.nextLine();
        sns.nextLine();

        // Ejercicio 3.3
        System.out.println("VOLUMEN DE UN CILINDRO");
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = sns.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double alturaCilindro = sns.nextDouble();
        double volumenCilindro = Math.PI * Math.pow(radio, 2) * alturaCilindro;
        String Final3 = String.format("%.2f", volumenCilindro);
        System.out.println("El volumen del cilindro es: " + Final3);



        }
    }
