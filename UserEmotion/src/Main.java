import java.util.Scanner;

public class Main extends Userfeelings {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String cont1 = "yes";
	String cont2 = "No";
	String place = " ";
	Userfeelings p1 = new Userfeelings(); 
	NovaBot n1 = new NovaBot(); 
		System.out.println(n1.getGreeting()); 
		
	while(true){
		String userInput = sc.nextLine();
		String[] words = userInput.split(" ");
		p1.FindEmotion(words);
		n1.setKeyword(p1.getKeyword());
		System.out.println( n1.getResponse(p1.getEmotion()));
		cont1 = sc.nextLine(); 
		cont1.toLowerCase();
		if(cont1.contains("yes")) {
			while(true) {
			System.out.println("Okay, Im listening");
			place = sc.nextLine(); 
			System.out.println( n1.getConfort() + "\n" + "would you like to continue?");
			cont2 = sc.nextLine(); 
			cont2.toLowerCase();
			if(cont2.contains("yes")) {
				System.out.println("You can continue");
				place = sc.next(); 
			}else {
				//***** TO DO 88****/// create a comfort line method depending on feelings
				
				System.out.println("Acknowleging your feelings is the first step! good start");
				break;
			}
			}
			
		}else {
			//***** TO DO 88****/// create a comfort line  depending on feelings
			System.out.println("Acknowleging your feelings is the first step! good start");
		}
		
		
		
		System.out.println("Is There another emotion you would like to talk about? ");
		cont1= sc.nextLine();
		cont1.toLowerCase();
		if(cont1.contains("yes"))
		{
		System.out.println("Okay Im here to listen :) " + "\n" + "What other emotions are you feeling? ");
		}else 
		{
			System.out.println("COmfort line here");
			break;
			
		}
			
	} // end of first while loop 
		
	System.out.println("I Am happy you are able to open up to me like this :) "+"\n" /* insert quote text here */);
	
	// if user is sad this will be the line if choice
	System.out.println("If you would like I Can suggest some options to help you");
	cont1 = sc.nextLine(); 
	if(cont1.contains("yes")|| cont1.contains("Okay")) {
		
		//chose one of many actions:: 
	} else {
		
		System.out.println("I am thrilled you are able to talk to me about your emotions :). I am always here if you need me");
		System.out.println("would you give me a rating on how I did today?? "); 
		// make a rating system
	}
		
	}//end of main method

}// end of class 


