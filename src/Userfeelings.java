import java.io.*;
import java.util.*;


public class Userfeelings {

String userEmotion; 
List<String> angerSynonyms; 
List<String> sadSynonyms; 
List<String> happySynonyms;
List<String> fearSynonyms;
String[] sadKeyWords;
String[] happyKeyWords;
String[] angerKeyWords;
String[] fearKeyWords;
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
	File fear = new File("fear.txt");

	//initialize variable 
	angerKeyWords = createFile(ang);
	happyKeyWords = createFile(hap);
	sadKeyWords = createFile(sad);
	fearKeyWords = createFile(fear);
	
	
	Synonyms s = new Synonyms();
	angerSynonyms = s.getSynonyms("mad");
	happySynonyms = s.getSynonyms("happy");
	sadSynonyms = s.getSynonyms("sad");
	fearSynonyms = s.getSynonyms("fear");
	for (int i = 0; i < sent.length; i++) {
		//checks for certain topics not prepared for
		if (sent[i].equalsIgnoreCase("depressed")) {
			userEmotion = "depressed";
			keyword = sent[i];
			break;
		} else if (sent[i].equalsIgnoreCase("bipolar")) {
			userEmotion = "bipolar";
			keyword = sent[i];
			break;
		} else if (sent[i].equalsIgnoreCase("sick") || sent[i].equalsIgnoreCase("ill")) {
			userEmotion = "sick";
			keyword = sent[i];
			break;
		} else if (sent[i].equalsIgnoreCase("disgusted")) {
			userEmotion = "disgusted";
			keyword = sent[i];
			break;
		} else if (sent[i].equalsIgnoreCase("suicidal")) {
			userEmotion = "suicidal";
			keyword = sent[i];
			break;
		}
		
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
		
		for(String synonym: fearSynonyms) {
			if(sent[i].equalsIgnoreCase(synonym)) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "fear" ;
				keyword = sent[i];
				break;
			} 
		}
		for (int p = 0; p < fearKeyWords.length; p++) {
			if (sent[i].equalsIgnoreCase(fearKeyWords[p])) {
				// If There is a match then it will say that the user is angry //
				userEmotion = "fear" ;
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
