package org.usfirst.frc6331.sabotage;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Gate extends IterativeRobot{
	public static void gate() {
	
	/**
	 * Calling all the buttons.
	 */
	boolean xbutton = Constants.driveStick.getRawButton(3);
	boolean ybutton = Constants.driveStick.getRawButton(4);
    
	/**
	 * Calling the gate motor.
	 */
	Victor liftGate = new Victor(5);
	
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
	
	liftGate.set(gateSpeed);
	}

}
