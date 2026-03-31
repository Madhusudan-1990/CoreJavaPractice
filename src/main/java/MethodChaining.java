/*
 * Method Calling in Java:
 *
 * 1. Non-static method calling static method:
 *    - Can be called directly or using ClassName.methodName()
 *
 * 2. Static method calling non-static method:
 *    - Requires object creation
 *
 *    Example:
 *      Test obj = new Test();
 *      obj.nonStaticMethod();
 *
 * 3. Non-static method calling another non-static method:
 *    - Can be called directly (direct calling)
 *
 * 4. Static method calling another static method:
 *    - Can be called directly or using ClassName.methodName()
 */

public class MethodChaining {

	// Method Chaining with Non Static Methods
	public void m1()
	{
		System.out.println("m1 method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2 method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 method");
		MethodChaining.t1(); // Non Static Method calling Static Method
	}
	
	// Method Chaining with  Static Methods
	public static void t1()
	{
		System.out.println("t1 method");
		t2();
	}
	public static void t2()
	{
		System.out.println("t2 method");
		t3();
	}
	public static void t3()
	{
		System.out.println("t3 method");
		
		MethodChaining m = new MethodChaining(); // Calling Non static Method inside Static Method
		m.m1();
		
	}
	
	public static void main(String[] args) 
	{
		
		MethodChaining m = new MethodChaining();
		m.m1();
		
		MethodChaining.t1();
	}

}
