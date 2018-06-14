import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bottom extends JPanel {
	JPanel frequency, sorting;
	JButton sort;
	
	public Bottom(View views, wordList data){
		this.setLayout(new GridLayout(2, 1));
		
		frequency = new frequencyPanel(data);
		sorting = new SortBtnPanel(views, data);
		
		this.add(frequency);
		this.add(sorting);
	}
}

class frequencyPanel extends JPanel{
	JTextField input, answer;
	wordList data;
	int value;
	
	public frequencyPanel(wordList data){
		this.data = data;
		setup();
	}
	
	private void setup(){
		input = new JTextField("Type a word here, hit “Enter”");
		answer = new JTextField("Word frequency is displayed here");
		answer.setEditable(false);
		
		input.addActionListener(e->{
			String key = input.getText().toLowerCase();
			
			value = data.checkfor(key);
			answer.setText("" + value);
		});
		
		this.add(input);
		this.add(answer);
	}
	
}

class SortBtnPanel extends JPanel{
	JButton sort;
	View view; //passed to the panel to change data after sorting
	wordList data;
	
	public SortBtnPanel(View view, wordList data){
		this.view = view;
		this.data = data;
		sort = new JButton("Sort words based on frequency");
		setup();
	}
	
	public void setup(){
		sort.addActionListener(e->{
		data.sortFrequency();
		view.refreshData();
		});
		
		this.add(sort);
	}
}

