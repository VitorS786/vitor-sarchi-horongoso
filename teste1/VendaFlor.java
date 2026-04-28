package atv;

public class VendaFlor {
	
	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	
	
	public VendaFlor(String nomeFlor, double preco, String nomeCliente) {
		this.nomeFlor = nomeFlor;
		this.preco = preco;
		this.nomeCliente = nomeCliente;
	}
			public String getNomeFlor() {
				return nomeFlor;
			}
			
			public double getPreco() {
				return preco;
				
			}
			
			public String getNomeCliente() {
				return nomeCliente;
			}
			
			
			
			public String toString() {
				return "Flor : " + nomeFlor + "Preço :" + preco + "Nome do Cliente : " + nomeCliente;
			}
		
	}


