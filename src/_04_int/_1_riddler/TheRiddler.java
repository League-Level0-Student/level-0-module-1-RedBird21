package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int scoreHolder = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null,
				"hello! My name is the riddler and I will be asking you riddles that you will most definetly NEVER be able to get right, HAHAHAHA!!");
		String answerOne = JOptionPane.showInputDialog(
				"What do you call a bunny with flees?! if you fail this riddle, I will call you loser for the REST OF YOUR LIFE! HAHAHAHA!!!");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answerOne.equalsIgnoreCase("bugs bunny")) {

			JOptionPane.showMessageDialog(null, "ugh, you better not go brag to your sister or brother that you "
					+ "got this riddle right! that one was VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY EASY!");
			scoreHolder += 1;

			// 5. Otherwise, say "wrong" and tell them the answer
		} else {
			JOptionPane.showMessageDialog(null,
					"HA!! Now I can call you loser for the rest of your life! LOSER, LOSER, LOSER, LOS"
							+ "ER, LOSER LOSER! what do you call a bunny with flees? BUGS BUNNY! wasn't it obvious loser! that was the easiest one yet! LOSER!!");
			scoreHolder -= 1;
		}
		// 6. Add some more riddles
		String answerTwo = JOptionPane.showInputDialog(null,
				"Riddle number two: what is something that has 13 hearts but has no lungs, brain, or stomach? ");
		if (answerTwo.equalsIgnoreCase("a deck of cards")) {
			JOptionPane.showMessageDialog(null,
					"I have to admit, I didn't know that you would get that right. Well anyway, onto the next riddle");
			scoreHolder += 1;
		} else {
			JOptionPane.showMessageDialog(null,
					"Well, I'm not suprised that you got it wrong but, the answer was a deck of cards, anyway, onto the next riddle");
			scoreHolder -= 1;
		}
		// 2. Make a pop up to show the score.
		String answerThree = JOptionPane.showInputDialog(
				"riddle number three: I speak without a mouth and hear without ears. I come alive with the wind. What am I?");
		if (answerThree.equalsIgnoreCase("an echo")) {
			JOptionPane.showMessageDialog(null,
					"well you got it right, so what. Ok, you better NOT get this last riddle right!");
			scoreHolder += 1;
		} else {
			JOptionPane.showMessageDialog(null,
					"HAHA!! if you couldn't get this riddle right, you'll never be able to guess the next one! The answer was an echo. HAHAHAHA!!!");
			scoreHolder -= 1;
		}
		String answerFour = JOptionPane.showInputDialog(
				"A man went out for a walk, and it started raining. He forgot to bring an umbrella and didn't have a hat. When he got home, his clothes were soaking wet, but not a single hair on his head was wet. How is this possible?");
		if (answerFour.toLowerCase().contains("bald")) {
			JOptionPane.showMessageDialog(null,
					"WHAT! how did you get thaft one right! okay, well you don't have to play this game anymore... oh, I forgot, I still need to show you your score.");
			scoreHolder += 1;
		} else {
			JOptionPane.showMessageDialog(null,
					"YES! I knew you wouldn't get it right! the answer was that he was bald! HAHAHAHA!!");
		}
		JOptionPane.showMessageDialog(null, "your score was " + scoreHolder);
	}
}
