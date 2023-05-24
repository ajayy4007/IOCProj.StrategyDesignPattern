package com.nt.text;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipKartFactory;

public class StratgeyDpTest {
	public static void main(String[] args) {
		FlipKart fpkt=FlipKartFactory.getInstance("dtdc");
		//invoke b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser","watch"},new float [] {4000.0f,6000.0f,30000.0f});
		System.out.println(result);
	}

}
