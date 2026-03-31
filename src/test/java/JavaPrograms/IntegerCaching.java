package JavaPrograms;

public class IntegerCaching 
{
	/*
	 * Compare 2 int numbers
	 */
	public static void main(String args[])
	{
		// Integer Number Caching happens only between numbers ranging from -128 to 127. So in the below example for 190 it shows number is not equal even thought both variables hold same values.
		
		Integer num1 = 100;
		Integer num2 = 100;
		
		Integer num3 = 190;
		Integer num4 = 190;
		if(num1==num2)
		{
			System.out.println("both are equal");
		}
		{
			System.out.println("both are not equal");
		}
		
		if(num3==num4)
		{
			System.out.println("both are equal");
		}
		{
			System.out.println("both are not equal");
		}
	}
	

}
