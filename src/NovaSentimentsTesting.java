
public class NovaSentimentsTesting {

	public static void main(String[] args) {
		
		 String text = "I will recommend this chatbot.";
		 String text1 = "The chatbot helped me!";
		 String text2 = "Chatbot was not good.";
		 String text3 = "Chatbot was not good.";
		 
		    PipelineToSentiment.init();
		    PipelineToSentiment pipelineToSentiment = new PipelineToSentiment();
			
			System.out.println(pipelineToSentiment.getSentiment(text));
			System.out.println(pipelineToSentiment.getSentiment(text1));
			System.out.println(pipelineToSentiment.getSentiment(text2));
			System.out.println(pipelineToSentiment.getSentiment(text3));

	}

}
