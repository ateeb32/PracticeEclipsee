package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	
	

	public String multChar(String input) {
		int len = input.length();
		char ch;
		StringBuilder stbuild = new StringBuilder(len*3);
		for(int i = 0; i < len; i++)
		{
			ch = input.charAt(i);
			stbuild.append(ch);
			stbuild.append(ch);
			stbuild.append(ch);
		}
		return stbuild.toString();
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) {
		return (input.endsWith("Dev") || (input.endsWith("dev")));
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "xxppp9"
	// yields "xp9".

	// RECURSIVE

	// stringClean("xxppp9") → "xp9"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Heellooo") → "Helo"
	public String stringClean(String input) {
		return "";
	}

	// Each subsequent Fibonacci value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the sum of
	// the first
	// n numbers.

	// RECURSIVE

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 2
	// fibonacci(3) → 3
	// fibonacci(4) → 7
	// fibonacci(7) → 33

	public int fibonacci(int input) {
		
		if (input == 0) {
		    
		    return 0;
		    
		  }
		  
		  else if (input == 1){
		    
		    return 1;
		    
		  }
		  
		  else {
		    
		    return fibonacci(input-2) - fibonacci(input-1)-1;
		  }
		
	}

	// Given a number multiply that number by 2 - using recursion
	// do not use any loops

	// RECURSIVE

	// simpleRecursion(0) → 0
	// simpleRecursion(1) → 2
	// simpleRecursion(2) → 4

	public int simpleRecursion(int input) {

		if (input == 0) {

			return 0;

	  }
	  
	  else {
	    
	    return simpleRecursion(input-1) + 2;
	    
	  }

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}

}
