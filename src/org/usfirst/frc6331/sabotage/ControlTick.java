package org.usfirst.frc6331.sabotage;

public class ControlTick {
	
	double RightTriger;
	double LeftTriger;
	boolean RightBumper;
	boolean LeftBumper;
	boolean Y;
	boolean B;
	boolean X;
	boolean A;
	double RightStick;
	double LeftStick;
	int DPad;
	
	ControlTick(double fRightTriger, double fLeftTriger, boolean fRightBumper, boolean fLeftBumper, boolean fY, boolean fB, boolean fX, boolean fA, double fRightStick, double fLeftStick, int fDPad)
	{
		RightTriger = fRightTriger;
		LeftTriger = fLeftTriger;
		RightBumper = fLeftBumper;
		LeftBumper = fLeftBumper;
		Y = fY;
		B = fB;
		X = fX;
		A = fA;
		RightStick = fRightStick;
		LeftStick = fLeftStick;
		DPad = fDPad;
	}
	
	ControlTick(String line)
	{
		int icnt = 0;
		String[] ControlItems = line.split(";");
		String[] Item;
		
		for(icnt=0;icnt<ControlItems.length;icnt++)
		{
			Item = ControlItems[icnt].split("=");
			SetValue(Item);
		}
		
		icnt = 0;
	}
	
	private void SetValue(String[] Item)
	{
		switch(Item[0]){ 
			case "RightTriger": 
				RightTriger = Double.parseDouble(Item[1]);
				break;
			case "LeftTriger":
				LeftTriger = Double.parseDouble(Item[1]);
				break;
			case "RightBumper": 
				RightBumper = Boolean.parseBoolean(Item[1]);
				break;
			case "LeftBumper": 
				LeftBumper = Boolean.parseBoolean(Item[1]);
				break;
			case "Y": 
				Y = Boolean.parseBoolean(Item[1]);
				break;
			case "B": 
				B = Boolean.parseBoolean(Item[1]);
				break;
			case "X": 
				X = Boolean.parseBoolean(Item[1]);
				break;
			case "A": 
				A = Boolean.parseBoolean(Item[1]);
				break;
			case "RightStick": 
				RightStick = Double.parseDouble(Item[1]);
				break;
			case "LeftStick": 
				LeftStick = Double.parseDouble(Item[1]);
				break;
			case "DPad": 
				DPad = Integer.parseInt(Item[1]);
				break;
			
		}
		
	}
	
	public String toString()
	{
		String s;
		
		s = "";
		
		s += "RightTriger=" + Double.toString(RightTriger) + ";";
		s += "LeftTriger=" + Double.toString(LeftTriger) + ";";
		s += "RightBumper=" + Boolean.toString(RightBumper) + ";";
		s += "LeftBumper=" + Boolean.toString(LeftBumper) + ";";
		s += "Y=" + Boolean.toString(Y) + ";";
		s += "B=" + Boolean.toString(B) + ";";
		s += "X=" + Boolean.toString(X) + ";";
		s += "A=" + Boolean.toString(A) + ";";
		s += "RightStick=" + Double.toString(RightStick) + ";";
		s += "LeftStick=" + Double.toString(LeftStick) + ";";
		s += "DPad=" + Integer.toString(DPad) + ";";
		s += "\r\n";
		
		return s;
		
	}

}
