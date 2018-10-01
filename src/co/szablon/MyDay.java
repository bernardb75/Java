package co.szablon;

public class MyDay extends MetodaSzablonowa {

	@Override
	protected void work() {
		System.out.println("No to pracujemy...........");
	}

	@Override
	protected int goToWork(TransportType transportType) {
		switch (transportType) {
		case BIKE:
			return 15;
		case CAR:
			return 5;
		case TRAM:
			return 30;
		default:
			return 20;
		}

	}

}
