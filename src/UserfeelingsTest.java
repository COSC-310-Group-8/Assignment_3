import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserfeelingsTest {
Userfeelings uf = new Userfeelings(); 

	@Test // Fail
	void testGetEmotion() {
	String sent = "I am Very mad";
	POSTagger tw = new POSTagger(sent);
		uf.findEmotion(tw.getTaggedWords());	
		
		assertEquals("sad", uf.getEmotion());
		
	}
@Test // pass
void testGetEmotion1() {
	
	String sent = "I am Very mad";
	POSTagger tw = new POSTagger(sent);
	uf.findEmotion(tw.getTaggedWords());
		
		assertEquals("mad", uf.getEmotion());
		
	}

}



