import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;

public class Synonyms {
	public void getSynonyms ( IDictionary dict ){
		// look up first sense of the word "dog "
		IIndexWord idxWord = dict . getIndexWord ("dog", POS. NOUN );
		IWordID wordID = idxWord . getWordIDs ().get (0) ; // 1st meaning
		IWord word = dict . getWord ( wordID );
		ISynset synset = word . getSynset ();
		// iterate over words associated with the synset
		for( IWord w : synset . getWords ())
		System .out . println (w. getLemma ());
		}
}
