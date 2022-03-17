
public class NovaSentiments {

	public static void main(String[] args) {
		
		 String text = "I love this chatbot. I will recommend this chatbot. I hate this chatbot. The chatbot needs more work";

		    PipelineToSentiment.init();
		    PipelineToSentiment.getSentiment(text);

	}

}
