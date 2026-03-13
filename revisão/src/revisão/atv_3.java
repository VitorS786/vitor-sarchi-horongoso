package revisão;
import java.util.Locale;
import java.util.Scanner;

public class atv_3 {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
         
        
        System.out.println("Insira seu nome");
           String nome = input.next();
           
           
          System.out.println("Insira sua altura");
         double altura = input.nextDouble();
       
       
       System.out.println("Insira sua massa ");
       double massa = input.nextDouble();
       
       
      
       
       double IMC = massa / (altura*altura);
       
       if (IMC < 18.5) {
           System.out.println("Magreza");
       } else if (IMC <= 24.9) {
           System.out.println("Saudável");
       } else if (IMC <= 29.9) {
           System.out.println("Sobrepeso");
       } else if (IMC <= 34.9) {
           System.out.println("Obesidade Grau I");
       } else if (IMC <= 39.9) {
           System.out.println("Obesidade Grau II (severa)");
       } else {
           System.out.println("Obesidade Grau III (mórbida)");
       }
           
    
       
     
       
       System.out.printf("......"+ IMC);
        

    }

}