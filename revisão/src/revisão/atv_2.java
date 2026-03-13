package revisão;
import java.util.Scanner;
import java.util.Locale;

public class atv_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
         
        
        System.out.println("Insira seu nome");
           String nome = input.next();
           
           
          System.out.println("Insira salario fixo");
         double salario = input.nextDouble();
       
       
       System.out.println("Insira total de vendas ");
       double totalV = input.nextDouble();
       
       
       
       
       double SalarioMensal = salario + (totalV*0.15);
       
       
       
       
       System.out.printf("......"+ SalarioMensal);

        

    }

}