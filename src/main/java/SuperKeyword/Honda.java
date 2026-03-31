package SuperKeyword;

public class Honda extends Car
{
	public Honda()
	{
		this(10,20); //Calling 2nd Honda Constructor
		System.out.println("Calling Honda Default Constructor");
	}
	
	public Honda(int a, int b)
	{
		this(10,20,30);//Calling 3rd Honda Constructor
		System.out.println("Calling Honda 2 Param Constructor"+a+b);
	}
	
	public Honda(int a, int b, int c)
	{
		System.out.println("Calling Honda 3 Param Constructor"+a+b+c);
	}
}
