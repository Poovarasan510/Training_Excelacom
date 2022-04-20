package com.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogToFile {

	public static void main(String[] args) 
	{
	

		Logger log=
				 Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler = null;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("try block called");
			throw new RuntimeException("k is a great programmer");
			
		} catch (SecurityException e) {
		
			log.warning(e.getMessage());
		}
		 catch (IOException e) {
				
				log.warning(e.getMessage());
			}
		log.addHandler(handler);
	}

}
