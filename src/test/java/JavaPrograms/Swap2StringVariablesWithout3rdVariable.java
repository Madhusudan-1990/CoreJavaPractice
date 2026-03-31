package JavaPrograms;

import org.testng.annotations.Test;

public class Swap2StringVariablesWithout3rdVariable 
{
	@Test
	public void swapStrings()
	{
		String a = "Hello";
		String b = "World";
		
		System.out.println("a value before swapping : "+a);
		System.out.println("b value before swapping : "+b);
		// 1. append a and b
		a = a+b; // HelloWorld ==> a = HelloWorld
		
		// 2. Store initial string a in string b
		b = a.substring(0, a.length()-b.length()); // This will give Hello ==> b = Hello
		
		// 3. Store initial string b in string a
		a = a.substring(b.length()); // This will give World ==> a = World
		
		
		System.out.println("a value after swapping : "+a);
		System.out.println("b value after swapping : "+b);
		
	}

}
