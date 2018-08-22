
public class Blackjack {
	
	public static void main(String[] args)
	{
		System.out.println(blackjack(7, 7));
	}
	
	public static int blackjack (int number1, int number2)
	{
		if (number1 < number2) {
			return number2;
		}
		
		if (number1 > number2) {
			return number1;
		}
		
		else  {
			return 0;
		}
		
	}
}