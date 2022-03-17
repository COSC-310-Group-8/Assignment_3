import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class POSTagger {
	private String input; 		//User's input in single string format
	private ArrayList<String> twList = new ArrayList<String>();	//Resulting arrayList word of tagged input
	
	public POSTagger(String input) {
		this.input = input;
		tagString();
	}
	
	public void tagString() {
	
		MaxentTagger tagger = new MaxentTagger("taggers/english-caseless-left3words-distsim.tagger");

		List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new StringReader(input)); //turns input string into list
		for (List<HasWord> sentence : sentences) {
			List<TaggedWord> tSentence = tagger.tagSentence(sentence); //adds tag to all words in list
			for (TaggedWord tw : tSentence) { 
				if (tw.tag().startsWith("JJ")) { //checks if "Adjective". See "https://www.ling.upenn.edu/courses/Fall_2003/ling001/penn_treebank_pos.html" for all other POS tags 
					twList.add(tw.word()); //adds adjective to taggedWord array list
				}
			}
		} 
	}
	
	public String[] getTaggedWords() {
		String[] twArray = twList.toArray(new String[twList.size()]);//converts arrayList to array
		return(twArray);
	}
}
