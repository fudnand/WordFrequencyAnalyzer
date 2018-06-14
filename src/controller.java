import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class controller {
	View view;
	
	public controller(String viewType){
		view = setView(viewType);
	}
	
	public View setView(String viewType){
		switch(viewType){
		case "GUI" : return new GUI();
		//case "console" : return new Console(); 
		default : return new GUI(); 
		}
	}
	
	public void run(){
		view.display();
	}
}

/*
class Console implements View {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setDocumentText(String k) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setFrequencyText(String j) {
		// TODO Auto-generated method stub
		
	}


}
*/
