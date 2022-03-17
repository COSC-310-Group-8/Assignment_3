import java.util.Properties;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations.SentimentAnnotatedTree;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

public class PipelineToSentiment {
	
	static StanfordCoreNLP pipeline;
	
    public static void init() 
    {
    	//pipeline properties
        Properties props = new Properties();
        //annotators that will run
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        //create new instance of CoreNLP to build pipeline with set properties
        pipeline = new StanfordCoreNLP(props);
    }
    
    //returns and prints out sentiment(positive, negative, neutral) 
    public static void getSentiment(String text)
    {
    	
      int sentimentNum;
      String sentimentName; 
      Annotation annotation = pipeline.process(text);
      
      //loop to get sentence of passed text
      for(CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class))
      {
         Tree tree = sentence.get(SentimentAnnotatedTree.class);
        sentimentNum = RNNCoreAnnotations.getPredictedClass(tree); 
                sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
        System.out.println(sentimentName + " " + sentimentNum + "\t" + sentence);
      }
     }

}
