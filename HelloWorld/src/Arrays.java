
public class Arrays {

	public static void main(String[] args) {

		int[] tenNumbers = {1,2,3}; // create array with the values 1,2,3
		tenNumbers[0]=10; // Replace 1 with 10
		tenNumbers[2]=30; // Replace 3 with 30

		for (int i =0; i < tenNumbers.length; i++) {
			
			System.out.print((tenNumbers[i]) + ", "); // Show the array values first foillowed by a comma
			System.out.println((tenNumbers[i]*10)); // Now show the array values x10
		
		}

	}

	public static int Parameters(int number1, int number2, boolean test) {
		
		if (number1 == 0) {
			return number2;
		}

		if (number2 == 0) {
			return number1;
		}

		if (test) {
			return number1 + number2;
		}

		else {
			return number1 * number2;
		}

	}

}
