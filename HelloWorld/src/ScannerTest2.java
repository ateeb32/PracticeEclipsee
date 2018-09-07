import java.util.Scanner; // Initialising scanner function

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // Name scanner as "s" and declare system to input values
		System.out.println("What car do you drive?");
		
		String car = s.next(); // Creates a string variable called "car" and communicates with the scanner as a new line
		System.out.println("What colour is it?");
		
		String colour = s.next();
		System.out.println("Hi mate, you drive a " + car + " and the colour is: " + colour);
		
	}

}
