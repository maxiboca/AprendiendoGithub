import java.util.Scanner;
public class Saludo{

    public static void saludar(){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu nombre");
        String nom = teclado.nextLine();
        System.out.println("hola " + nom);
    
teclado.close();
    }
    public static void saludarconedad(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Cual es tu edad?");
        int edad = teclado.nextInt();

        if (edad < 18) System.out.println("Hola " + nombre + " Eres bastante joven");
        else System.out.println("Hola " + nombre + " Espero que tengas un buen dia ");
teclado.close();
    }

}