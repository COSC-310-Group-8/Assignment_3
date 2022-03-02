import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Userfeelings {

String userEmotion; 
String[] angerKeyWords; 
String[] sadKeyWords; 
String[] happyKeyWords;
String keyword;


public String getEmotion(){	
	return userEmotion ; 
}

public String getKeyword() {
	return keyword; 
}

public void findEmotion(String sent[]) {
	// this get the file anger text file //
	File ang = new File("anger.txt");
	File sad = new File("sad.txt");
	File hap = new File("happy.txt");	
	//initialize variable 
	angerKeyWords = createFile(ang);
	happyKeyWords = createFile(hap);
	sadKeyWords = createFile(sad);

	for (int i = 0; i < sent.length; i++) {
		// this loops are for finding out if the user is angry!
		for(int p =0 ; p < angerKeyWords.length; p++) {
			if(sent[i].equalsIgnoreCase(angerKeyWords[p])) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "mad" ;
				keyword = sent[i];
				break;
			} 
		}
			
		for(int p =0 ; p < happyKeyWords.length; p++) 	{
			if(sent[i].equalsIgnoreCase(happyKeyWords[p])) 	{
				// If There is a match then it will say that the user is angry //
				userEmotion = "happy" ;
				keyword = sent[i];
				break;
			} 
		}
		for(int p =0 ; p < sadKeyWords.length; p++) {
			if(sent[i].equalsIgnoreCase(sadKeyWords[p])) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "sad" ;
				keyword = sent[i];
				break;
			} 
		}
	}		
}

public String[] createFile(File f) {
	String[] keyWords ;
	try {
		Scanner reader = new Scanner(f);
	
		// Creates an Array List //
		List<String> lines = new ArrayList<String>();
	
		// Puts the text File into The Array List //
		while (reader.hasNextLine()) {
	 		lines.add(reader.nextLine());
		}
		// Puts the Array list into a simple Array // 
		keyWords = lines.toArray(new String[0]);
	
		return keyWords; 
	
	} catch(FileNotFoundException e) {
		System.out.println("File was not found!!!!");
		return null; 
	}
}





} // end of class
