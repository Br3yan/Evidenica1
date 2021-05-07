import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) throws Exception {
        String plet;
        Scanner enter=new Scanner(System.in); 
        System.out.println("Ingrese su nombre: "); 
        String nom=enter.nextLine();
        plet=nom.substring(0, 1);

        if (plet.equalsIgnoreCase("A") || plet.equalsIgnoreCase("E")){ 
            System.out.println("El nombre es: "+nom); 
         } 
         else if(plet.equalsIgnoreCase("I") || plet.equalsIgnoreCase("o")){
             System.out.println("ADSI2020");
         }
         else if(plet.equalsIgnoreCase("U")){
             System.out.println(nom.subSequence(1,3));
         }
         else
             System.out.println("El nombre no comienza por vocal");{
         }
         
         enter.close();
    }
}
