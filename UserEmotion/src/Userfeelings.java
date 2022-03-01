import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Userfeelings {

String UserEmotion; 
String AngerKeyWords []; 
 String Keyword ;




public String getEmotion()
{
	
	return UserEmotion ; 
}


public String getKeyword() {
	return Keyword; 
}

public void FindEmotion(String  sent []) 
{
	
	try 
	{
		// this get the file emotions text file //
		File emt = new File("emotions.txt");
		
		// this creates a scanner to be bale to read the text file //
		Scanner Reader = new Scanner(emt);
		
		// Creates an Array List //
		List<String> lines = new ArrayList<String>();
		
		// Puts the text File into The Array List //
		while (Reader.hasNextLine()) {
		  lines.add(Reader.nextLine());
		}
		// Puts the Array list into a simple Array // 
		AngerKeyWords = lines.toArray(new String[0]);
		
		// this is a for loop to see if the users input is equal to any of the adjectives in the emotions.txt document // 
		for (int i = 0; i < sent.length; i++) 
		{
			
			for(int p =0 ; p <AngerKeyWords.length; p++) 
			{
				if(sent[i].equalsIgnoreCase(AngerKeyWords[p])) 
				{
					// If There is a match then it will say that the user is angry //
					UserEmotion = "mad" ;
					Keyword = sent[i];
				}
			}
		}
	}catch(FileNotFoundException e) {
		System.out.println("File was not found");
	}
	
}




} // end of class
