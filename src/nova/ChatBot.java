package nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatBot extends JFrame {
	
	
	/**************
		GUI setup
	***************/

	//User input field
	private JTextField inputBar = new JTextField();
	//ChatBot response field 
    private JTextArea chatOutput = new JTextArea();
    

 
      
    
    /*************
     * ChatBot constructor
     *************/
    public ChatBot() {
    	
        //gui display setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 1000);
        this.setVisible(true);
        this.setResizable(false);
     
        
        //title 
        this.setTitle("NOVA ChatBot");
        
        //Frame items
        this.add(inputBar);
        this.add(chatOutput);
        
       
        
      
        
        // setting up horizontal bar for user input
        inputBar.setLocation(2, 900);
        inputBar.setSize(900, 90);
        inputBar.setText("type here");

    	
        //setting up actionListener to get user response 
        inputBar.addActionListener(new ActionListener(){
        	
            User user = new User();

        	
        	//keyword matching is done here with if else statements 
            public void actionPerformed(ActionEvent arg0) {
            	
            	
                String userInput = inputBar.getText();
               
                
                //sends userInput to user class 
                user.setUserResponse(userInput);
               
                
                chatOutput.append("You: " + userInput + "\n");
                
                if(userInput.contains("menu")) {
                	chatBotResponse("What can I help you with:\n"
                			+ "product support\n"
                			+ "sales\n"
                			+ "talk to a representative");
                }
                
                else if(userInput.contains("hello")){
                	chatBotResponse("What brings you here today?");
                }
                else if(userInput.contains("Speak to rep")){
                	chatBotResponse("To speak with a representative please call 1800-555-NOVA.");
                   
                }
                else if(userInput.contains("talk to a representative")){
        			chatBotResponse("To speak with a representative please call 1800-555-NOVA.");
                   
                }
                 else if(userInput.contains("sales")){
                	chatBotResponse("Product Features:\n"
                			+ "BRONZE PLAN\n"
                			+ "	- Unlimited National Calling\n"
                			+ "	- Unlimited International SMS texting\n"
                			+ "	- 1GB/month of data\n"
                			+ "	- $30/month\n"
                			+ "\n"
                			+ "SILVER PLAN\n"
                			+ "	- Unlimited National Calling (+$10/month for roaming option)\n"
                			+ "	- Unlimited International SMS texting\n"
                			+ "	- 2GB/month of data\n"
                			+ "	- $40/month\n"
                			+ "\n"
                			+ "GOLD PLAN\n"
                			+ "	- Unlimited International Calling\n"
                			+ "	- Unlimited International SMS texting\n"
                			+ "	- 5GB/month of data (hotspot capability included)\n"
                			+ "	- $60/month\n"
                			+ "\n"
                			+ "PLATINUM PLAN\n"
                			+ "	- Unlimited International Calling\n"
                			+ "	- Unlimited International SMS texting\n"
                			+ "	- 10GB/month of shareable data (hotspot capability included)\n"
                			+ "	- +$10.00/month for international data\n"
                			+ "	- $75/month");
                         
                }
               else if(userInput.contains("new plan")){
            	   	chatBotResponse("If you sign-up now, you may have 30 day free access to the Silver plan! Would you like to start the trial (trial/no)?\n"
            	   			+ "");
 
               }

               else if(userInput.contains("trial")) {
            	   chatBotResponse("Perfect! Your Trial started. Ends in 30 days!");
               }
               else if(userInput.contains("no")){
            	   chatBotResponse("That's unfortunate"); 
               }
               else if(userInput.contains("")) {
            	   chatBotResponse("I'm sorry, the input you have entered appears to be invalid. Please try again:\n");
               }
               
               else {
            	   chatBotResponse("I don't seem to understand. To view a list of commands enter \"menu\".");
               }
                
                inputBar.setText("");
            }
        });
        
      //chatBot response field setting
        chatOutput.setLocation(15, 5);
        chatOutput.setSize(600, 500);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);
        chatBotGreeting();
        
        
    
    }
    	//chatBot response to user
    	public void chatBotResponse(String s){
        chatOutput.append("NOVA: " + s + "\n");
    	}
    	
    	//chatbot intial greeting
    	public void chatBotGreeting() {
    
    		chatOutput.append("Welcome, I’m your virtual assistant! Using a word or a short sentence, please describe what I can help you with today. You may also enter “menu” or “hello” to get started.\n");
    	}
    	
    }
    
    
    

