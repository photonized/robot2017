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

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
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
    
    Victor leftFrontDrive = new Victor(1);
    Victor leftBackDrive = new Victor(0);
    Victor rightFrontDrive = new Victor(3);
    Victor rightBackDrive = new Victor(2);
    Victor basketMotor = new Victor(4);
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    	//double CurrLeftTrigger;
    	double CurrRightTrigger;
    	double CurrLeft;
    	double CurrRight;
    	double DriveSpeedBase;
    	double DriveSpeedMuli;
    	
    	DriveSpeedBase = 2.5;
    	
    	CurrRight = driveStick.getRawAxis(5);
    	CurrLeft = driveStick.getRawAxis(1);
    	
    	CurrRightTrigger = driveStick.getRawAxis(3);
    	
    	DriveSpeedMuli = 0;
    	
    	if(CurrRightTrigger > 0)
    	{
    		DriveSpeedMuli = (CurrRightTrigger) * 2.0;
    	
    		DriveSpeedMuli = DriveSpeedBase - DriveSpeedMuli;
    	}
    	
    	boolean abutton = driveStick.getRawButton(1);
    	boolean bbutton = driveStick.getRawButton(2);
    	
    	SmartDashboard.putString("DB/String 0", "CurrRight:" + Double.toString(CurrRight));
    	SmartDashboard.putString("DB/String 1", "CurrLeft:" + Double.toString(CurrLeft));
    	SmartDashboard.putString("DB/String 2", "CurrRightTrigger:" + Double.toString(CurrRightTrigger));
    	SmartDashboard.putString("DB/String 3", "DriveSpeedMuli:" + Double.toString(DriveSpeedMuli));
    	double liftMotor = 0.0;
    	
    	//DigitalInput di1 = new DigitalInput(1);
    	//DigitalInput di2 = new DigitalInput(2);
    	
    	
    	
    	
    	if(abutton)
    	{
    		//if(!di1.get())
    			liftMotor = 1.0;
    		SmartDashboard.putString("DB/String 4", "ButtonA:On");
    	}
    	else
    	{
    		SmartDashboard.putString("DB/String 4", "ButtonA:off");
    	}
    	
    	if(bbutton)
    	{
    		//if(!di2.get())
    			liftMotor = -1.0;
    		SmartDashboard.putString("DB/String 5", "ButtonB:On");
    	}
    	else
    	{
    		SmartDashboard.putString("DB/String 5", "ButtonB:off");
    	}
    	
    	double leftStickValue =  0.0;
    	double rightStickValue =  0.0;
    	
    	if((CurrLeft > 0.95 || CurrLeft < -0.95) || (CurrRight > 0.95 || CurrRight < -0.95))
    	{
    		if(DriveSpeedMuli > 0)
    		{
    			leftStickValue = driveStick.getRawAxis(1)/DriveSpeedMuli;
    			rightStickValue = driveStick.getRawAxis(5)/DriveSpeedMuli;
    		}
    	}
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
   
    	
    	leftFrontDrive.set(-leftStickValue);
    	leftBackDrive.set(-leftStickValue);
    	rightFrontDrive.set(rightStickValue);
    	rightBackDrive.set(rightStickValue);
    	basketMotor.set(liftMotor);
    }
    
    
    
}
