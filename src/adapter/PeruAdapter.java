package adapter;

/*
 * Adapta��o da classe PeruAustraliano. Aqui n�s implementamos o comportamento de um pato, mas na verdade queremos adaptar esse comportamento
 * para o de um Peru. Por isso, � feita a composi��o com peru para que na verdade o comportamento seja a de um Peru, mesmo que implementado um Pato.
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
		throw new UnsupportedOperationException("M�todo mergulho() n�o suportado por Perus.");
	}

}
