package nova;

import java.util.*;
import java.io.*;

public class TextFiles {
	ArrayList<String> responses = new ArrayList<String>();
	
	public ArrayList<String> read() {
		ArrayList<String> keywords = new ArrayList<String>();
		DataInputStream din = null;
		try {
			din = new DataInputStream(new FileInputStream("keywords.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Scanner s = new Scanner(din);
		while (s.hasNext()){
		    keywords.add(s.next());
		}
		s.close();
		return keywords;
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
	
	public String getKeyword() {
		
		
		return null;
	}
	
	public String getResponse() {
		return null;
	}
}
