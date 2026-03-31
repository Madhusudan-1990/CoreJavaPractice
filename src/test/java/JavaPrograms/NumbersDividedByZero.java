package JavaPrograms;

public class NumbersDividedByZero {

	public static void main(String[] args) 
	{
//		System.out.println(9/0); // Arithmetic Exception
		System.out.println(9.0/0); // Infinity
		System.out.println(12.23f/0); // Infinity
		System.out.println(19.999999d/0); // Infinity
//		System.out.println(0/0); // Infinity
		System.out.println(0.0/0); // NaN -> Not a Number
	}

}
