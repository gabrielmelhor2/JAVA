package exercicio4;
import java.util.*;
public class EXERCICIO4 
{

    public static void main(String[] args)
    {
       int num;
        int vetor[];
        int m_numero;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite Tamanho do Vetor: ");
        num = in.nextInt();
        
        vetor = new int[num];
        
        for (int i = 0; i < vetor.length; i++)
        {
          vetor[i] = in.nextInt();
        }
        
        m_numero = vetor[0];
        
        for (int i = 1;i<vetor.length;i++)
        {
            if (vetor[i]<m_numero)
            {
                m_numero = vetor[i];
            }
        }
       System.out.println("Menor Numero: " + m_numero); 
    }
    
}
