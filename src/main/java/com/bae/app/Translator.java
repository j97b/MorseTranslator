package com.bae.app;

public class Translator {
	
	public static String translate(String s) {
		String result = "";
		String[] words = s.split(" / ");
		for (String word : words) {
		String[] letters = word.split(" ");
		for (String letter : letters) {
			result += LetterTranslator.translate(letter);
		}
		result += " ";
		}
		return result;
	}

}
