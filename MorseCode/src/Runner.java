import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your Morse Code?");
		String morseInput = s.nextLine();
		
		MorseCodeClass morse = new MorseCodeClass();
			
			System.out.println(morse.morseToAlpha(morseInput));
			
		}

	}
