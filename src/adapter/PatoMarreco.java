package adapter;

public class PatoMarreco implements Pato {

	@Override
	public void grasnar() {
		System.out.println("Quack, quack, quack.");
	}

	@Override
	public void voar() {
		System.out.println("Voar, voar, voar, voar");
	}

	@Override
	public void mergulho() {
		System.out.println("Pato mergulhando.");
	}

}
