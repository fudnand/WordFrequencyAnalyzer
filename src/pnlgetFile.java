import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pnlgetFile extends JPanel {
	private JTextField docName;
	private JButton btnAnalyze;
	
	public pnlgetFile(JButton jb){
		btnAnalyze = jb;
		setUp();
	}
	
	public void setUp(){
		this.setLayout(new GridLayout(1, 2));
		this.setBorder(BorderFactory.createTitledBorder("Input File name and Submit"));
		
		docName = new JTextField("Advice.txt");
		
		this.add(docName);
		this.add(btnAnalyze);
	}
	
	public String getFileName(){
		return docName.getText();
	}
}
