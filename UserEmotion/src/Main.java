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
		if(cont1.equalsIgnoreCase("yes")) {
			System.out.println("Okay, Im listening");
			place = sc.nextLine(); 
			System.out.println( n1.getConfort() + "\n" + "would you like to continue?");
			cont2 = sc.nextLine(); 
			if(cont2.equalsIgnoreCase("yes")) {
				System.out.println("You can continue");
				place = sc.next(); 
			}
			
			
		}else {
			System.out.println("Acknowleging your feelings is the first step! good start");
		}
			
	} 
		
		
		
	}

}


