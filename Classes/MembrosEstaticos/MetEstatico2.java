package Classes.MembrosEstaticos;
import Classes.Entidades.Calculator_MET_ESTATICO2;
import java.util.Scanner;

public class MetEstatico2 {

    public static void main(String[] args){
      
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter radius: ");
     double radius = sc.nextDouble();

     double c = Calculator_MET_ESTATICO2.circumference(radius); /*Como o volume e a circunferencia são membros estaticos, não é necessário instanciar o objeto Calculator*/               
                                                 /*Util para métodos que não alteram dados, como por exemplo o Math.sqrt() */
     double v = Calculator_MET_ESTATICO2.volume(radius);

     System.out.printf("Circumference: %.2f%n", c);
     System.out.printf("Volume: %.2f%n", v);
     System.out.printf("PI value: %.2f%n", Calculator_MET_ESTATICO2.PI);

        sc.close();

    }
    
}