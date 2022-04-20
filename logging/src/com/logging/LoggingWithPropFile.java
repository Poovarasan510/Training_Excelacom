package com.logging;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String file=LoggingWithPropFile.class.getClassLoader()
		                     .getResource("logging.properties")
		                     .getFile();
	System.out.println(file);
	
	System.setProperty("java.util.logging.config.file",file);
	Book.log.info("logging properties done right");
	
	Book java= new Book();
	Book.log.info(java.toString());
	}

}
