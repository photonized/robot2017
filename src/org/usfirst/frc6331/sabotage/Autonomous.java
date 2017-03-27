package org.usfirst.frc6331.sabotage;

public class Autonomous {
	public static void autoInit() {
    	try {
    		Constants.leftBackDrive.set(0.5);
         	Constants.leftFrontDrive.set(0.5);
         	Constants.rightFrontDrive.set(-0.5);
         	Constants.rightBackDrive.set(-0.5);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Constants.leftBackDrive.set(0.0);
    	Constants.leftFrontDrive.set(0.0);
    	Constants.rightFrontDrive.set(0.0);
    	Constants.rightBackDrive.set(0.0);
	}
}
