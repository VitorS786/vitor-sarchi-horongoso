package revisão;
import java.util.Scanner;

public class atv_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        if (dia < 1 || dia > 31) {
            System.out.println("Data inválida");
            sc.close();
            return; 
        }

        
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Data inválida");
            sc.close();
            return; 
        }

        
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean bissexto = false;

        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        int diasNoMes = 31;

        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:
                if (bissexto) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
        }

        if (dia > diasNoMes) {
            System.out.println("Data inválida");
        } else {
            System.out.println("Data válida");
        }

        sc.close();
    }
}