package org.usfirst.frc6331.sabotage;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Gate extends IterativeRobot{
	public static void gate() {
	
	/**
	 * Calling all the buttons.
	 */
	boolean xbutton = Constants.driveStick.getRawButton(3);
	boolean ybutton = Constants.driveStick.getRawButton(4);
    
	
	/**
	 * Local variable.
	 */
	double gateSpeed = Constants.gateSpeed; 
	
	if(xbutton) {
		gateSpeed = Constants.gateSpeed;
		SmartDashboard.putString("X Button", "on");
	}
	
	if(ybutton){ 
		gateSpeed = -Constants.gateSpeed;
		SmartDashboard.putString("Y Button", "on");
		}
	
	Constants.liftGate.set(gateSpeed);
	}

}
