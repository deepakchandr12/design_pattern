package design_pattern.strategyPattern;

import design_pattern.strategyPattern.driveStrategy.DriveStrategy;

public class Vehicle {
	private DriveStrategy driveObj;
	Vehicle(DriveStrategy driveStrategy) {
		this.driveObj = driveStrategy;
	}
	public void drive() {
		driveObj.drive();
	}
}
