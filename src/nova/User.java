package nova;

import java.io.*;
import java.util.*;

public class User{
	
	String userResponse;

	String selectPrompt;
	
	int setRating;

	String userEmotion ; 
	
	String[] angerKeyWords ;
	
	public String getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

	public String getSelectPrompt() {
		return selectPrompt;
	}

	public void setSelectPrompt(String selectPrompt) {
		this.selectPrompt = selectPrompt;
	}

	public int getSetRating() {
		return setRating;
	}

	public void setSetRating(int setRating) {
		this.setRating = setRating;
	}

	
	public void setEmotions() {
		userEmotion = null;
	}
	public String getEmotions(){
		return userEmotion ; 
	}

	public void findEmotion(String userresponse) 
{
	String[] response = userresponse.split(" ");

	try 
	{
		// this get the file emotions text file //
		File emt = new File("C:/Users/spike/Assignment_2/src/nova/emotions.txt");
		
		// this creates a scanner to be bale to read the text file //
		Scanner reader = new Scanner(emt);
		
		// Creates an Array List //
		List<String> lines = new ArrayList<String>();
		
		// Puts the text File into The Array List //
		while (reader.hasNextLine()) {
		  lines.add(reader.nextLine());
		}
		// Puts the Array list into a simple Array // 
		angerKeyWords = lines.toArray(new String[0]);
		
		// this is a for loop to see if the users input is equal to any of the adjectives in the emotions.txt document // 
		for (int i = 0; i < response.length; i++) 
		{
			
			for(int p =0 ; p <angerKeyWords.length; p++) 
			{
				if(response[i].equalsIgnoreCase(angerKeyWords[p])) 
				{
					// If There is a match then it will say that the user is angry //
					userEmotion = "We are sorry for any stress or incovince this may cause you" ;
				}
			}
		}
	}catch(FileNotFoundException e) {
		System.out.println("File was not found");
	}
	
}
	
}
