
public class UniqueSum {

	private static void main(String[] args) {
		
		System.out.println(Unique(2, 2, 6));

	}
	
	private static int Unique(int number1, int number2, int number3) {
		
		//int sum;
		//sum = number1 + number2 + number3;
		
		if (number1 == number2 && number2 == number1) {
			return number3;
		}
		
		if (number1 == number3 && number3 == number1) {
			return number2;
		}
		
		if (number2 == number3 && number3 == number2) {
			return number1;
		}
		
		else {
			return 0;
		}
		
		
//		if (number1 == number2, number3) {
//			
//		}
	}

}
