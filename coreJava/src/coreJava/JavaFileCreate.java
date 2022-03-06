package coreJava;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class JavaFileCreate {
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	public static void main(String[] args) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        System.out.println(sdf1.format(timestamp)); 
	    try {
	      FileWriter myWriter = new FileWriter("C:\\KrishnaLearn\\misc"+"filename"+sdf1.format(timestamp)+".txt");
	      myWriter.write("Files in Java might be tricky, but it is fun enough! at " + sdf1.format(timestamp));
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}