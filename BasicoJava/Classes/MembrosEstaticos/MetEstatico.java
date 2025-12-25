package BasicoJava.Classes.MembrosEstaticos;


import BasicoJava.Classes.Entidades.CurrencyConverter;
import java.util.Scanner;

public class exMetEstatico {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the dollar price? ");
    double price = sc.nextDouble();
    System.out.println("How many dollar wil be bought? ");
    double bought = sc.nextDouble();

    System.out.printf("Amount excluding tax: %.2f%n", CurrencyConverter.conversao(price, bought));

    System.out.printf("Amount with tax(%.2f): %.2f",CurrencyConverter.valor_IOF(price, bought), CurrencyConverter.conversion_with_IOF(price, bought));
    sc.close();
    
}
}