import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MiddlePanel extends JPanel{
	private JTextArea fileText, dataText;

	public MiddlePanel(){
		setup();
	}
	
	public void setup(){
		this.setLayout(new GridLayout(1, 2));
		fileText = new JTextArea();
		dataText = new JTextArea();
		
		fileText.setEditable(false);
		dataText.setEditable(false);
		
		JScrollPane fileScroll  = new JScrollPane(fileText);
		JScrollPane dataScroll  = new JScrollPane(dataText);
		
		dataScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		dataScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		fileScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		fileScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		this.add(dataScroll);
		this.add(fileScroll);
	}
	public void setFileText(String file){
		fileText.setText(file);
	}
	
	public void setDataText(String data){
		dataText.setText(data);
	}
	
	public JTextArea getFileTextArea(){
		return fileText;
	}
	
	public JTextArea getDataTextArea(){
		return dataText;
	}
	
	public void displayFile(String file){
		fileText.setText(file);
	}
}


