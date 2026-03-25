package introdução;

import java.util.Scanner;

public class ExemploM {
	public static void main(String[] args) {
		Mercado unidadeDeBlumenau = new Mercado();
        
        unidadeDeBlumenau.nomeMercado = "Mercado Blumenau";
        unidadeDeBlumenau.macaVendidaAno = 3000;
        unidadeDeBlumenau.precoMaca = 1.20;
        unidadeDeBlumenau.laranjaVendidaAno = 4000;
        unidadeDeBlumenau.precoLaranja = 1.00;
        
        Mercado unidadeDeJoinville = new Mercado();
        
        unidadeDeJoinville.nomeMercado = "Mercado Joinville";
        unidadeDeJoinville.macaVendidaAno = 5000;
        unidadeDeJoinville.precoMaca = 1.10;
        unidadeDeJoinville.laranjaVendidaAno = 3000;
        unidadeDeJoinville.precoLaranja = 1.50;
        
        Mercado unidadeDeFlorianopolis = new Mercado();
        
        unidadeDeFlorianopolis.nomeMercado = "Mercado Floripa";
        unidadeDeFlorianopolis.macaVendidaAno = 7000;
        unidadeDeFlorianopolis.precoMaca = 0.50;
        unidadeDeFlorianopolis.laranjaVendidaAno = 6500;
        unidadeDeFlorianopolis.precoLaranja = 1.25;	
        //pra cima é a 3//
        //abaixo é a 6,junto com a 3//
        
        double r1 = unidadeDeBlumenau.receitaMacas();
        double r2 = unidadeDeJoinville.receitaMacas();
        double r3 = unidadeDeFlorianopolis.receitaMacas();

        Mercado maior = unidadeDeBlumenau;
        
        if (r1 > maior.receitaMacas()) {
            maior = unidadeDeJoinville;
        }


        if (r2 > maior.receitaMacas()) {
            maior = unidadeDeJoinville;
        }

        if (r3 > maior.receitaMacas()) {
            maior = unidadeDeFlorianopolis;
        }

        System.out.println("Maior receita com maçãs: " + maior.nomeMercado);
        
        
        double L1 = unidadeDeBlumenau.receitaLaranjas();
        double L2 = unidadeDeJoinville.receitaLaranjas();
        double L3 = unidadeDeFlorianopolis.receitaLaranjas();

        Mercado menor = unidadeDeBlumenau;

        if (L1 < menor.receitaLaranjas()) {
            menor = unidadeDeJoinville;
        }
        
        if (L2 < menor.receitaLaranjas()) {
            menor = unidadeDeJoinville;
        }

        if (L3 < menor.receitaLaranjas()) {
            menor = unidadeDeFlorianopolis;
        }
        System.out.println("menor receita com laranjas: " + menor.nomeMercado);
        
        
        
        //calculo de Blumenau das maças e laranjas para dps fazer o calculo pra ter o resultado da segunda maior receita
        // supostamente dps usando o if pra sabr segundo maior 
        double B1 = unidadeDeBlumenau.macaVendidaAno * unidadeDeBlumenau.precoMaca;
        double B2 = unidadeDeBlumenau.laranjaVendidaAno * unidadeDeBlumenau.precoLaranja;
        
        
        double J1 = unidadeDeJoinville.macaVendidaAno * unidadeDeJoinville.precoMaca;
        double J2 = unidadeDeJoinville.laranjaVendidaAno * unidadeDeJoinville.precoLaranja;
        
        double F1 = unidadeDeFlorianopolis.macaVendidaAno * unidadeDeFlorianopolis.precoMaca;
        double F2 = unidadeDeFlorianopolis.laranjaVendidaAno * unidadeDeFlorianopolis.precoMaca;
        
        double Soma1 = B1 + B2;
        double Soma2 = J1 + J2;
        double Soma3 = F1 + F2;
        
        		
        if()
        
        
		
}
	

}