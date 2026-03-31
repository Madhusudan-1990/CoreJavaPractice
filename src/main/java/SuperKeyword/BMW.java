package SuperKeyword;
/*
 * super Keyword:
 *
 * The 'super' keyword is used to refer to the immediate parent class.
 *
 * Uses:
 * 1. Access parent class variables:
 *    super.variableName;
 *
 * 2. Call parent class methods:
 *    super.methodName();
 *
 * 3. Call parent class constructor:
 *    super(); or super(parameters);
 *
 * Constructor Rules:
 * - super() must be the first statement in the child class constructor.
 * - If not written explicitly, the compiler inserts super() automatically
 *   (only if parent has a no-arg constructor).
 *
 * Important Notes:
 * - super refers only to the immediate parent class.
 * - It is used in inheritance (child classes).
 * - If a method is overridden, parent method can be called using super.method().
 *
 * Static Methods:
 * - Static methods belong to the class, not the object.
 * - They should be accessed using ClassName.methodName().
 * - super is generally not used for static methods (not recommended).
 *
 * ---------------------------------------------------------
 * this Keyword:
 *
 * - 'this' refers to the current class object.
 *
 * Uses:
 * 1. To refer to current class instance variables:
 *    this.variableName = variableName;
 *
 * 2. To call current class methods:
 *    this.methodName();
 *
 * 3. Constructor chaining:
 *    this(); or this(parameters);
 *
 * Constructor Rules:
 * - this() must be the first statement in the constructor.
 *
 * Important Rules:
 * - this() and super() cannot be used together in the same constructor
 *   (because both must be the first statement).
 * - Recursive constructor chaining is not allowed.
 *
 * Advanced:
 * - 'this' can be returned from a method (used in Builder Pattern).
 */
public class BMW extends Car
{
	int  speed = 300;
	@Override
	public void start()
	{
		super.start(); // Car
		System.out.println("BMW --- Start");
		super.refuel();
	}
	
	public void autoParking()
	{
		System.out.println("BMW --- autoParking");
		//start();//bmw 
		super.start();
	}
	
	public void displaySpeed()
	{
		System.out.println("Speed is "+speed);
		System.out.println("Parent Speed is : "+super.speed);
	}
}
