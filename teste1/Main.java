package atv;

public class Main {

	public static void main(String[] args) {
		
		 organizarPlanta op = new organizarPlanta();
		 
		 op.adicionarVenda(new VendaFlor("Rosa",10,"João"));
		 op.adicionarVenda(new VendaFlor("Tulipa",15,"Maria"));
		 op.adicionarVenda(new VendaFlor("Orquídea",30,"João"));
		 
		 System.out.println(op.buscarPorCliente("João"));
			
		
	}
}
