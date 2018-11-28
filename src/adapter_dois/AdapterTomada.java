package adapter_dois;

/*
 * Aqui n�s temos como entrada uma tomada de dois pinos mas queremos na verdade conectar a uma tomada de tr�s pinos como sa�da.
 * O adaptador far� essa tarefa aceitando como entrada dois pinos, mas apresentando como sa�da a tomada de tr�s pinos, 
 * conforme � poss�vel observar no m�todo ligarNaTomadaDeDoisPinos() herdada da classe TomadaDeDoisPinos. .
 */
public class AdapterTomada extends TomadaDeDoisPinos {
	private TomadaDeTresPinos tomadaDeTresPinos;
	
	public AdapterTomada (TomadaDeTresPinos tomadaDeTresPinos) {
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}
	
	public void ligarNaTomadaDeDoisPinos() {
		tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	}
}
