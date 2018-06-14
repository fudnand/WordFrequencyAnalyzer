import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements View {
	JFrame guiFrame; 
	JButton analyze;
	pnlgetFile topPart;
	private String fileName;
	private wordList wordsInDoc;
	MiddlePanel middle;
	Bottom bottomPart;
	
	public GUI(){
		
	}
		
	public void frameSetup(){
		guiFrame = new JFrame("WordFrequencyAnalyzer");
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setLayout(new BorderLayout());
		
		analyze = new JButton("Get and Process");
		topPart = new pnlgetFile(analyze);
		wordsInDoc = new wordList(); 
		analyze.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			fileName = topPart.getFileName();
			fileReader.readFile(fileName, wordsInDoc);
			fileReader.wordsInDocument(fileName, wordsInDoc);
			wordsInDoc.sortWords();

			middle.setFileText(wordsInDoc.getFile());
			middle.setDataText(wordsInDoc.toString());
			}
		});
		middle = new MiddlePanel();
		guiFrame.add(topPart, BorderLayout.NORTH);
		guiFrame.add(middle, BorderLayout.CENTER);
		bottomPart = new Bottom(this, wordsInDoc);
		guiFrame.add(bottomPart, BorderLayout.SOUTH);
		
		guiFrame.setSize(500, 500);
		guiFrame.setVisible(true);
	}
	
	public void refreshData(){
		middle.setDataText(wordsInDoc.toString());
	}

	
	@Override
	public void display() {
		frameSetup();	
	}	
}