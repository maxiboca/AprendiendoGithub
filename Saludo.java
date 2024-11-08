import java.util.Scanner;
public class Saludo{

    public static void saludar(){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime tu nomre");
        String nom = teclado.nextLine();
        System.out.println("hola " + nom);
    
teclado.close();
    }

}