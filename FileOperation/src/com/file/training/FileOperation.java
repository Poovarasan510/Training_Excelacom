package com.file.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;


public class FileOperation {
	

	
	public static void main (String[] args) {
		
//		try {
//			
//			File myFile= new File("File.txt");
//			if(myFile.createNewFile()) {
//				System.out.println("File created:"+myFile.getName());
//			}else {
//				System.out.println("File Already Exists");
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
		
//		try {
//		FileWriter myWriter = new FileWriter("Fruit.txt");
//			myWriter.write("Apple is red in colour, Orange is round in shape, Banana is good for health, Grapes will grow as bunch, Mango is a seasonal fruit");
//			myWriter.close();
//			System.out.println("Successfully Written on file");
//			
//		}catch(IOException e) {
//			System.out.println("An error Occured");
//			e.printStackTrace();
//		}
//		
//		try {
//			File myFile= new File("Fruit.txt");
//		Scanner myReader= new Scanner(myFile);
//			while(myReader.hasNextLine()) {
//			String data= myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();	
//		}catch(FileNotFoundException e) {
//			System.out.println("Error Occured");
//			e.printStackTrace();
//		}
//		FileInputStream instream= null;
//		FileOutputStream outstream= null;
//		
//		try {File infile= new File("Fruit.txt");
//			File outFile=new File("File.txt");
//			
//			instream = new FileInputStream(infile);
//			outstream = new FileOutputStream(outFile);
//			
//			byte[] buffer =new byte[1024];
//			
//			int length;
//			
//			while ((length=instream.read(buffer))>0) {
//				outstream.write(buffer,0,length);
//			}
//			
//			instream.close();
//			outstream.close();
//			
//			
//			System.out.println("File Copied Successfully");
//			
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		File myFile=new File("Fruit.txt");
//		if(myFile.delete()) {
//			System.out.println("Deleted the file:"+myFile.getName());
//			
//		}else {
//			System.out.println("Failed to delete ");
//		}
//		
//	}		
	}
	}