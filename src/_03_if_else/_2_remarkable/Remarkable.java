package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Lele = "Lele is a star warz fan and her favorite person in star warz is yoda.";
		String Mana = "Mana is an excellent gamer and he is very cool...... kind of. ";
		String MrNick = "Mr Nick is an excellent coder.";
		String Alo = "Alo is an excellent crafter";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("enter the name Mr Nick,Lele,Mana or Alo");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (name.toLowerCase().contains("nick")) {
JOptionPane.showMessageDialog(null, MrNick);
		}
		if (name.toLowerCase().contains("mana")) {
JOptionPane.showMessageDialog(null, Mana);
		}
		if (name.toLowerCase().contains("lele")) {
JOptionPane.showMessageDialog(null,Lele);
		}
		if (name.toLowerCase().contains("alo")) {
JOptionPane.showMessageDialog(null, Alo);
		}
	}
}

