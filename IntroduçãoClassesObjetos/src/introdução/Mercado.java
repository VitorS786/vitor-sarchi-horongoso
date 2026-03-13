package introdução;

import java.util.Scanner;

public class Mercado {
		
	String nomeMercado;
    int macaVendidaAno;
    double precoMaca;
    int laranjaVendidaAno;
    double precoLaranja;
	
    public double receitaMacas() {
        return macaVendidaAno * precoMaca;
       
        
    }
    
    public double receitaLaranjas() {
        return macaVendidaAno * precoLaranja;
       
        
    }
    
    public double segundaLaranja() {
        return macaVendidaAno * precoLaranja;
       
        
    }
    
    public double segundaMacas() {
        return macaVendidaAno * precoMaca;
       
        
    }
	
}
