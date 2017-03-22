// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc6331.sabotage;

import java.io.Console;
import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.SafePWM;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * @author Vlad
 * 
 */
public class Robot extends IterativeRobot {

    Joystick driveStick = new Joystick(0);
    //Joystick shootStick = new Joystick(2);
    //RobotDrive mainDrive = new RobotDrive(1, 2, 3, 4);
   
    Spark leftBackDrive = new Spark(0);
    Spark leftFrontDrive = new Spark(1);
    Spark rightFrontDrive = new Spark(3);
    Spark rightBackDrive = new Spark(2);
 
   
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
     */
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    	//double CurrLeftTrigger;
    	double CurrRightTrigger;
    	double CurrLeftTrigger;
    	double CurrLeft;
    	double CurrRight;
    	//double DriveSpeedBase;
    	double DriveSpeedMuli;
    	
    	//DriveSpeedBase = 2.5;
    	
    	CurrRight = driveStick.getRawAxis(5);
    	CurrLeft = driveStick.getRawAxis(1);
    	
    	CurrRightTrigger = driveStick.getRawAxis(3);
    	CurrLeftTrigger = driveStick.getRawAxis(2);
    	
    	DriveSpeedMuli = 0;
    	
    	if(CurrRightTrigger > 0)
    	{
    		DriveSpeedMuli = (CurrRightTrigger);
    	
    		//DriveSpeedMuli = DriveSpeedBase - DriveSpeedMuli;
    	}
    	
    	if(CurrLeftTrigger > 0)
    	{
    		DriveSpeedMuli = -CurrLeftTrigger;
    	
    	}
    	
    	SmartDashboard.putString("CurrRight", Double.toString(CurrRight));
    	SmartDashboard.putString("CurrLeft", Double.toString(CurrLeft));
    	SmartDashboard.putString("CurrRightTrigger", Double.toString(CurrRightTrigger));
    	SmartDashboard.putString("DriveSpeedMuli", Double.toString(DriveSpeedMuli));
    		
    	double leftMotorValue =  0.0;
    	double rightMotorValue =  0.0;
    	double driveSpeed = 0.;
    	
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
    	//}
    	
    	/*if((CurrLeft > .80 & CurrRight > .80) || (CurrLeft < -.80 & CurrRight < -.80))
    	{
    		leftStickValue = driveStick.getRawAxis(1)/.5;
    		rightStickValue = driveStick.getRawAxis(5)/.5;
    	}
    	else
    	{
    		leftStickValue = driveStick.getRawAxis(1)/2.0;
    		rightStickValue = driveStick.getRawAxis(5)/2.0;
    	}
    	/*
        /*mainDrive.mecanumDrive_Cartesian(driveStick.getAxis(Joystick.AxisType.kX),
        driveStick.getAxis(Joystick.AxisType.kY),
        driveStick.getAxis(Joystick.AxisType.kZ), 0);
        mainDrive.tankDrive(driveStick,driveStick );*/
    	/*
    	SmartDashboard.putString("DB/String 0", "leftstick:" + Double.toString(leftStickValue));
    	SmartDashboard.putString("DB/String 1", "right stick:" + Double.toString(rightStickValue));
    	SmartDashboard.putString("DB/String 2", "lift:" + Double.toString(liftMotor));
    	SmartDashboard.putString("DB/String 3", "gate:" + Double.toString(gateMotor));
    	*/
    	
    	leftFrontDrive.set(-leftMotorValue);
    	leftBackDrive.set(-leftMotorValue);
    	rightFrontDrive.set(rightMotorValue);
    	rightBackDrive.set(rightMotorValue);
 
    }
      
}

