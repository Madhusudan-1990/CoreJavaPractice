package AbstractionConcept;

/*
 * Abstract Class : Class with Abstract Keyword.
 * It can have abstract and non abstract methods
 * 0% Abstraction -> Yes
 * 100% Abstraction -> Yes
 * Partial Abstraction -> Yes
 * Abstract class object creation is not allowed.
 * 
 */
public abstract class Page 
{
	//Zero Param Constructor
	public Page()
	{
		System.out.println("Calling Page Abstract Class Default Constructor");
	}
	//Parameterized Constructor
	public Page(int a)
	{
		System.out.println("Calling Page Abstract Class Parameterized Constructor" +a);
	}
	//Abstract Methods
	public  abstract void title();
	public abstract void url();
	
	//Non Abstract Methods
	public void loading()
	{
		System.out.println("Page Loading in 20 seconds");
	}
	
}
