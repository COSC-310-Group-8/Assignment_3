package nova;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatBot extends JFrame {

	/**************
	 * GUI setup
	 ***************/

	// User input field
	private JTextField inputBar = new JTextField();
	// ChatBot response field
	private JTextArea chatOutput = new JTextArea();

	/*************
	 * ChatBot constructor
	 *************/
	public ChatBot() {

		// gui display setup
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500, 1000);
		this.setVisible(true);
		this.setResizable(false);

		// title
		this.setTitle("NOVA ChatBot");

		// Frame items
		this.add(inputBar);
		this.add(chatOutput);

		// setting up horizontal bar for user input
		inputBar.setLocation(2, 900);
		inputBar.setSize(900, 90);
		inputBar.setText("type here");

		// setting up actionListener to get user response
		inputBar.addActionListener(new ActionListener() {

			User user = new User();

			// keyword matching is done here with if else statements
			public void actionPerformed(ActionEvent arg0) {

				String userInput = inputBar.getText();
				user.findEmotion(userInput); // call findEmotion to set userEmotion String

				// sends userInput to user class
				user.setUserResponse(userInput);

				

				chatOutput.append("You: " + userInput + "\n");
				
				if(user.getEmotions()!= null){
						chatBotResponse(user.getEmotions());
				}
				
				if (userInput.contains("menu")) {
					chatBotResponse("What can I help you with:\n" 
							+ "product support\n" 
							+ "new plan\n"
							+ "talk to a representative");
				
				} else if (userInput.contains("hello")) {
					chatBotResponse("What brings you here today? \n" 
							+ "product support\n" 
							+ "new plan\n"
							+ "talk to a representative");
				
				
				} else if (userInput.contains("yes")) {
					chatBotResponse("Thank you for choosing us for all your customer need! "
							+ "If you still need assistance type \"menu\""
							+ "If that's all, type \"end\" to be take our customer satisfaction survey");
				
				} else if (userInput.contains("no")) {
					chatBotResponse(
							"Here are all our other plans. Please select the plan that you prefer\n" + "BRONZE PLAN\n"
									+ "	- Unlimited National Calling\n" + "	- Unlimited International SMS texting\n"
									+ "	- 1GB/month of data\n" + "	- $30/month\n" + "\n" + "SILVER PLAN\n"
									+ "	- Unlimited National Calling (+$10/month for roaming option)\n"
									+ "	- Unlimited International SMS texting\n" + "	- 2GB/month of data\n"
									+ "	- $40/month\n" + "\n" + "GOLD PLAN\n" + "	- Unlimited International Calling\n"
									+ "	- Unlimited International SMS texting\n"
									+ "	- 5GB/month of data (hotspot capability included)\n" + "	- $60/month\n"
									+ "\n" + "PLATINUM PLAN\n" + "	- Unlimited International Calling\n"
									+ "	- Unlimited International SMS texting\n"
									+ "	- 10GB/month of shareable data (hotspot capability included)\n"
									+ "	- +$10.00/month for international data\n" + "	- $75/month\n"
									+ "Select your desired plan");
					
				} else if (userInput.contains("bronze plan") || userInput.contains("silver plan")
						|| userInput.contains("gold plan")) {
					chatBotResponse(
							"Perfect! Your Trial started. Ends in 30 days! If you ever want to upgrade your plan type \"plan\"");
				
				} else if (userInput.contains("platinum plan")) {
					chatBotResponse("Thank you for choosing our best plan! Your Trial started. Ends in 30 days!");
				
				} else if (userInput.contains("plan")) {
					chatBotResponse(
							"If you sign-up now, you may have 30 day free access to the Silver plan! Would you like to start the silver trial (yes/no)?");
					
				} else if (userInput.contains("product support")) {
					chatBotResponse("What issues are you having with our product? \n"
							+ "product has been lost and/or damaged\n" 
							+ "needs a new plan");

				} else if (userInput.contains("Speak to rep") || userInput.contains("talk to a representative")) {
					chatBotResponse("To speak with a representative please call 1800-555-NOVA.");
				
				} else if (userInput.contains("damaged") || userInput.contains("lost")) {
					chatBotResponse(
							"If your product has been damaged please call guarantee support at 1-800-555-NOVAguarantee\n"
									+ "You can also speak with a representative please call 1800-555-NOVA.");
				
				} else if (userInput.contains("end")) {
					chatBotResponse("On a scale of one(1) to five(5), how would you rate your service?");
				
				} else if (userInput.contains("1") || userInput.contains("2")) {
					chatBotResponse("We are sorry we could not full satisfy your request.");
				
				} else if (userInput.contains("3") || userInput.contains("4") || userInput.contains("5")) {
					chatBotResponse("Thank you for completeing our customer service survey");
					chatBotResponse(
							"Please leave any comments on how we can improve our services. If you still need help type \"menu\" for more assistance");
					
				} else {
					chatBotResponse("I don't seem to understand. To view a list of commands enter \"menu\".");
				}

				inputBar.setText("");
			}
		});

		// chatBot response field setting
		chatOutput.setLocation(15, 5);
		chatOutput.setSize(600, 500);
		chatOutput.setLineWrap(true);
		chatOutput.setEditable(false);
		chatBotGreeting();

	}

	// chatBot response to user
	public void chatBotResponse(String s) {
		chatOutput.append("NOVA: " + s + "\n");
	}

	// chatbot intial greeting
	public void chatBotGreeting() {

		chatOutput.append(
				"Welcome, I'm your virtual assistant! Using a word or a short sentence, please describe what I can help you with today. You may also enter \"menu\" or \"hello\" to get started.\n");
	}

}
