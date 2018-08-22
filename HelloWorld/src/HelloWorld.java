
public class HelloWorld {
	
	public static void main(String[] args)
	{
		System.out.println(Parameters(3, 3, true));
	}
	
	public static int Parameters (int number1, int number2, boolean test)
	{
		if (number1 == 0)
			return number2;
		
		if (number2 == 0)
			return number1;
		
		if (test)
			return number1+number2;
		
		else
			return number1*number2;
		
	}
}