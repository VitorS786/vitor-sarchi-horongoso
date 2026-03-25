package atv7;

public class exAeronave {
	public static void main(String[] args) {
	
	Aeronavemetodos Brasil = new Aeronavemetodos ("Yuri", 500, 1000, 400, 9.25);
	Aeronavemetodos Japão = new Aeronavemetodos ("Lucas", 100, 2000, 100, 11.20);
	Aeronavemetodos Cuba = new Aeronavemetodos ("PT", 1, 100, 40, 10);
	Aeronavemetodos China = new Aeronavemetodos ("XING", 10, 10000, 200, 15.99);
	
	Aeronavemetodos listaAeronaves[] = { Brasil, Japão,Cuba,China };
	
	
	
	double maiorPassageiros = 0;
	Aeronavemetodos aeronaveMaiorpassageiros = null;

	for (int i = 0; i < listaAeronaves.length; i++) {
	    if (listaAeronaves[i].getPassageiros() > maiorPassageiros) {
	        maiorPassageiros = listaAeronaves[i].getPassageiros();
	        aeronaveMaiorpassageiros = listaAeronaves[i];
	    }
	}

	System.out.println("A aeronave com mais passageiros é: " 
		    + aeronaveMaiorpassageiros.getModelo());
	
	
	
	double maiorTempo = 0;
	Aeronavemetodos aeronaveTempo = null;

	for (int i = 0; i < listaAeronaves.length; i++) {
	    if (listaAeronaves[i].getTempoDeVoo() > maiorTempo) {
	    	maiorTempo = listaAeronaves[i].getTempoDeVoo();
	    	aeronaveTempo = listaAeronaves[i];
	    }
	}
	
	System.out.println("A aeronave que fica mais tempo no ar é: "
		    + aeronaveTempo.getModelo() +
		    " com " + aeronaveTempo.getTempoDeVoo() + " minutos.");
}
}
