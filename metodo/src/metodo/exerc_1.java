package metodo;

import java.util.Scanner;

public class exerc_1 {
	
	 public static void main(String[] args) {
		 
		 estacaoAno();
		 
		 	                                                                          
	 }

	 
	 
	 public static void estacaoAno() {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("1  verão, 2  outono,3  primavera, 4  enverno");
		 int codigo = input.nextInt();
		 
		 
         if (codigo == 1) {
        	 System.out.println("1 sendo verão") ;
          
	 }
         if (codigo == 2) {
        	 System.out.println("2 sendo outono") ;
          
	 }
         if (codigo == 3) {
        	 System.out.println("3 sendo primavera") ;
          
	 }
         else  {
        	 System.out.println("4 sendo inverno") ;
          
	 }
         
	 
}
}
