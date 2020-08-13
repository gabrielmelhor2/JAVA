package exercicio1;
import java.util.*;
public class EXERCICIO1 
{
    public static void main(String[] args)
    {
       int cont_gasolina=0 ,cont_alcool=0 ,cont_diesel=0;
        int num;
        
        do
        {
            Scanner in = new Scanner(System.in);
            
            System.out.println("(1)Alcool (2)Gasolina (3)Diesel (4)Sair ");
            num = in.nextInt();
        
           switch(num)
            {
                case 1:
                    cont_alcool++;
                    break;
                    
                case 2:
                    cont_gasolina++;
                    break;
                    
                case 3:
                    cont_diesel++;
                    break;
                    
                case 4:
                    break;
                    
            }
         
        }while (num != 4);
        
        System.out.println("ALCOOL: " + cont_alcool);
        System.out.println("GASOLINA: " + cont_gasolina);
        System.out.println("DIESEL: " + cont_diesel);
    }
    
}
