package co.szablon;

abstract public class MetodaSzablonowa {

	public final void dzienPracy(TransportType transportType) {
		pobudka();
		getReady();
		int time = goToWork(transportType);
		summary(time);
		work();
		powrotDoDomu();
	}

	protected abstract void work();

	private void summary(int time) {
		System.out.println("Czas do pracy: " + time + " minut");
	}

	protected abstract int goToWork(co.szablon.TransportType transportType);

	private void getReady() {
		System.out.println("Przygotowanie do wyjœcia");
	}

	private void powrotDoDomu() {
		System.out.println("Wróæ do domu");
	}

	private void pobudka() {
		System.out.println("Czas wstaæ");
	}

	

}
