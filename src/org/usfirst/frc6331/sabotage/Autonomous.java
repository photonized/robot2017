package org.usfirst.frc6331.sabotage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Autonomous extends IterativeRobot{
	public static void autoInit() {
    	try {
    		Constants.leftBackDrive.set(Constants.autoSpeed);
         	Constants.leftFrontDrive.set(Constants.autoSpeed);
         	Constants.rightFrontDrive.set(-Constants.autoSpeed);
         	Constants.rightBackDrive.set(-Constants.autoSpeed);
			Thread.sleep(Constants.autoForwardLength);
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
