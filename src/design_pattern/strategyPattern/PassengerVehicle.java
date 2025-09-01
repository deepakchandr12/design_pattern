package design_pattern.strategyPattern;

import design_pattern.strategyPattern.driveStrategy.DriveStrategy;
import design_pattern.strategyPattern.driveStrategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle(DriveStrategy driveStrategy) {
		super(new NormalDrive());
		// TODO Auto-generated constructor stub
	}

}
