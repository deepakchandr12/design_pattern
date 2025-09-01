package design_pattern.strategyPattern;

import design_pattern.strategyPattern.driveStrategy.DriveStrategy;
import design_pattern.strategyPattern.driveStrategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle(DriveStrategy driveStrategy) {
		super(new SportsDrive());
		// TODO Auto-generated constructor stub
	}

}
