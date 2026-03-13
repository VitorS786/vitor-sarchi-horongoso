package metodo;
import java.util.Scanner;

public class exerc_2 {

    public static void Vitor() {
        System.out.println("O nome dele é Vitor");
        System.out.println("Ele tem ... anos");
        System.out.println("Ele é estudante de Desenvolvimento de Sistemas");
        
    }
    public static void Lucas() {
        
        System.out.println("O nome dele é Lucas");
        System.out.println("Ele tem 18 anos");
        System.out.println("Ele é estudante de Desenvolvimento de Sistemas");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa");
        String nome = input.next();
        
        if(nome.equals("Lucas")) {
            Lucas();
        } else if(nome.equals("Vitor")){
            Vitor();
        }
    }
    
}