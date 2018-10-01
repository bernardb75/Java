package templetMethod;

abstract public class CarStartingSequence {

	public final void StartTheCar() {
		fastenSitBelth();
		startTheIgnition();
		setTheGear();
		go();

	}

	private void go() {
		System.out.println("Wciskamy gaz");
	}

	public abstract void setTheGear();
	public abstract void startTheIgnition();

	private void fastenSitBelth() {
		System.out.println("Zapinamy pasy");
	}
}
