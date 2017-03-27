package org.usfirst.frc6331.sabotage;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Lift {
	public static void lift() {
	       
		/**
		 * Calling the buttons.
		 */
		boolean abutton = Constants.driveStick.getRawButton(1);
    	boolean bbutton = Constants.driveStick.getRawButton(2);
    	
    	/**
    	 * Local variable
    	 */
    	double liftSpeed = Constants.liftSpeed;
    	
    	/**
    	 * Lift motor logic.
    	 */
    	if(bbutton)
    	{
    		liftSpeed = -Constants.liftSpeed;
    		SmartDashboard.putString("B Button", "on");
    	}
    	
    	if(abutton) {
    		liftSpeed = Constants.liftSpeed;
    		SmartDashboard.putString("A Button", "on");
    	}
    	Constants.basketMotor.set(liftSpeed);
	}
}
