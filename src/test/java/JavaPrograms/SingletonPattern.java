package JavaPrograms;

//Singleton Pattern is one of the java design pattern where a class can have only one object at a time.
//After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. 
	//How to design singleton class :
	//1. Make constructor private.
	//2. Write a static method that return type of object of this singleton class.(Lazy Initialization)

public class SingletonPattern 
{
	private static SingletonPattern single_instance = null;
	
	public String str;
	
	private SingletonPattern()
	{
		str = "Hey, I am using singleton class pattern";
	}
	
	public static SingletonPattern getInstance()
	{
		if(single_instance == null)
		{
			single_instance = new SingletonPattern();
			
		}
		return single_instance;	
	}
	
	public static void main(String[] args)
	{
		SingletonPattern x = SingletonPattern.getInstance();
		SingletonPattern y = SingletonPattern.getInstance();
		SingletonPattern z = SingletonPattern.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);  // All the 3 object reference points to same object
		System.out.println(y.str); 
		System.out.println(z.str);
	}
	
	

}
