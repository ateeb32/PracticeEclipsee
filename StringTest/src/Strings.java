
public class Strings {

	public static void main(String[] args) {
		
		String bert = "bertclivebert";
		
		for(int i = bert.length() - 1; i >= 0; i--)	{
            
			bert = bert + bert.charAt(i);
			
        }
		
		System.out.println(bert.trim().substring(bert.length() - 13));

	}

}
