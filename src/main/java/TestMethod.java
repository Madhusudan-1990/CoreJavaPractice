/*
 * Static Methods can be overloaded but not overrided
 * Main method is  static in nature because JVM can directly call main method without  object creation.
 */
public class TestMethod {

	public void getMail()
	{
		System.out.println("get mail");
	}
	
	public static void sendMail()
	{
		System.out.println("send mail");
	}
	
	public static void sendMail(int a, int b)
	{
		System.out.println("Overload ");
	}
	
	public void sendMail(String s)
	{
		System.out.println("send mail");
	}
	
	public static void main(String[] args) 
	{
		// how to call static methods
		//1. using class name:
		TestMethod.sendMail();
		
		//2. within same classs, use it directly:
		sendMail();
		
		

	}

}
