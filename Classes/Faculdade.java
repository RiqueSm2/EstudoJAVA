package Classes;
import Classes.Entidades.*;
import java.util.Scanner;
public class Faculdade {

 public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    Student_FACULDADE stu = new Student_FACULDADE();

    System.out.println("Nome Aluno: ");
    stu.nome = sc.nextLine();
    System.out.println("Nota 1º trimestre:(max 30)");
    stu.nota = sc.nextDouble();

    while (stu.nota > 30 || stu.nota < 0){
    System.out.println("Min é 0 e max é 30 no 1°t");
    stu.nota = sc.nextDouble();
    }
    stu.finalGrade();

    System.out.println("Nota 2º trimestre:(max 35)");
    stu.nota = sc.nextDouble();

    while (stu.nota > 35 || stu.nota < 0) {
    System.out.println("Min é 0 e max é 35 no 2°t");
    stu.nota = sc.nextDouble(); 
    }
    stu.finalGrade();

    System.out.println("Nota 3° trimestre:(max 35)");
    stu.nota = sc.nextDouble();

    while (stu.nota > 35 || stu.nota < 0) {
    System.out.println("Min é 0 e max é 35 no 3°t");
    stu.nota = sc.nextDouble(); 
    }
    stu.finalGrade();
    
    if (stu.finalGrade > 60.00) {
    System.out.printf("FINAL GRADE: %.2f%nPASS", stu.finalGrade);

    } else {
    System.out.printf("FINAL GRADE: %.2f%nFAILED%n", stu.finalGrade);
    stu.missing();
    }



    
 sc.close();

 }   
    
}
