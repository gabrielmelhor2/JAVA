package exercicio5;
import java.util.*;
public class EXERCICIO5
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       
        int i,z=1;
        float soma=0;
        
        System.out.println("DIGITE AS IDADES: ");
        int vetor[] = new int[z];
        for(i=0;i<z;z++)
        {
            vetor[i] = in.nextInt();
            if (vetor[i]>=0)
            {
               soma += vetor[i];
            }
            if (vetor[i]<0)   
            {
               float media = soma/(z-1);
               System.out.println(media);
               System.exit(0);
             } 
        }   
    }
    
}
