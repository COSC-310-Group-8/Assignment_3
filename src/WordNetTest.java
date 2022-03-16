import java.io.File;

	import java.io.IOException;

	import java.io.ObjectInputStream.GetField;

	import java.net.URL;

	import edu.mit.jwi.*;
import edu.mit.jwi.item.IHasPOS;
import edu.mit.jwi.item.IIndexWord;

	import edu.mit.jwi.item.ILexFile;

	import edu.mit.jwi.item.ISenseKey;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;

	import edu.mit.jwi.item.IWordID;

	import edu.mit.jwi.item.POS;

	import java.util.Scanner;

public class WordNetTest {

	public static void main(String[] args) throws IOException{

	//construct URL to WordNet Dictionary directory on the computer

	String wordNetDirectory = "./";

	String path = wordNetDirectory + File.separator + "dict";

	URL url = new URL("file", null, path);

	//construct the Dictionary object and open it

	IDictionary dict = new Dictionary(url);

	dict.open();

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the word: ");

	String t = sc.nextLine();
	
	IIndexWord idxWord = dict.getIndexWord(t, POS.NOUN);
    try {
        int x = idxWord.getTagSenseCount();
        for (int i = 0; i < x; i++) {
            IWordID wordID = idxWord.getWordIDs().get(i);
            IWord word = dict.getWord(wordID);
            POS pos = word.getPOS();
            // Adding Related Words to List of Related Words
            ISynset synset = word.getSynset();
            for (IWord w : synset.getWords()) {
                System.out.println(w.getLemma());
                // output.add(w.getLemma());
            }
        }
    } catch (Exception ex) {
        System.out.println("No synonym found!");
    }

//	IIndexWord idxWord = dict.getIndexWord (t, POS.NOUN );
//
//	IWordID wordID = idxWord.getWordIDs().get(0) ;
//
//	IWord word = dict.getWord (wordID);
//	
//	ISynset synset = word.getSynset();
//	// iterate over words associated with the synset
//	
//	for(IWord w :synset.getWords()) {
//	System.out.println(w.getLemma());
//	}
//
//	System.out.println("Id = " + wordID);
//
//	System.out.println(" Lemma = " + word.getLemma());
//
//	System.out.println(" Gloss = " + synset.getGloss());
	
	}
	
	

}
