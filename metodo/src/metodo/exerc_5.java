//Faça um método que receba três números inseridos pelo usuário, esses números
//serão: um número "base" e mais dois outros números que o usuário inseriu
//Imprima qual dos dois últimos números está mais perto do primeiro número "base"




package metodo;

import java.util.Scanner;

public class exerc_5 {
	
 public static void main(String[] args) {
		 
		 testeP();
		 
	
	

}
 
 
 public static void testeP() {
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("escreva a base  ");
	 int base = input.nextInt();
	 
	 System.out.println("escreva 1 numero, o primeiro sera a base  ");
	 int codigo2 = input.nextInt();
	 
	 System.out.println("escreva 1 numero, o primeiro sera a base  ");
	 int codigo3 = input.nextInt();
	 
	 int dif1 = Math.abs(base - codigo2);
     int dif2 = Math.abs(base -codigo3);
     
     System.out.print("O número mais próximo da base (" + base + ") é: ");
	 
     if (dif1 < dif2) {
         System.out.println(codigo2);
     } else if (dif2 < dif1) {
         System.out.println(codigo3);
     } else {
 }
}
}




    	
