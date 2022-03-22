import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NovaBotTest {

	NovaBot n = new NovaBot(); 
	
	private Boolean madResponse(String s) {
		if (s.equals("NOVA: I can sense your frustration, but try to remain calm and think clearly.") || s.equals("NOVA: You seem quite upset. Understand that it's normal and okay to feel this way.")) {
			return true;
		} else {
			return false;
		}
	}
	private Boolean madFollowup(String s) {
		if (s.equals("NOVA: Dealing with things like that can be quite irritating, so I can see why you are angry.") || s.equals("NOVA: It is normal for things to get under our skin, but it is important not to let them control us.")) {
			return true;
		} else {
			return false;
		}
	}
	
	@Test
	void testGetFollowup() {
		String s = "mad";
		assertEquals(true, madFollowup(n.getFollowup(s)));
	}
	
	@Test
	void testGetResponse() {
		String s = "mad";
		assertEquals(true, madResponse(n.getResponse(s)));
	}

	@Test // pass
	void testGetResponse1() {
	
		String s = "depressed";
		n.getResponse(s);
		assertEquals("You should seek professional help for your depression.", n.response);

	}
	@Test //pass
	void testGetGreeting() {
		String s = "NOVA: Hi, I am NOVA your personal emotional support bot :)" + "\n" + "NOVA: How are you feeling today? (mad, sad, happy, scared, etc.)";
		assertEquals(n.getGreeting(), s);
	}
}
