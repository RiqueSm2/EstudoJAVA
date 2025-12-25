package BasicoJava;

import java.util.Locale;
import java.util.Scanner;
public class Basico {
 public static void main(String[] args){

/* TODA VARIAVEL EM JAVA DEVE SER INICIALIZADA */
/*
Conversões para declarar nomes no JAVA
CamelCase: exemploVariavel = usado para variaveis e metodos - sempre começa minusculo
PascalCase: ExemploClasse = usado para classes - sempre começa maiusculo
SNAKE_CASE: EXEMPLO_CONSTANTE = usado para constantes - sempre maiusculo e com underline  
*/

 Locale.setDefault(Locale.US);/*Defini a localização para US para separar casas decimais com . */

 /*Criar objeto de entrada de dados */
 Scanner sc = new Scanner(System.in);

 System.out.println("Digite um numero: "); /*saida de dados 'ln' pula para proxima linha*/

 double num = sc.nextDouble(); /*Entrada de dados, deve-se definir o tipo - Int, double ...*/

 System.out.printf("Numero digitado: %.2f%n", num); /*printf para formatar a saída */
                                                           /*%.2f define duas casas decimais - f=float, d=int, s=string...*/
                                                           /*%n pula para a próxima linha */

 sc.close(); /*Fechar o objeto Scanner */                                                          

 }  
    
}
