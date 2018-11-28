package adapter;

/*
 * Adaptação da classe PeruAustraliano. Aqui nós implementamos o comportamento de um pato, mas na verdade queremos adaptar esse comportamento
 * para o de um Peru. Por isso, é feita a composição com peru para que na verdade o comportamento seja a de um Peru, mesmo que implementado um Pato.
 */

public class PeruAdapter implements Pato {
	private Peru peru;
	
	public PeruAdapter(Peru peru) {
		this.peru = peru;
	}

	@Override
	public void grasnar() {
		peru.soar();		
	}

	@Override
	public void voar() {
		peru.voar();
	}

	@Override
	public void mergulho() {
		throw new UnsupportedOperationException("Método mergulho() não suportado por Perus.");
	}

}
