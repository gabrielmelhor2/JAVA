package exercicio3;
import java.util.*;
public class EXERCICIO3
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       
       int i,z,x=0;
       
        System.out.print("DIGITE UM NUMERO: ");
        int numero = in.nextInt();
        
            for (i=1;i<=numero;i++)
            {
                z=numero%i;
                if (z==0)
                {
                    if (i<numero) 
                    {
                        x=x+i;
                    }
                }
            }
            if (x==numero)
            {
                System.out.println("O número é perfeito");
            }
            else
            {
                System.out.println("O número não é perfeito");
            }
    }
  
}
