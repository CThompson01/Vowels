package vowels;

import javax.swing.JOptionPane;

public class Main {
	static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] vowels = "AEIOUYaeiouy".toCharArray();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userSentence = JOptionPane.showInputDialog("Type a sentence that needs a vowel count.");
		JOptionPane.showMessageDialog(null, userSentence + 
				"\nLetters: " + letterAmount(userSentence) +
				"\nVowels: " + vowelAmount(userSentence));
	}
	
	private static int letterAmount(String input) {
		int letterTotal = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int x = 0; x < alphabet.length; x++) {
				if (input.charAt(i) == alphabet[x]) {
					letterTotal += 1;
				}
			}
		}
		return letterTotal;
	}
	
	private static int vowelAmount(String input) {
		int vowelTotal = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int x = 0; x < vowels.length; x++) {
				if (input.charAt(i) == vowels[x]) {
					vowelTotal += 1;
				}
			}
		}
		return vowelTotal;
	}
}
