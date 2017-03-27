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

public class Constants extends IterativeRobot {
	
	public static Joystick driveStick = new Joystick(0);
	
	public static double driveSpeed = 1.0;
	
	public static double winchSpeed = 1.0;
	
	public static double liftSpeed = 0.8;
	
	public static double gateSpeed = 1.0;

	public static Victor leftBackDrive = new Victor(0);
    public static Victor leftFrontDrive = new Victor(1);
    public static Victor rightFrontDrive = new Victor(3);
    public static Victor rightBackDrive = new Victor(2);
}
