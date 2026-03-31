/*
 * Functions / Methods in Java:
 * Methods are independent blocks of code that perform specific tasks.
 * They exist at the class level and are independent of each other.
 *
 * Java does not support defining a method inside another method.
 * However, one method can call another method.
 *
 * Class Data Members:
 *   - Class Variables:
 *       - Static (shared across all objects)
 *       - Non-static (specific to each object)
 *
 *   - Class Methods:
 *       - Static methods
 *       - Non-static methods
 *
 * Return Types:
 *   - 'void' means the method does not return any value.
 *   - Void methods are typically used for performing actions (e.g., click, print, update).
 *
 *   - The 'return' keyword can still be used in a void method,
 *     but only to exit the method(blank return) (without returning any value).
 *
 *   - If a method needs to return a value, use appropriate return types
 *     like int, String, boolean, etc.
 *
 *   - A method can take input (parameters) even if it returns void.
 *
 * Parameters vs Arguments:
 *   - Parameters: Variables defined in the method declaration.
 *   - Arguments: Actual values passed during method call.
 */
public class FunctionsInJava {
	
	public void display() //0 Param
	{
		System.out.println("Display Output");
	}
	
	//1. No Input No Return
	public  void calc()
	{
		System.out.println("Calc Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2. No Input but some return : return type is int
	public int getNumber()
	{
		System.out.println("Get Number");
		int fee = 100;
		int tax = 20;
		int totalFee = fee+tax;
		return totalFee;
	}
	
	
	//3. Some input and no return
	public void add(int a, int b) // 2 Params (a,b)
	{
		System.out.println("Add numbers using Add function");
		int sum = a+b;
		System.out.println(sum);
	}
	
	//4. Some input and then return:
	public int addition(int a, int b)
	{
		System.out.println("Adding Numbers");
		int sum = a+b;
		return sum;
	}
	
	//5. void with return
	public void click(String element)
	{
		System.out.println("Clicking Element "+element);
		return;
	}
	public static void main(String[] args) 
	{
		FunctionsInJava obj = new FunctionsInJava();
		obj.display();
		obj.calc();
		obj.getNumber();
		obj.add(10, 20); // 2 Arguments(10,20)
		int p = obj.addition(30, 40);
		System.out.println("p : "+p);

	}

}
