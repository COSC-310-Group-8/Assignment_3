
public class NovaBot extends Main   {
String response;
String greeting; 
String Keyword; 
String confort ; 
public void setKeyword(String s) {
	Keyword = s; 
}

public String getResponse(String s) {
	if(s.equals("mad")) {
		return "I am sorry you are feeling " + Keyword +", would you like to talk about it more? "; 
	}
	
	return null;
	
}

public String getGreeting() 
{
greeting = "HI, I am Nova your personal Pycatrist :)" + "\n" + "How are you feeling today?";
return greeting;

}

public String getConfort()
{
	return "it is good you are opening up about this" ; 
}

public String getQuote() {
	return null; 
}


	
}// end of class 

