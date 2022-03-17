
import rita.*;
import rita.RiWordNet;
import java.util.*;

public class Synonyms {

	String[] allSynonyms;
	List<String> synonyms = new ArrayList<String>();
//	static String[] stemmedSynonyms;
	

	public List<String> getSynonyms(String word) 
	{
		RiWordNet wordnet;
	    wordnet = new RiWordNet("./dict");
	    String[] poss = wordnet.getPos(word);
	    for (int j = 0; j < poss.length; j++) {
	        allSynonyms = wordnet.getAllSynonyms(word,poss[0]);
	        synonyms = Arrays.asList(allSynonyms);
//	        for (int i = 0; i < synonyms.length; i++) {
//	            stemmedSynonyms[i] = RiTa.stem(synonyms[i]);
//	        }
	    }
	    return synonyms;
	}
//	public static void main(String args[])
//	{
//	    Synonyms w = new Synonyms();
//	    System.out.println(w.getSynonyms("mad"));
//
//	}
}
