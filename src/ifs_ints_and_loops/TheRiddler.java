package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("I'm tall whem I'm young and I'm short when I'm old.What am I?"); 
	
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("Candle")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score = score +1;
	
}else {
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null, "Wrong!");
}
		// 6. Add some more riddles
answer = JOptionPane.showInputDialog("What has hands but can not clap?"); 
		// 2. Make a pop up to show the score.
score = score +1;
if(answer.equalsIgnoreCase("Clock")) {
	
}else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}
JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

