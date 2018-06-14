import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
public class WordFrequencyAnalyzer {

	public static void main(String[] args) {
		controller gui = new controller("Gui");
		gui.run();		
	}
}

class Wordfrequency{
	String word;
	int frequency;	
	
	public Wordfrequency() {
		word = "";
		frequency = 1;
	}
	
	public Wordfrequency(String word) {
		this.word = word;
		frequency = 1;
	}
	
	public void addToFrequency(){
		frequency++;
	}
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFrequency() {
		return frequency;
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public String toString(){
		return word + " " + frequency;
	}
}
