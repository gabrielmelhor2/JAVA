package exercicio2;
import java.util.*;
public class EXERCICIO2 
{
    public static void main(String[] args)
    {
         int num,resultado=0;
        int divisor;
        
        Scanner in = new Scanner(System.in);
       
        System.out.print("Digite Um Numero: ");
        num = in.nextInt();
        
        do
        {
           for ( divisor = 1; divisor <= num ; divisor++)
            {
               resultado = num % divisor;
              if ( resultado == 0)
               {
                  System.out.println(divisor);
               }
            }
                
        }while(divisor < num);
    }
    
}
