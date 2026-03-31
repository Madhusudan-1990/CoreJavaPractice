package JavaPrograms;

public class MethodOverLoadingObjectStringClass 
{
	/*
	 * When we pass null in method which is overloaded with Object and String. So which method will be executed ????
	 */
	
	public static void main (String [] args)
	{
		test(null);
	}
	
	public static void test(Object o)
	{
		System.out.println("Object Argument !!!");
	}
	
	public static void test(String s)
	{
		System.out.println("String Argument !!!");
	}
	
	// Answer : Its always String not object.

}
