package nova;

import java.io.*;
import java.util.ArrayList;

public class TextFiles {
	ArrayList<String> keywords = new ArrayList<String>();
	ArrayList<String> responses = new ArrayList<String>();
	String temp;

	public void readKeywords(String[] text, String fileName) throws IOException {
		try {
			ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			boolean EOF = false;
			while (!EOF) { // Reads file while the end of the file has not been reached
				try {
					if (fileName.equals("keywords.txt")) { 			// Checks which text file is being read
						temp = input.readUTF(); 					// Reads string to temp
						String[] tempArray = temp.split("|");		// Separates string by '|' into tempArray
						for (String element : tempArray) {
							keywords.add(element); 					// Adds all keywords into keywords ArrayList
						}
					} else if (fileName.equals("responses.txt")) { 	// Checks which text file is being read
						temp = input.readUTF(); 					// Reads string to temp
						String[] tempArray = temp.split("|"); 		// Separates string by '|' into tempArray
						for (String element : tempArray) {
							responses.add(element); 				// Adds all responses into responses ArrayList
						}
					} else {
						System.out.println("Unknown file selected");
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

	public String[] write() { // In progress
		return null;
	}

	public ArrayList<String> getKeyword() { // Returns ArrayList containing keywords
		return keywords;
	}

	public ArrayList<String> getResponse() { // Returns ArrayList containing responses
		return responses;
	}
}
