package BasicoJava.Classes.Entidades;

public class Employee_EMPRESA {

 public String name;
 public Double grossSalary;
 public Double tax;


 public double netSalary(){
 return grossSalary - tax; }

 public void IncreaseSalary(double percentage){
     grossSalary += grossSalary * (percentage/100);
 }

 public String toString(){ /*Sobrescrevendo a classe Object com o metodo toString */
  return "Update data: "  /*O toString() transforma a classe em uma string */
         + name + " R$"
         + String.format("%.2f", grossSalary - tax); /*Para formatar o valor com duas casas decimais */
  

 }

}
 
