package templetMethod;

public class ClassicalCarStertingSequence extends CarStartingSequence {

	@Override
	public void setTheGear() {
		System.out.println("Ustawiam bieg");
	}

	@Override
	public void startTheIgnition() {
		System.out.println("Przekrecam kluczyk");
	}

}
