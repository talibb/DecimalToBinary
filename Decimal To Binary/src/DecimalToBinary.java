/*
 * Done by: Talib Bacchus
 * Using recursion, this program takes in an integer 
 * and returns the binary value of that number
 */
public class DecimalToBinary {
	
	
	
	
	public static String ToBinary(int number)
	{
		if (number ==0)
			return "0";
		if(number%2 ==0)
		{
			number = number/2;
			return ToBinary(number) + "0"; 
			
		}
		if (number%2==1)
		{
			number = number/2;
			return ToBinary(number) + "1";
		}
		
		return "0";
		
	}

	public static void main(String[] args) {
		System.out.println(ToBinary(165000001));
	}
}
