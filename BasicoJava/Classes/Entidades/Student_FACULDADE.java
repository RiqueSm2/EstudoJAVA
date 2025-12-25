package BasicoJava.Classes.Entidades;

public class Student_FACULDADE {
  
   public String nome;
   public double nota;
   public Double finalGrade = 0.0;
 
   
/*Quando não preciso utilizar um valor, apenas executar uma ação, posso usar o void*/
 public void finalGrade(){
    this.finalGrade += nota;
    nota = 0;
 }

 public void missing(){
   double mis = 100 - finalGrade;
   System.out.printf("MISSING %.2f POINTS", mis);
 }





}
