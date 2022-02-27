package nova;

import java.util.*;
import java.io.*;

public class TextFiles {
	String fileName;
	ArrayList<String> text = new ArrayList<String>();
	
	TextFiles(String fileName) throws IOException {
		this.fileName = fileName;
		try {
			
			DataInputStream input = new DataInputStream(new FileInputStream(fileName));
			boolean EOF = false;
			while (!EOF) { // Reads file while the end of the file has not been reached
				try {
					String temp = input.readUTF();				 	// Reads string to temp
						String[] tempArray = temp.split("|"); 		// Separates string by '|' into tempArray
						for (String element : tempArray) {			
							text.add(element); 						// Adds all strings into ArrayList
						}
				} catch (EOFException e) {
					EOF = true;
				}
			}
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void write() {
		
		User response = new User();
		
		 try {
		      File userDialogue = new File("userDialogue.txt");
		      if (userDialogue.createNewFile()) {
		        System.out.println("User Dialogue txt file created: " + userDialogue.getName());
		      } else {
		       
		        try {
				      FileWriter dialogueWriter = new FileWriter("userDialogue.txt");
				      dialogueWriter.write(response.getUserResponse());
				      dialogueWriter.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		
	}
	
	public ArrayList<String> getText() {
		return null;
	}
	
}
