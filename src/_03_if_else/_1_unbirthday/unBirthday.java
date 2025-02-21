package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String birthdayQuestion = JOptionPane.showInputDialog("When is your birthday? mm/dd");
if(birthdayQuestion.equals("02/20")) {
	JOptionPane.showMessageDialog(null, "well then I wish you a happy birthday!");
	

	
}else {
	JOptionPane.showMessageDialog(null, "happy unbirthday then!");
}
	}

}
