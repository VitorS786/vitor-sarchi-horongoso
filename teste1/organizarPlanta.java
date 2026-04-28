package atv;
import java.util.ArrayList;
import java.util.List;

public class organizarPlanta {
	
	private List<VendaFlor>vendas;
	
	public organizarPlanta() {
		vendas = new ArrayList<>();
	}
	
	public void adicionarVenda(VendaFlor v) {
		vendas.add(v);
	}
	
	public List<VendaFlor> buscarPorCliente(String nomeCliente) {
		List<VendaFlor>resultado= new ArrayList<>();
		
		for (VendaFlor v : vendas) {
			if (v.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
				resultado.add(v);
			}
			
		}
		return resultado; 
	}
	
	
}
