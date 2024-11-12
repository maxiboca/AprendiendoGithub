import java.util.Scanner;
public class Despedida {
   public static void despedida(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre ");
        String nom = teclado.nextLine();
        System.out.println("Adios " + nom);
teclado.close();
   } 
}
