import java.io.*;
import java.util.*;

public class UserDiagnosis {
	
	String diagnosis;
	String[] depressedKeywords;
	String[] anxiousKeywords;
	String[] biPolarKeywords;
	String keyword;

	public String getDiagnosis(){
		return diagnosis;
	}

	public String getKeyword(){
		return keyword;
	}

	public void findDiagnosis(String sent[]){
		File dep = new File("filePathway");
		File anx = new File("filePathway");
		File biP = new File("filePathway");


		depressedKeywords = createFile(dep);
		anxiousKeywords = createFile(anx);
		biPolarKeywords = createFile(biP);

		for (int i = 0; i < sent.length; i++){
			for (int p = 0; p < depressedKeywords.length; p++){
				if (sent[i].equalsIgnoreCase(depressedKeywords[p])){
					diagnosis = "depressed";
					keyword = sent[i];
					break;
				}
			}
			for (int p = 0; p < anxiousKeywords.length; p++){
				if (sent[i].equalsIgnoreCase(anxiousKeywords[p])){
					diagnosis = "anxious";
					keyword = sent[i];
					break;
				}
			}
			for (int p = 0; p < biPolarKeywords.length; p++){
				if (sent[i].equalsIgnoreCase(biPolarKeywords[p])){
					diagnosis = "biPolar";
					keyword = sent[i];
					break;
				}
			}
		}
	}
	
	public String[] createFile(File f) {
		String[] keywords;
			Scanner scan = new Scanner(System.in);
			List<String> lines = new ArrayList<String>();
			while (scan.hasNextLine()) {
				lines.add(scan.nextLine());
			}
			keywords = lines.toArray(new String[0]);
			return keywords;
	}
} //end of class
