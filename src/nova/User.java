package nova;

public class User{
	
	String userResponse;

	String selectPrompt;
	
	int setRating;

	String UserEmotion ; 
	
	String AngerKeyWords [] ;
	
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

	public String getEmotions(){
		return UserEmotion ; 
	}

	public void FindEmotion(String userresponse) 
	{
	String Response [] = userresponse.split(" ");

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
		for (int i = 0; i < Response.length; i++) 
		{
			
			for(int p =0 ; p <AngerKeyWords.length; p++) 
			{
				if(Response[i].equalsIgnoreCase(AngerKeyWords[p])) 
				{
					// If There is a match then it will say that the user is angry //
					UserEmotion = "We are sorry for any stress or incovince this may cause you" ;
				}
			}
		}
	}catch(FileNotFoundException e) {
		System.out.println("File was not found");
	}
	
	}
	
}
