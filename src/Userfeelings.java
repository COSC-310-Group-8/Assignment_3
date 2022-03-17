import java.io.*;
import java.util.*;


public class Userfeelings {

String userEmotion; 
List<String> angerSynonyms; 
List<String> sadSynonyms; 
List<String> happySynonyms;
String[] sadKeyWords;
String[] happyKeyWords;
String[] angerKeyWords;
String keyword;


public String getEmotion(){	
	return userEmotion ; 
}

public String getKeyword() {
	return keyword; 
}

public void findEmotion(String[] sent) {
	 //this get the file anger text file //
	File ang = new File("anger.txt");
	File sad = new File("sad.txt");
	File hap = new File("happy.txt");	
	//initialize variable 
	angerKeyWords = createFile(ang);
	happyKeyWords = createFile(hap);
	sadKeyWords = createFile(sad);
	
	Synonyms s = new Synonyms();
	angerSynonyms = s.getSynonyms("mad");
	happySynonyms = s.getSynonyms("happy");
	sadSynonyms = s.getSynonyms("sad");
	for (int i = 0; i < sent.length; i++) {
		for(String synonym: angerSynonyms) {
			if(sent[i].equalsIgnoreCase(synonym)) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "mad" ;
				keyword = sent[i];
				break;
			} 
		}
		for (int p = 0; p < angerKeyWords.length; p++) {
			if (sent[i].equalsIgnoreCase(angerKeyWords[p])) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "mad" ;
				keyword = sent[i];
				break;
			}
		}
			
		for(String synonym: happySynonyms) {
			if(sent[i].equalsIgnoreCase(synonym) || sent[i].equalsIgnoreCase("happy")) 	{
				// If There is a match then it will say that the user is happy //
				userEmotion = "happy" ;
				keyword = sent[i];
				break;
			} 
		}
		for (int p = 0; p < happyKeyWords.length; p++) {
			if (sent[i].equalsIgnoreCase(happyKeyWords[p])) {
				// If There is a match then it will say that the user is happy //
				userEmotion = "happy" ;
				keyword = sent[i];
				break;
			}
		}
		
		
		for(String synonym: sadSynonyms) {
			if(sent[i].equalsIgnoreCase(synonym) || sent[i].equalsIgnoreCase("sad")) {
				// If There is a match then it will say that the user is sad //
				userEmotion = "sad" ;
				keyword = sent[i];
				break;
			} 
		}
		
		for (int p = 0; p < sadKeyWords.length; p++) {
			if (sent[i].equalsIgnoreCase(sadKeyWords[p])) {
				// If There is a match then it will say that the user is sad //
				userEmotion = "sad" ;
				keyword = sent[i];
				break;
			}
		}
	}

//	for (int i = 0; i < sent.length; i++) {
//		synonyms = w.getSynonyms(sent[i]);
		
//	}		
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

		reader.close();
	
		return keyWords; 
	
	} catch(FileNotFoundException e) {
		System.out.println("File was not found!!!!");
		return new String[0]; 
	}
}





} // end of class
