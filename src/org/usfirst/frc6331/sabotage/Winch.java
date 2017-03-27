package org.usfirst.frc6331.sabotage;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Winch {
	public static void winch() {
		

	    /**
	     * Calling the button.
	     */
	    boolean rightBump = Constants.driveStick.getRawButton(6);
	    
	    /**
	     * Local variable.
	     */
	    double winchSpeed = Constants.winchSpeed;
	    
	    /**
	     * Winch logic.
	     */
	    if(rightBump) {
    		winchSpeed = Constants.winchSpeed;
    		SmartDashboard.putString("Right Bumper", "on");
    	}
	    Constants.winch.set(winchSpeed);
	}
}
