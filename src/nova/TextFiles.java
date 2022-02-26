package nova;

import java.util.*;
import java.io.*;

public class TextFiles {
	ArrayList<String> responses = new ArrayList<String>();
	
	public ArrayList<String> read() {
		ArrayList<String> keywords = new ArrayList<String>();
		DataInputStream din = new DataInputStream(new FileInputStream("keywords.txt"));
		Scanner s = new Scanner(din);
		while (s.hasNext()){
		    keywords.add(s.next());
		}
		s.close();
		return keywords;
	}
	
	public void write() {
		
	}
	
	public String getKeyword() {
		return null;
	}
	
	public String getResponse() {
		return null;
	}
}
