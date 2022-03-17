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
    
    //returns sentiment(positive, negative, neutral) and sentiment number(positive -->3, negative-->1, neutral-->2) for text inputted.

    public String getSentiment(String text)
    {
    	
      int sentimentNum = 0;
      String sentimentName = null; 
      Annotation annotation = pipeline.process(text);
      
      //condition to check if text is available and get sentiment of text.
      if (text != null && text.length() > 0) {
          CoreMap sentence = annotation
                    .get(CoreAnnotations.SentencesAnnotation.class).get(0);
          Tree tree = sentence
                     .get(SentimentAnnotatedTree.class);
          sentimentNum = RNNCoreAnnotations.getPredictedClass(tree);
          sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
        }
      		
      	return sentimentName+" "+sentimentNum;
      
     }

}

