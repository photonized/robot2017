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
	
	/**
	 * Joystick port
	 */
	public static Joystick driveStick = new Joystick(0);
	
	/**
	 * The speed of the robot.
	 */
	public static double driveSpeed = 1.0;

	/**
	 * Calling the motors for the drive train.
	 */
	public static Victor leftBackDrive = new Victor(0);
    public static Victor leftFrontDrive = new Victor(1);
    public static Victor rightFrontDrive = new Victor(3);
    public static Victor rightBackDrive = new Victor(2);
    
	/**
	 * The speed of the winch.
	 */
	public static double winchSpeed = 1.0;
	
	/**
	 * Calling the winch motor.
	 */
    public static Victor winch = new Victor(7);

	/**
	 * The speed of the lift.
	 */
	public static double liftSpeed = 0.8;
	
	/**
	 * Calling the basket motor.
	 */
	public static Victor basketMotor = new Victor(4);

	/**
	 * The speed of the gate.
	 */
	public static double gateSpeed = 1.0;
	
	/**
	 * Calling the gate motor.
	 */
	public static Victor liftGate = new Victor(5);
	
	/**
	 * How long the forward goes.
	 */
	public static int autoForwardLength = 4000;
	
	/**
	 * Autonomous speed
	 */
	public static double autoSpeed = 0.5;
	
}
