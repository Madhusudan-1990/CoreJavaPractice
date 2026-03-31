package SuperKeyword;

public class Audi extends Car
{
	public Audi()
	{

		System.out.println("Calling Audi Default Constructor");
	}
	
	public Audi(int a, int b)
	{
		super(10,40);
		System.out.println("Calling Audi 2 Param Constructor "+a+b);
	}
	
	public Audi(int a, int b, int c)
	{	super(10,20,30);
		System.out.println("Calling Audi 3 Param Constructor "+a+b+c);
	}
}
