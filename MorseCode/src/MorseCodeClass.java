import java.util.HashMap;

public class MorseCodeClass {
	
	 HashMap<String, String> morse = new HashMap<>();
	
	MorseCodeClass(){
		morse.put(".-", "A");
		morse.put("-...", "B");
		morse.put("-.-.", "C");
		morse.put("-..", "D");
		morse.put(".", "E");
		morse.put("..-.", "F");
		morse.put("--.", "G");
		morse.put("....", "H");
		morse.put("..", "I");
		morse.put(".---", "J");
		morse.put("-.-", "K");
		morse.put(".-..", "L");
		morse.put("--", "M");
		morse.put("-.", "N");
		morse.put("---", "O");
		morse.put(".--.", "P");
		morse.put("--.-", "Q");
		morse.put(".-.", "R");
		morse.put("...", "S");
		morse.put("-", "T");
		morse.put("..-", "U");
		morse.put("...-", "V");
		morse.put(".--", "W");
		morse.put("-..-", "X");
		morse.put("-.--", "Y");
		morse.put("--..", "Z");
		morse.put("/", " ");
	}
	
	
	public String morseToAlpha(String morseCode) {
		
		String[] parts = morseCode.split(" ");
		String output = "";
		
		for (String i : parts) {
			output += morse.get(i);
		}
		
		return output;
		
	}
}
