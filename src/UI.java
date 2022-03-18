import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class UI extends Main {
	JFrame frame;
	JTextField text;
	JLabel compName;
	JButton Enter;
	JTextField robot;

	JLabel Test;
	StringBuilder tester;
	JTextArea textArea;
	static String input = "";

	boolean chat1 = true;
	boolean chat2 = false;
	boolean chat3 = false;
	boolean chat4 = false;
	boolean chat5 = false;
	boolean chat6 = false;
	boolean chat7 = false;
	boolean chat8 = false;
	boolean chat9 = false;
	boolean chat10 = false;
	boolean chat11 = false;
	boolean chat12 = false;

	UI() {
//CREATING THE GUI-----------------------------------------------------------------------
		frame = new JFrame("NOVA CHAT"); // This creates the Main box
		text = new JTextField(50); // textfield is where the user types responses
		Enter = new JButton("Enter");// enter button
		textArea = new JTextArea(5, 20);// area where you can see the chat
		textArea.setEditable(false); // doesnt let you eddit the chat
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // lets use exit from the GUI
		frame.setLayout(new BorderLayout());// how we want the fram layout to be
		frame.setSize(700, 600); // frame size
		frame.setVisible(true); // this lets us see the frame
		JPanel panel1 = new JPanel(); // creating 3 panels to separate the screen into three sections
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setBackground(Color.yellow.brighter()); // color for each panel -- top
		panel2.setBackground(Color.white); // -- middle
		panel3.setBackground(Color.yellow.brighter()); // -- bottom
		panel1.setPreferredSize(new Dimension(100, 100));// top panel size
		panel3.setPreferredSize(new Dimension(50, 50)); // bottom panel size
		JScrollPane scroller = new JScrollPane(textArea);// gives us a scroll wheel
		compName = new JLabel(); // company name object
		compName.setText("<html><h1>" + " NOVA THERAPY CENTER" + "</h1></html>"); // company name title
		panel1.add(compName); // add name to panel
		panel3.add(text); // add area to type to panel

		frame.add(panel1, BorderLayout.NORTH); // adding top panel to frame
		frame.add(panel3, BorderLayout.SOUTH); // adding bottom panel to frame
		frame.add(panel2, BorderLayout.CENTER); // adding middle panel to frame
		textArea.setBounds(10, 10, 50, 50); // creating an area to type location
		panel3.add(Enter); // adding enter botton to bottom panel
		frame.add(scroller); // add scroll wheel to the chat
//END OF GUI-----------------------------------------------------------------------------------------
//CREATING ACTION LISTENERS --------------------------------------------------------------------------
		// ***THIS ACTION LISTENER SECTION WAITS TO SEE IF THE USER HAS ENTERED TEXT, IF
		// THEY DID THEN IT WILL PERFORM A TEXT ACTION***//

		// action listener if the user clicks the enter button with mouse//
		Enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayText();
				if (chat1 == true) {
					chat1();
				} else if (chat2 == true) {
					chat2();
				} else if (chat3 == true) {
					chat3();
				} else if (chat4 == true) {
					chat4();
				} else if (chat5 == true) {
					chat5();
				} else if (chat6 == true) {
					chat6();
				} else if (chat7 == true) {
					chat7();
				} else if (chat8 == true) {
					chat8();
				} else if (chat9 == true) {
					chat9();
				} else if (chat10 == true) {
					chat10();
				} else if (chat12 == true) {
					chat12();
				}
			}

		});

		// action listener if the user presses enter //
		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				displayText();
				if (chat1 == true) {
					chat1();
				} else if (chat2 == true) {
					chat2();
				} else if (chat3 == true) {
					chat3();
				} else if (chat4 == true) {
					chat4();
				} else if (chat5 == true) {
					chat5();
				} else if (chat6 == true) {
					chat6();
				} else if (chat7 == true) {
					chat7();
				} else if (chat8 == true) {
					chat8();
				} else if (chat9 == true) {
					chat9();
				} else if (chat10 == true) {
					chat10();
				}else if (chat12 == true) {
					chat12();
				}
			}

		});
//END OF ACTION LISTENER ---------------------------------------------------------------------------------------	

	}// END OF UI

//DISPLAY TEXT ON SCREEN----------------------------------------------------------------------------------------	
	// ** THIS DISPLAY ON SCREEN IS A METHOD THAT LETS US DISPLAY USER AND NOVA BOT
	// TEXT TO THE GUI **//

	private void displayText() {
		input = text.getText();
		textArea.append("User: " + input + "\n");
		text.setText("");
	}

	public void setTextArea(String text) {

		textArea.append(text + "\n");
	}

//END OF DISPLAY TEXT-------------------------------------------------------------------------------------------------

//NOVA BOT CHAT --------------------------------------------------------------------------------------------------------------------
//THIS WILL DECIDED WHAT CHAT THE NOVA BOT WILL SAY!
	public void chat1() {
		chat1 = false;
		String[] words = input.split(" ");
		p1.findEmotion(words);
		ui.setTextArea(n1.getResponse(p1.getEmotion()));
		ui.setTextArea("NOVA: Would look like to expand on feeling " + p1.getKeyword() + "? (yes/no)");
		chat2 = true;

	}

	public void chat2() {
		input.toLowerCase();
		chat2 = false;
		if (input.contains("yes")) {
			ui.setTextArea("NOVA: Okay, I'm listening");
			chat3 = true;

		} else if (input.contains("no")) {

			ui.setTextArea("NOVA: That's okay! I want you to feel comfortable." /*
																				 * "\n" + n1.getComfort() +
																				 * n1.getQuote(p1.getEmotion())
																				 */);
			ui.setTextArea("NOVA: Is there another emotion you would like to talk about?(yes/no) ");
			chat6 = true;

		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: Would look like to expand on feeling " + p1.getKeyword() + "? (yes/no)");
			chat2 = true;
		}

	}

	public void chat3() {
		chat3 = false;
		ui.setTextArea(n1.getComfort() + "\n" /* + n1.getResponse(p1.getEmotion()) + "\n" */
				+ "NOVA: Would you like to continue? (yes/no)");
		chat4 = true;

	}

	public void chat4() {
		chat4 = false;
		input.toLowerCase();
		if (input.contains("yes")) {
			ui.setTextArea("NOVA: You can continue");
			chat3 = true;

		} else if (input.contains("no")) {
			ui.setTextArea(n1.getComfort() /* + n1.getQuote(p1.getEmotion()) */);
			ui.setTextArea("NOVA: Is there another emotion you would like to talk about?(yes/no) ");
			chat6 = true;
		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: Would you like to continue? (yes/no)");
			chat4 = true;
		}
	}

	public void chat5() {
		chat5 = false;
		ui.setTextArea("NOVA: Is there another emotion you would like to talk about?(yes/no) ");
		chat6 = true;
	}

	public void chat6() {
		chat6 = false;
		input.toLowerCase();
		if (input.contains("yes")) {
			ui.setTextArea("NOVA: Okay Im here to listen :) " + "\n"
					+ "What other emotions are you feeling? (mad, sad, happy, etc.)");
			chat1 = true;
		} else if (input.contains("no")) {
			ui.setTextArea("NOVA: I am happy you are able to open up to me like this :) " + "\n");
			ui.setTextArea("...");
			ui.setTextArea("NOVA: If you would like I can suggest some options to help you (yes/no)");
			chat7 = true;
		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: Is there another emotion you would like to talk about?(yes/no) ");
			chat6 = true;
		}
	}

	public void chat7() {
		chat7 = false;
		input.toLowerCase();
		if (input.contains("yes")) {
			ui.setTextArea("NOVA: " + n1.helpOptions());
			ui.setTextArea("NOVA: Would you like another helpful tip? (yes/no)");
			chat8 = true;

		} else if (input.contains("no")) {
			ui.setTextArea("NOVA: Okay, that's fine.");
			ui.setTextArea(
					"NOVA: I am glad you are able to talk to me about your emotions :). I am always here if you need me");
			ui.setTextArea("NOVA: Would you give me a rating on how I did today? (yes/no)  ");
			chat9 = true;
		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: If you would like I can suggest some options to help you (yes/no)");
			chat7 = true;
		}

	}

	public void chat8() {
		chat8 = false;
		input.toLowerCase();
		if (input.contains("yes")) {
			ui.setTextArea("NOVA: Awesome!");
			ui.setTextArea("NOVA: " + n1.helpOptions());
			ui.setTextArea("NOVA: Would you like another helpful tip? (yes/no)");
			chat8 = true;
		} else if (input.contains("no")) {
			ui.setTextArea("NOVA: Okay, that's fine.");
			ui.setTextArea(
					"NOVA: I am glad you are able to talk to me about your emotions :). I am always here if you need me");
			ui.setTextArea("NOVA: Would you give me a rating on how I did today? (yes/no) ");
			chat9 = true;
		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: Would you like another helpful tip? (yes/no)");
			chat8 = true;
		}
	}

	public void chat9() {
		chat9 = false;
		input.toLowerCase();
		if (input.contains("yes")) {
			ui.setTextArea("Alright what do you give me out of 5?");
			chat12 = true;
		} else if (input.contains("no")) {
			ui.setTextArea("That's okay! We only ask for feedback to improve NOVA.");
			ui.setTextArea("Thank you for using NOVA! Goodbye.");
			chat10 = true;
		} else {
			ui.setTextArea("NOVA: I dont undertand can you please reapeat? ");
			ui.setTextArea("NOVA: Would you give me a rating out of 5 on how I did today? (yes/no) ");
			chat9 = true;
		}
	}

	public void chat10() {
		System.exit(0);
	}
	

	public void chat12() {
		chat12 = false;

		// n1.getRating(input);
		ui.setTextArea("Thank you for using NOVA! Goodbye.");
		chat10 = true;

	}
//END OF NOVA CHAT----------------------------------------------------------------------------------------------------------------------------

}// end of class