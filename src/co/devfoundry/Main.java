package co.devfoundry;

import templetMethod.AutomaticTransmitionSttartingSequence;
import templetMethod.CarStartingSequence;
import templetMethod.ClassicalCarStertingSequence;

public class Main {
	public static void main(String[] args) {
		ClassicalCarStertingSequence classicalCarStertingSequence = new ClassicalCarStertingSequence();
		classicalCarStertingSequence.StartTheCar();
		System.out.println("************************");
		AutomaticTransmitionSttartingSequence automaticTransmitionSttartingSequence=new AutomaticTransmitionSttartingSequence();
		automaticTransmitionSttartingSequence.StartTheCar();
		
		
		
	}

}
