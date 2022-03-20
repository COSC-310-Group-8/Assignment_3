public class Main extends Dialogue {
	
	
static UI ui = new UI(); 
static NovaBot n1 = new NovaBot(); 
static  Userfeelings p1 = new Userfeelings();

	public static void main(String[] args) {
//		Dialogue d  = new Dialogue();
//		d.generateDialogue();
		ui.setTextArea(n1.getGreeting());
	}
}
