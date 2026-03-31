/*
 * Recursive Function also leads to Stack Over Flow issue
 */
public class RecursiveFunction {
	public static void getNum()
	{
		System.out.println("Calling Recursive Method");
		getNum();
	}

	public static void main(String[] args) {
		
		getNum();

	}

}
