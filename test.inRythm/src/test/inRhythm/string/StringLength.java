package test.inRhythm.string;

import java.util.ArrayList;
import java.util.List;

public class StringLength {
	
	public List<Object> LongestWord(String str) {
		
		String[] words = str.split(" ");
		
		int length = 0;
		
		// stores the longest word
		
		String longStr = "";
		
		// lis List returns the word and the length of the word to the main function.
		
		List<Object> lis = new ArrayList<Object>();
		
		// lis2 List returns all the words that have the same length(longest word).
		
		List<String> lis2 = new ArrayList<String>();

		boolean flag = false;

		for (String word : words) {
			
			// replaces all the special characters.
			
			word = word.replaceAll("[^a-zA-Z0-9]", "");
			
			// to find the longest word.
			
			if (length < word.length()) {
				longStr = word;
				length = longStr.length();
				lis2.add(longStr);
			} 
			else {
				
				if (length == word.length()) {
					lis2.add(word);
					length = longStr.length();
					flag = true;
				}
			}
		}
		
		if (flag) {
			lis.add(length);
			//lis.add(longStr);
			System.out.println("All the words with " + longStr.length() + " characters.");

			for (int i = 0; i < lis2.size(); i++) {

				if (lis2.get(i).length() == longStr.length()) {
					System.out.println(lis2.get(i));
					lis.add(lis2.get(i));
				}
			}
		} 
		else {
			lis.add(length);
			lis.add(longStr);
		}
		
		return (lis);
	}
}
