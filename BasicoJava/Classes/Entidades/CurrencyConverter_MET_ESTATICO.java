package BasicoJava.Classes.Entidades;

public class CurrencyConverter_MET_ESTATICO {
   
   public static final double IOF = 0.06;
 

   public static double conversao(double dollar_price, double dollar_bought){
       
      
    return dollar_price *dollar_bought;
   }



   public static double valor_IOF (double dollar_price, double dollar_bought){

    return (dollar_price*dollar_bought) * IOF;

   }
   

   public static double conversion_with_IOF(double dollar_price, double dollar_bought){

    double calculo = (dollar_price * dollar_bought) + ((dollar_price * dollar_bought) * IOF);

    return calculo;
   }


}
