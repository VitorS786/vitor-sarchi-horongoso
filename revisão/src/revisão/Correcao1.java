package revisão;

import java.util.Scanner;

public class Correcao1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu numero de matricula");
		String numeroMatricula = input.next();
		
		
		System.out.println("Insira seu nome");
		String nome = input.next();
		
		System.out.println("Insira a quantidade de horas trabalhadas");
		double horasTrabalhadasSemana = input.nextDouble();
		
		System.out.println("Insira seu salario por hora");
		double salarioHora = input.nextDouble();
		
		
		double horasMensais = horasTrabalhadasSemana * 4;
		
		double salarioMensal = horasMensais * 4 * salarioHora;
		
		System
		
		

	}

}
