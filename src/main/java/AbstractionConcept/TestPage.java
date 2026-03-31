package AbstractionConcept;

/*
 * Abstract Class:
 * 
 * An abstract class is a class declared with the abstract keyword.
 * 
 * Key Features:
 * - It can have both abstract methods (without body) and non-abstract methods (with body)
 * 
 * Abstraction Levels:
 * - 0% Abstraction → Yes (no abstract methods)
 * - 100% Abstraction → Yes (all methods abstract)
 * - Partial Abstraction → Yes (mix of both)
 * 
 * Object Creation:
 * - Abstract class cannot be instantiated directly
 * 
 * Upcasting:
 * - Child class object can be referred by abstract parent class reference
 * 
 * Example:
 * AbstractClass obj = new ChildClass();
 * 
 * Constructors:
 * - Abstract classes CAN have constructors
 * - Constructors are used to initialize common data
 * - They are invoked when child class object is created
 * 
 * Constructor Execution Order:
 * - Parent (abstract class) constructor executes first
 * - Then child class constructor executes
 * 
 * Important:
 * - Constructors in abstract classes are useful for initializing shared state
 * 
 * Constructor Rules:
 * - If parent has a default constructor → child can use default or parameterized constructor
 * - If parent has only parameterized constructor → child MUST explicitly call it using super()
 * 
 * Example Cases:
 * 
 * Case 1:
 * Parent()            → Child()                 ✅ Works
 * Parent()            → Child(int x)            ✅ Works
 * 
 * Case 2:
 * Parent(int x)       → Child()                 ❌ Compile-time error (super missing)
 * Parent(int x)       → Child(int x)            ✅ Works (super(x))
 * 
 * Abstract Method Rules:
 * - Abstract methods cannot be private
 * - Abstract methods cannot be final (must be overridden)
 * - Abstract methods cannot be static (cannot be overridden)
 */

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp1 = new LoginPage(); // Default Parent Class ---> Child Class Default
		LoginPage lp = new LoginPage(10); // Default Parent Class ---> Child Class Paremeterized Constructor
		lp.title();
		lp.url();
		lp.doLogin();

	}

}
