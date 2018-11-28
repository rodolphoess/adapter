package adapter_dois;

/*
 * Aqui nós temos uma tomada de dois pinos mas queremos na verdade conectar a uma tomada de três pinos.
 * O adaptador fará essa tarefa aceitando como entrada dois pinos, mas apresentando como saída a tomada de três pinos.
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
