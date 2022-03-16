

import edu.stanford.nlp.*;
import java.util.Properties;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {
	
	
	private static Properties properties;
	//annotators
	private static String propertiesName = "tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	private static StanfordCoreNLP stanfordCoreNLP;
	
	private Pipeline() {
		
	}
	
	//method to return one object of stanfrodCoreNLP and build pipeline
	public static StanfordCoreNLP getPipeline() {
		
		if(stanfordCoreNLP == null) {
			stanfordCoreNLP = new StanfordCoreNLP(properties);
		}
		return stanfordCoreNLP;
	
		}
	
	//sets up pipeline properties and annotators
	static {
		
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	
}
