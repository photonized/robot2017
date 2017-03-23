package org.usfirst.frc6331.sabotage;

import java.io.Console;
import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.SafePWM;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * This is a basic FRC robot program that uses Spark Motor Controllers and a tank drive control scheme.
 * It is designed as a basic template for an FRC robot.
 * @author Zack
 */

public class RobotRev extends IterativeRobot {

	Spark leftFrontDrive = new Spark(0);
	Spark rightFrontDrive = new Spark(1);
	Spark rightBackDrive = new Spark(2);
	Spark leftBackDrive = new Spark(3);
	
	Joystick driveStick = new Joystick(0);


	public void teleopPeriodic() {
    	double leftMotorValue =  0.0;
    	double rightMotorValue =  0.0;
    	double driveSpeed = 0.;
    	double DriveSpeedMuli = 0;
    	
    	double CurrRightTrigger;
    	double CurrLeftTrigger;
    	double CurrLeft;
    	double CurrRight;
    	CurrRight = driveStick.getRawAxis(5);
    	CurrLeft = driveStick.getRawAxis(1);
    	
    	CurrRightTrigger = driveStick.getRawAxis(3);
    	CurrLeftTrigger = driveStick.getRawAxis(2);
    	
    	if(CurrRightTrigger > 0)
    	{
    		DriveSpeedMuli = (CurrRightTrigger);
    	
    		//DriveSpeedMuli = DriveSpeedBase - DriveSpeedMuli;
    	}
    	
    	if(CurrLeftTrigger > 0)
    	{
    		DriveSpeedMuli = -CurrLeftTrigger;
    	
    	}
    	
    	//enclose the 2 if statements below into 1 if statement that reads
    	//if leftjoystick x is between 0.1 and -0.1 do NOTHING
    	
    	//if (driveStick.getRawAxis(0) > 0.1 || driveStick.getRawAxis(0) < -0.1)
    	//{
    		if(DriveSpeedMuli > 0)
    		{
    			//leftStickValue = (driveStick.getRawAxis(1)/DriveSpeedMuli) * driveSpeed;
    			//rightStickValue = (driveStick.getRawAxis(5)/DriveSpeedMuli) * driveSpeed;
    			rightMotorValue = (DriveSpeedMuli - (driveStick.getRawAxis(0) * 0.5))*0.5;
    			leftMotorValue = (DriveSpeedMuli + (driveStick.getRawAxis(0) * 0.5))*0.5;
    			rightMotorValue *= -driveSpeed;
    			leftMotorValue *= -driveSpeed;
    		}
    		else if(DriveSpeedMuli < 0)
    		{
    			rightMotorValue = (DriveSpeedMuli - (driveStick.getRawAxis(0)* 0.5))*0.5;
    			leftMotorValue = (DriveSpeedMuli + (driveStick.getRawAxis(0) * 0.5))*0.5;
    			rightMotorValue *= -driveSpeed;
    			leftMotorValue *= -driveSpeed;
    		}
    		{
    		leftFrontDrive.set(-leftMotorValue);
        	leftBackDrive.set(-leftMotorValue);
        	rightFrontDrive.set(rightMotorValue);
        	rightBackDrive.set(rightMotorValue);
	}
	}}
