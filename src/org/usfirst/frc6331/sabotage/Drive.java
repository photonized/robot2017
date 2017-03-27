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

public class Drive extends IterativeRobot{
    
    public static void drive() {
    	
    	
        /**
         * The buttons being called.
         */
    	double DriveSpeedMulti = 0;
    	double leftX = Constants.driveStick.getRawAxis(0);
    	double CurrRightTrigger = Constants.driveStick.getRawAxis(3);
    	double CurrLeftTrigger = Constants.driveStick.getRawAxis(2);
    	boolean leftBump = Constants.driveStick.getRawButton(5);
    	double leftMotorValue =  0.0;
    	double rightMotorValue =  0.0;
    	double driveSpeed = 1.0;

    	
    	/**
    	 * Drive depending on triggers and bumpers.
    	 */
    	if(CurrRightTrigger > 0)
    	{
    		DriveSpeedMulti = (CurrRightTrigger);
    	
    	}
    	
    	if(CurrLeftTrigger > 0)
    	{
    		DriveSpeedMulti = -CurrLeftTrigger;
    	
    	}
		if (leftBump) {
    		DriveSpeedMulti = -0.3;	
    	}
		
		/**
		 * Driving logic.
		 */
		if(DriveSpeedMulti > 0)
		{
			//leftStickValue = (driveStick.getRawAxis(1)/DriveSpeedMulti) * driveSpeed;
			//rightStickValue = (driveStick.getRawAxis(5)/DriveSpeedMulti) * driveSpeed;
			rightMotorValue = (driveSpeed * DriveSpeedMulti) - (leftX * 0.5);
			leftMotorValue = (driveSpeed * DriveSpeedMulti) + (leftX * 0.5);
			/*rightMotorValue = (DriveSpeedMulti - (leftX * 0.5))*0.5;
			leftMotorValue = (DriveSpeedMulti + (leftX * 0.5))*0.5;
			rightMotorValue *= -driveSpeed;
			leftMotorValue *= -driveSpeed;*/
		}
		else if(DriveSpeedMulti < 0)
		{
			rightMotorValue = (driveSpeed * DriveSpeedMulti) - (leftX * 0.5);
			leftMotorValue = (driveSpeed * DriveSpeedMulti) + (leftX * 0.5);
			/*rightMotorValue = (DriveSpeedMulti - (leftX* 0.5))*0.5;
			leftMotorValue = (DriveSpeedMulti + (leftX * 0.5))*0.5;
			rightMotorValue *= -driveSpeed;
			leftMotorValue *= -driveSpeed;*/
		}
		
		/**
		 * Setting the motors to their variables.
		 */
		Constants.leftFrontDrive.set(-leftMotorValue);
    	Constants.leftBackDrive.set(-leftMotorValue);
    	Constants.rightFrontDrive.set(rightMotorValue);
    	Constants.rightBackDrive.set(rightMotorValue);
    }
    
}
