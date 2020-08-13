package exercicio6;
import java.util.*;
public class EXERCICIO6 
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int valor,n100,n50,n20,n10,n5,n2,n1;
        
        System.out.println("Digite o valor: ");
        valor = in.nextInt();
        
            n100 = (valor/100);
            valor = valor-(n100*100);    
            n50 = (valor/50);
            valor = valor-(n50*50);
            n20 = (valor/20);
            valor = valor-(n20*20);
            n10 = (valor/10);
            valor = valor-(n10*10);
            n5 = (valor/5);
            valor = valor-(n5*5);
            n2 = (valor/2);
            valor = valor-(n2*2);
            n1 = (valor/1);
            valor = valor-(n1*1);
            System.out.println("Cédulas");
            System.out.println("100: "+n100+"\n50: "+n50+"\n20: "+n20+"\n10: "
            +n10+"\n5: "+n5+"\n2: "+n2+"\n1: "+n1);    
    }
    
}
