import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class POSTaggerTest {

	@Test
	void testReturnString() { //tests if returns complete string of Adjectives
		POSTagger in = new POSTagger("I am feeling Happy and Excited today!");//Sample input
		String[] desiredOutput = {"Happy", "Excited"}; //Desired output from input
		assertArrayEquals(in.getTaggedWords(), desiredOutput);//Checks if Class returns the correct output
	}
	

}
