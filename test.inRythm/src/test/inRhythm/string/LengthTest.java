package test.inRhythm.string;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LengthTest {

	@Test
	public void test() {
		StringLength len = new StringLength();
		List<Object> res = new ArrayList<Object>();
		List<Object> expr = new ArrayList<Object>();
		
		//Test 1 - Simple Test (Searching for the longest word.)
		
		//res = len.LongestWord("My name is Ann");
		//expr.add(4);
		//expr.add("Ann");
		
		//Test 2 - Special Character Test (Finding the longest word regardless of special characters.)
		
		//res = len.LongestWord("There are many books on the shelves! One having barcode *^&@AmberTolleyBC@. See that?");
		//expr.add(13);
		//expr.add("AmberTolleyBC");
		
		//Test 3 - More than one (More than one word with length = max)
		
		res = len.LongestWord("Two Americans near the coastal area. They were having a fantastic time there!");
		expr.add(9);
		expr.add("Americans");
		expr.add("fantastic");
		
		System.out.println("LongestWord method is been tested........");
		assertEquals(expr.size(),res.size());
		//compare(list, new String[] { "6", "jumped" })
	}

}
