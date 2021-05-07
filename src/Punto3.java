import java.util.Scanner;
 public class Punto3 {
     public static void main(String[] args){
     Scanner obj=new Scanner(System.in);
     int num1,num2,Respuesta,Resultado;
     System.out.println("Digite 2 numeros");
     System.out.println("Primer numero");
     num1=obj.nextInt();
     System.out.println("segundo numero");
     num2=obj.nextInt();
     System.out.println("Opcion (1) = Suma");
     System.out.println("Opcion (2) = Resta");
     System.out.println("Opcion (3) = Multiplicacion");
     System.out.println("Opcion (4) = Division");
     System.out.println("Ingrese la opcion a realizar");
     Respuesta=obj.nextInt();

        switch(Respuesta){
            case 1:
             Resultado=num1+num2;
             System.out.println("La suma de estos 2 numero es: "+Resultado);
             break;
            case 2:
             Resultado=num1-num2;
             if (num1>=num2)
             System.out.println("La Resta de estos 2 numero es: "+Resultado);
             
             System.out.println("El numero no puedo dar menos de 0");
            
             break;
            case 3:
             Resultado=num1*num2;
             System.out.println("La Multiplicacion de estos 2 numero es: "+Resultado);

             break;
            case 4:
             Resultado=num1/num2;
             if (num2 > 0){
             System.out.println("La Division de estos 2 numero es: "+Resultado);
             
             System.out.println("El numero tiene que ser mayor de 0");
             break;
            }

            
         default:
         System.out.println("Verifique la opcion elegida");  
            
        }
        obj.close();
   }
}
