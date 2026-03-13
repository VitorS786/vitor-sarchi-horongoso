package revisão;
import java.util.Scanner;

public class atv_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        double altura;

        int numeroMaisAlto = 0;
        int numeroMaisBaixo = 0;

        double maiorAltura = 0;
        double menorAltura = 0;
        double somaAlturas = 0;

        int quantidade = 0;

        while (true) {

            System.out.print("Digite o número de inscrição (0 para encerrar): ");
            numero = sc.nextInt();

            if (numero == 0) {
                break; 
            }

            System.out.print("Digite a altura do atleta: ");
            altura = sc.nextDouble();

            if (quantidade == 0) {
                
                maiorAltura = altura;
                menorAltura = altura;
                numeroMaisAlto = numero;
                numeroMaisBaixo = numero;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    numeroMaisAlto = numero;
                }

                if (altura < menorAltura) {
                    menorAltura = altura;
                    numeroMaisBaixo = numero;
                }
            }

            somaAlturas += altura;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = somaAlturas / quantidade;

            System.out.println("\nQuantidade de atletas cadastrados: " + quantidade);
            System.out.println("Atleta mais alto: Inscrição " + numeroMaisAlto + 
                               " - Altura " + maiorAltura);
            System.out.println("Atleta mais baixo: Inscrição " + numeroMaisBaixo + 
                               " - Altura " + menorAltura);
            System.out.println("Altura média do grupo: " + media);
        } else {
            System.out.println("Nenhum atleta foi cadastrado.");
        }

        sc.close();
    }
}