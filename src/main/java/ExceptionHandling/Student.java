package ExceptionHandling;

public class Student 
{
	public void m1()
	{
		System.out.println("m1");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2");
		m1();
	}
	
	public static void main(String args[])
	{
		Student s1 = new Student();
		try
		{
			s1.m1();
		}
		catch (StackOverflowError e) {
			System.out.println("Some Error is  coming");
		}
		System.out.println("Byeeee");
	}
}
