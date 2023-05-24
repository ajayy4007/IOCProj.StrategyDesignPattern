package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipKartFactory {
	//Static factory method having factory patter logic
	
	public static FlipKart getInstance(String courierType) {
		//Create Depenndent class obj
       Courier courier=null;
       if(courierType.equalsIgnoreCase("dtdc"))
       courier=new DTDC();
       else if(courierType.equalsIgnoreCase("bDart"))
    	   courier=new BlueDart();
       else
    	   throw new  IllegalArgumentException("Invalid Courier Type");
       //create target class obj
       FlipKart fpkt=new FlipKart();
       //assign dependent class obj to target class object
       fpkt.setCourier(courier);
       return fpkt;
       }
	}
