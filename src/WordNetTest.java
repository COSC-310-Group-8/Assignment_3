import java.io.File;

	import java.io.IOException;

	import java.io.ObjectInputStream.GetField;

	import java.net.URL;

	import edu.mit.jwi.*;

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

	Scanner in=new Scanner(System.in);

	System.out.println("Enter the word");

	String t=in.nextLine();

	// look up first sense of the word “dog ”

	IIndexWord idxWord = dict.getIndexWord (t, POS.NOUN );

	IWordID wordID = idxWord.getWordIDs().get(0) ;

	IWord word = dict.getWord (wordID);

	System.out.println("Id = " + wordID);

	System.out.println(" Lemma = " + word.getLemma());

	System.out.println(" Gloss = " + word.getSynset().getGloss());
	Synonyms s1 = new Synonyms();
	s1.getSynonyms(dict);
	
	}
	
	

}
