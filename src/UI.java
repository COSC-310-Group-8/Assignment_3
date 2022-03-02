import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*; 
import java.awt.event.*;


public class UI {
JFrame frame ; 
JTextField text ; 
JLabel compName ;
JButton Enter ; 
JTextField robot; 
JLabel RChat; 
JLabel Test; 
StringBuilder tester ;
JTextArea textArea ;

	UI(){

		frame = new JFrame("NOVA CHAT");
		text = new JTextField(50); 
		Enter = new JButton("Enter");
		RChat = new JLabel (); 
		
		textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
  
       
        
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(700,600);
		frame.setVisible(true);
		JPanel panel1 = new JPanel (); 
		JPanel panel2 = new JPanel (); 
		JPanel panel3 = new JPanel (); 
		
		panel1.setBackground(Color.gray);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(50,50));
	
		 JScrollPane scroller = new JScrollPane();
	
		compName = new JLabel() ;
		compName.setText("<html><h1>" + " NOVA HELP CENTER"+"</h1></html>");
		panel1.add(compName);
		panel3.add(text);
		
		
		
		
	
		    
	////-----------------------------------------------------
		    
		  
		    
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel3,BorderLayout.SOUTH) ;
		frame.add(panel2,BorderLayout.CENTER);
		textArea.setBounds(10, 10, 50, 50);
		panel3.add(Enter); 
		frame.add(textArea);
		 panel2.add(scroller, BorderLayout.CENTER);
		
		//-----------------------------------------------------------// 
		
		
		
       
		// action listener if the user presses enter //
		text.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent event) {
		        System.out.println("The entered text is: " + text.getText());
		 
		        String  hello = text.getText(); 
		        textArea.append(hello + "\n");
		        System.out.println(tester);
		       
		    }
		    
		    
		});
		
		// action listener if the user presses the enter button // 
		
		Enter.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        System.out.println("The enetered text is " + text.getText());
		        String  hello = text.getText(); 
		        textArea.append(hello + "\n");
		        System.out.println(tester);
		    }
		});
		
		
		
		
		// robot interface
        
		
	}// end of the UI 
	
	
	
public static void main(String[] args)	{
	
	
	UI inter = new UI();
	
}

}

