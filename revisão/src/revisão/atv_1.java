package revisão;
import java.util.Scanner;


public class atv_1 {
    
    

    public static void main(String[] args) {
        
             Scanner input = new Scanner(System.in);
             
              System.out.println("Insira numero matricula");
             int codigo = input.nextInt();
            
            System.out.println("Insira seu nome");
            String nome = input.next();
            
            System.out.println("Insira  horas trabalhadas ");
            double horas = input.nextDouble();
            
            System.out.println("Insira   valor que recebe por hora ");
            double horasR = input.nextDouble();
            
            
            
            double SalarioMensal = (horas * horasR) * 4;
            
            
            
            
            System.out.printf("Matrícula: Nome: Salário mensal: ", codigo, nome, SalarioMensal);

    }

}