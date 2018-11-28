package adapter;

public class ClientePato {
	
	public static void main(String[] args) {
		PatoMarreco pato = new PatoMarreco();
		PeruAustraliano peru = new PeruAustraliano();
		
		PeruAdapter peruAdapter = new PeruAdapter(peru);
		Pato[] patos = {pato, peruAdapter};
		
		for (Pato p : patos) {
			p.grasnar();
			System.out.println();
			p.voar();
			System.out.println();
		}
	}
}
