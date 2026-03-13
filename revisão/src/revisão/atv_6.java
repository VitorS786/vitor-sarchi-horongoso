package revisão;
import java.util.Scanner;

public class atv_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a massa inicial em Kg: ");
        double massaInicialKg = sc.nextDouble();

        double massa = massaInicialKg * 1000; 
        double massaInicialGramas = massa;

        int tempo = 0;

        while (massa >= 0.5) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.println("\nMassa inicial: " + massaInicialGramas + " g");
        System.out.println("Massa final: " + massa + " g");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        sc.close();
    }
}