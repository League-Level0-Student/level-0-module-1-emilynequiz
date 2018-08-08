package extra;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("Pick a name");
	
	if(answer.equals("Kayla")){
		JOptionPane.showMessageDialog(null, "Kayla is very quiet in coding clases..");
	}
else if(answer.equals("Alex")){
	JOptionPane.showMessageDialog(null, "Alex is very quiet");
	}
else if(answer.equals("Emily")) {
	JOptionPane.showMessageDialog(null,"Emily is sometimes quiet");
}
else if(answer.equals("Bryan")) {
	JOptionPane.showMessageDialog(null,"Bryan is very loud and talkative");
}
else {
	JOptionPane.showMessageDialog(null,"Idk who that person is....");
}
	
	
}
}
