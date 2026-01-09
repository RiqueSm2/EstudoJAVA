package Funcoes;
import java.util.Scanner;

public class Funcoes {
       public static void main(String[] args) {

    /*Funções - Blocos de código que realizam uma tarefa específica, podendo ou não retornar um valor */
    
    Scanner sc = new java.util.Scanner(System.in);

    System.out.println("informe tres numeros: ");
    int a = sc.nextInt();
    int b = sc.nextInt(); 
    int c = sc.nextInt();

    int higher = max(a, b, c); /*chamando a função max e jogando o resultado na variavel higher */

    showResult(higher);/*Chmando a função showResult */

    sc.close();

        
    }
  /*Declarar apos o void main*/

   /*função que retorna o maior valor entre tres numeros inteiros */
  public static int max(int x, int y, int z) { /*Os parametro não precisam ter o mesmo nome das variaveis */
    int aux;
    if (x > y && x > z) {
      aux = x;
    } else if (y > z) {
      aux = y;
    } else {
      aux = z;
    }
    return aux; /*retornando o maior valor */
  }


   /*Void não retorna valor */
  public static void showResult(int value) {
    System.out.println("HIgher: " + value);
  }
    
}
