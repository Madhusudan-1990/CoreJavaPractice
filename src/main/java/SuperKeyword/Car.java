package SuperKeyword;

public class Car extends Vehicle
{
	int speed = 100;
	
	public Car()
	{
		System.out.println("Calling Default Car Constructor");
	}
	
	public Car(int a, int b)
	{
		System.out.println("Call 2 Param Car Constructor "+a+b);
	}
	
	public Car(int a, int b, int c)
	{
		System.out.println("Call 3 Param Car Constructor "+a+b+c);
	}
	
	public void start()
	{
		System.out.println("Car --- Start");
	}
	
	public void refuel()
	{
		System.out.println("Car --- refuel");
	}
}
