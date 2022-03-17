import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class NovaBot extends Main   {
String response;
String greeting; 
String quote ;
String comfort;
String help;

public String getResponse(String s) {
	if(s.equals("mad")) {
		File mad = new File("mad_responses.txt");
		String madArray[] = createFile(mad); 
		response = chooseRandom(madArray);
		
	}else if(s.equals("sad")) {
		
		File sadRes = new File("sadness_responses.txt");
		String sadArray[] = createFile(sadRes); 
		response= chooseRandom(sadArray);
		
	}else if(s.equals("happy")) {
		File happy = new File("happiness_responses.txt");
		String happyArray[] = createFile(happy); 
		response= chooseRandom(happyArray);
		
	} else if (s.equals("fear")) {
		File fear = new File("fear_responses.txt");
		String fearArray[] = createFile(fear);
		response = chooseRandom(fearArray);
	} else {
		System.out.println("I'm sorry, I can't understand.");
	}
	
	return "NOVA: " + response;
}

public String getFollowup(String s) {
	if(s.equals("mad")) {
		File mad = new File("mad_followup.txt");
		String madArray[] = createFile(mad); 
		response = chooseRandom(madArray);
		
	}else if(s.equals("sad")) {
		
		File sadRes = new File("sadness_followup.txt");
		String sadArray[] = createFile(sadRes); 
		response= chooseRandom(sadArray);
		
	}else if(s.equals("happy")) {
		File happy = new File("happy_followup.txt");
		String happyArray[] = createFile(happy); 
		response= chooseRandom(happyArray);
		
	} else if (s.equals("fear")) {
		File fear = new File("fear_followup.txt");
		String fearArray[] = createFile(fear);
		response = chooseRandom(fearArray);
	} else {
		System.out.println("I'm sorry, I don't understand.");
	}
	
	return "NOVA: " + response;
}

public String getGreeting() {
	greeting = "NOVA: Hi, I am NOVA your personal emotional support bot :)" + "\n" + "NOVA: How are you feeling today?";
	return greeting;
}

public String getComfort() {
	File comfortfile = new File("comforting_phrases.txt");
	String comfortarray[] = createFile(comfortfile); 
	comfort= chooseRandom(comfortarray);
	return "NOVA: " + comfort ; 
}

public String getQuote(String s) {	
	if(s.equals("mad")) {
		File madQuote = new File("AngerQuotes.txt");
		String[] madQuoteArray = createFile(madQuote); 
		quote= chooseRandom(madQuoteArray);
		
	}else if(s.equals("sad")) {
		File sadQuote = new File("SadnessQuotes.txt");
		String[] sadQuoteArray = createFile(sadQuote); 
		quote= chooseRandom(sadQuoteArray);
		
	}else if(s.equals("happy")) {
		File happyQuote = new File("HappinessQuotes.txt");
		String[] happyQuoteArray = createFile(happyQuote); 
		quote = chooseRandom(happyQuoteArray);	
	}
	return "NOVA: " + quote; 
}

public static void getRating(){
	System.out.println("Enter a rating from 0-5: ");
	Scanner sc = new Scanner(System.in);
	int rating = sc.nextInt();
	switch(rating){
		case 0:
			System.out.println("NOVA: I'm sorry I wasn't able to help you today.");
			break;
		case 1:
			System.out.println("NOVA: I'm sorry you were not satisfied with my help.");
			break;
		case 2: 
			System.out.println("NOVA: I'm sorry you were not entirely satisfied with my help.");
			break;
		case 3:
			System.out.println("NOVA: I'm at least glad I was able to make you feel somewhat better.");
			break;
		case 4:
			System.out.println("NOVA: I'm glad I was able to make you feel a bit better!");
			break;
		case 5:
			System.out.println("NOVA: I'm thrilled I was able to help you so much!");
			break;
		default:
			System.out.println("Invalid input!");
			break;
	}
	sc.close();
}



public String helpOptions() {
	File supportOptions = new File("support.txt");
	String[] supportArray = createFile(supportOptions);
	help = chooseRandom(supportArray);
	return help;
}


//chooses a random response
public String chooseRandom(String[] s) {
	int length = s.length; 
	int ran =(int) Math.floor(Math.random()*length);
	return s[ran]; 	
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
		return null; 
	}
	
}
	
}// end of class 

