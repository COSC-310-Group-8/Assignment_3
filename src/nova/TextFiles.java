package nova;

import java.util.*;
import java.io.*;

public class TextFiles {
	String fileName;
	ArrayList<String> text = new ArrayList<String>();
	
	
	TextFiles(String fileName) throws IOException {
		text.add("hello");
		this.fileName = fileName;
		try {
			
			
			BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String temp;
				// Reads file while the end of the file has not been reached
				
				while((temp = input.readLine()) != null) {
			
					if(temp != null) {
						String[] tempArray = temp.split(";",0); 
						
						for (int i = 0; i < tempArray.length; i++) {
							text.add(tempArray[i]);
						}
					}
				}
				input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
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
		return this.text;
	}
	
}
