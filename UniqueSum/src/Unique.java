
public class Unique {

	public static void main(String[] args) {
		
		System.out.println(Technique(6, 1, 7));

	}
	
	public static int Technique(int number1, int number2, int number3) {
		
		if (number2 == number3 && number1 == number2) {
			return 0;
		}
		
		if (number1 == number2) {
			return number3;
		}
		
		if (number1 == number3) {
			return number2;
		}
		
		if (number2 == number3) {
			return number1;
		}
		
		
		else {
			return number1+number2+number3;
		}
		
	}
	

}