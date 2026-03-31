package JavaPrograms;

public class PrintOneToHundredWithoutNumbers {

	public static void main(String[] args) 
	{
		// Print 1 to 100 without using numbers
		
		int one = 'A'/'A'; // A divided by A = 1
		String s1 = ".........."; // Here there are 10 dots. So length is 10
		
		//Solution 1
		for(int i = one;i<=(s1.length()*s1.length()); i++) // Here i < = 10(s1.length()) * 10(s1.length()) which is 100
		{
			System.out.println("First  Approach " +i);
		}
		
		//Solution 2 Using ASCII
		//a-97 b-98 c-99 d - 100
		for(int i = one; i<='d'; i++)
		{
			System.out.println("Second Approach " +i);
		}

	}

}
