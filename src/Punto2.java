import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        int tnom;
        String ulet;
        Scanner enter=new Scanner(System.in);
        System.out.println("Digite un nombre: ");
        String nom=enter.nextLine();
        tnom=nom.length();
        ulet=nom.substring((tnom-2),tnom);
        if(ulet.equalsIgnoreCase("rt")){
            System.out.println("Termina en las letras");
        }
        else{
            System.out.println("No termina en las letras");
        }
        enter.close();
    }
}
