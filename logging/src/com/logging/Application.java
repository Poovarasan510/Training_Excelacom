package com.logging;

import java.util.logging.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log=Logger.getLogger("com.example.application");
		log.setLevel(Level.SEVERE);
		log.info("info message");
	//	System.out.println("info message");
		
		log.warning("warning message***********");
		
		log.severe("servere message%%%%%%%%%%%%%%%");
		
		log.fine("iam fine message ###########3");

	}

}
