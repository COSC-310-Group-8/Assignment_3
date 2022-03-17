import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

	import java.io.ObjectInputStream.GetField;

	import java.net.URL;

import rita.*;
import rita.RiWordNet;

import java.util.Arrays;
import java.util.Scanner;

public class WordNetTest {
//	public static void main(String[] args) throws Exception {
//		System.out.println(RiTa.isAdjective("mad"));
//		RiWordNet rw = new RiWordNet("./dict"); // point to local installation
//		  rw.randomizeResults(false);                   // don't randomize results
//		  String[] s = rw.getAllSynonyms("car", "n");
//		  System.out.println(Arrays.asList(s));
//		
//		
//	}
	RiWordNet wordnet;

	String word;

	void setup() 
	{

	  wordnet = new RiWordNet("./dict");
	  word = "happy";
	    String[] poss = wordnet.getPos(word);
	    //System.out.println(poss)
	    for (int j = 0; j < poss.length; j++) {
	        System.out.println("\n\nSynonyms for " + word + " (pos: " + poss[j] + ")");
	        String[] synonyms = wordnet.getAllSynonyms(word,poss[0],10);
	        Arrays.sort(synonyms);
	        for (int i = 0; i < synonyms.length; i++) {
	            System.out.println(synonyms[i]);
	        }
	    }
	}
	public static void main(String args[])
	{
	    WordNetTest b=new WordNetTest();
	    b.setup();

	}
	

//	public static void main(String[] args) throws IOException, JWNLException{
//		
//		JWNL.initialize(new FileInputStream("./Properties.xml")); 
//		final Dictionary dictionary = Dictionary.getInstance();
//		IndexWord wd=Dictionary.getInstance().getIndexWord(POS.VERB,"accomplish");
//		System.out.println(wd.getPOS());
//		IndexWord indexWord = dictionary.getIndexWord(POS.NOUN, "dog");
//		
//		
//		 
//		Synset[] senses = indexWord.getSenses();
//
//		 
//		for (Synset set : senses) {
//		 System.out.println(indexWord + ": " + set.getGloss());
//
//
//		 }
//	
//	 public static void main(String[] args) throws Exception {
//		    JWNL.initialize(new FileInputStream("./Properties.xml"));
//		    String[] words = new String[]{"bend","cat","clown","meet","bend",
//		        "turn","proceed","prevent","proposal","frolic"};
//		    for (int i = 0; i < words.length; ++i) {
//		      System.out.print(words[i]+":");
//		      int[] p = polysemy(words[i]);
//		      for (int j = 0; j < p.length; ++j)
//		        System.out.print(p[j]+((j<p.length-1)?",":"\r\n"));
//		    }
//		  }
		 
		  /**
		   * Returns list of polysemy counts for word.
		   * result[0] is count for noun, 1 for verb, 2 for adjective, 3 for adverb
		   * @param word word to examine
		   * @return
		   */
//		  public static int[] polysemy(String word) throws JWNLException {
//		    int[] polysemies = new int[4];
//		    Dictionary d = Dictionary.getInstance();
//		    IndexWord noun_form = d.getIndexWord(POS.NOUN, word);
//		    polysemies[0] = (noun_form==null)?0:noun_form.getSenses().length;
//		    IndexWord verb_form = d.getIndexWord(POS.VERB, word);
//		    polysemies[1] = (verb_form==null)?0:verb_form.getSenses().length;
//		    IndexWord adj_form = d.getIndexWord(POS.ADJECTIVE, word);
//		    polysemies[2] = (adj_form==null)?0:adj_form.getSenses().length;
//		    IndexWord adv_form = d.getIndexWord(POS.ADVERB, word);
//		    polysemies[3] = (adv_form==null)?0:adv_form.getSenses().length;
//		    return polysemies;
//		  }
		
		
		
		
		

//	//construct URL to WordNet Dictionary directory on the computer
//
//	String wordNetDirectory = "./";
//
//	String path = wordNetDirectory + File.separator + "dict";
//
//	URL url = new URL("file", null, path);
//
//	//construct the Dictionary object and open it
//
//	IDictionary dict = new Dictionary(url);
//
//	dict.open();
//
//	Scanner sc = new Scanner(System.in);
//
//	System.out.println("Enter the word: ");
//
//	String t = sc.nextLine();
//	
//	IIndexWord idxWord = dict.getIndexWord(t, POS.NOUN);
//    try {
//        int x = idxWord.getTagSenseCount();
//        for (int i = 0; i < x; i++) {
//            IWordID wordID = idxWord.getWordIDs().get(i);
//            IWord word = dict.getWord(wordID);
//            POS pos = word.getPOS();
//            // Adding Related Words to List of Related Words
//            ISynset synset = word.getSynset();
//            for (IWord w : synset.getWords()) {
//                System.out.println(w.getLemma());
//                // output.add(w.getLemma());
//            }
//        }
//    } catch (Exception ex) {
//        System.out.println("No synonym found!");
//    }

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
