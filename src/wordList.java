import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class wordList{
	ArrayList<Wordfrequency> words;
	String file;
	
	public wordList() {
		words = new ArrayList<Wordfrequency>();
	}
	
	public void add(String toAdd){
		Wordfrequency temp = find(toAdd);
		if (temp != null){
			temp.addToFrequency();
		}
		else{
			temp = new Wordfrequency(toAdd);
			words.add(temp);
		}
	}
	
	public int checkfor(String word){
		Wordfrequency hold = find(word);
		if(hold != null){
			return hold.getFrequency();
		}
		return 0;
	}
	
	private Wordfrequency find(String wordToFind){
		for(Wordfrequency check : words){
			if(check.getWord().equalsIgnoreCase(wordToFind)){
				return check;
			}
		}
		return null;
	}
	
	public int numbUniqueWords(){
		return words.size();
	}
	
	public void sortWords(){
		Collections.sort(words, new SortWords());
	}
	
	public void sortFrequency(){
		Collections.sort(words, new SortFrequency());
	}
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String toString(){
		String msg= "Number of unique words" + numbUniqueWords()+ "\n";
		
		for(Wordfrequency temp : words){
			msg+= temp+ "\n";
		}
		
		return msg;
	}
}

class SortWords implements Comparator<Wordfrequency>{
	@Override
	public int compare(Wordfrequency o1, Wordfrequency o2) {
		return o1.getWord().compareTo(o2.getWord());
	}
}

class SortFrequency implements Comparator<Wordfrequency>{

	@Override
	public int compare(Wordfrequency o1, Wordfrequency o2) {
		if (o1.getFrequency() > o2.getFrequency()){
			return 1;
		}
		else if(o1.getFrequency() < o2.getFrequency()){
			return -1;
		}
		return 0;
	}
}