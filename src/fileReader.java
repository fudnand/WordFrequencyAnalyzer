import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
	
	static void readFile(String doc, wordList data){
		
		String msg = "";
		try {
            FileReader reader = new FileReader(doc);
            int character;
 
            while ((character = reader.read()) != -1) {
                msg += (char) character;
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }		
		
		data.setFile(msg);
	}
	
	static void wordsInDocument(String doc, wordList data){
			try {
				FileReader f = new FileReader(doc);
				Scanner sc;
				sc = new Scanner(f);
				sc.useDelimiter("[^a-zA-Z']+");
				
				while(sc.hasNext()) { 
					data.add(sc.next());
				}
				
				} catch(IOException e) {
				System.out.println("Unable to read from file.");
			}			
	}	
}
