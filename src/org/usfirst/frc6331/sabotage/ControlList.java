package org.usfirst.frc6331.sabotage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ControlList {

	ArrayList<ControlTick> controltick;
	String ControlFileName;
	
	ControlList(String sControlFileName)
	{
		controltick = new ArrayList<ControlTick>();
		ControlFileName = sControlFileName;
	}
	
	void AddControlTick(double fRightTriger, double fLeftTriger, boolean fRightBumper, boolean fLeftBumper, boolean fY, boolean fB, boolean fX, boolean fA, double fRightStick, double fLeftStick, int fDPad)
	{
		controltick.add(new ControlTick(fRightTriger, fLeftTriger,fRightBumper,	fLeftBumper, fY, fB, fX, fA, fRightStick, fLeftStick, fDPad));
	}
	
	ControlTick GetControlTick(int iTick)
	{
		if(iTick < controltick.size())
			return controltick.get(iTick);
		
		return null;
	}
	
	void LoadControlFile()
	{
		String line;
		File f = new File(ControlFileName);
		if(f.exists())
		{
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(ControlFileName));
			
			
				while((line = br.readLine()) != null)
				{
					controltick.add(new ControlTick(line));
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
	}
	
	void WriteControlFile() throws IOException
	{
		int icnt;
		
		FileWriter fw = new FileWriter(ControlFileName);
		
		for(icnt=0;icnt<controltick.size();icnt++)
		{
			fw.write(controltick.get(icnt).toString());
		}
		
		fw.close();
		
	}
}
