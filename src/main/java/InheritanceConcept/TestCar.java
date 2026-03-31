/*
 * Upcasting:
 * 
 * Upcasting is when a child class object is referred to by a parent class reference.
 * 
 * Example:
 * Parent obj = new Child();
 * 
 * Key Points:
 * - You can access:
 *     ✔ Overridden methods (child implementation executes at runtime)
 *     ✔ Inherited methods from parent
 * 
 * - Only inherited and overridden methods are accessible in upcasting
 * 
 * - You CANNOT access:
 *     ❌ Child-specific methods (not present in parent reference)
 * 
 * - Method execution is decided at runtime (Runtime Polymorphism)
 * 
 * - Variable access is based on reference type (Parent)
 * 
 * ---------------------------------------------------------
 * Downcasting:
 * 
 * Downcasting is converting a parent reference back to a child type.
 * 
 * Example (Valid):
 * Parent obj = new Child();   // Upcasting
 * Child c = (Child) obj;      // Downcasting (safe)
 * 
 * Key Points:
 * - Downcasting requires explicit casting
 * - It is safe ONLY when the object is actually of child type
 * 
 * Invalid Case:
 * Parent obj = new Parent();
 * Child c = (Child) obj;  // Compiles, but throws ClassCastException at runtime
 * 
 * Explanation:
 * - Compiler allows it (valid syntax)
 * - At runtime, object is not of Child type → ClassCastException occurs
 */
package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) 
	{
		BMW bm = new BMW();
		bm.start(); //Overriden
		bm.refuel(); //Inherited
		bm.stop(); //Inherited
		bm.autoParking(); //Individual
		
		// Top Casting / Up Casting
		Car c = new BMW();
		c.start();//Overriden
		c.refuel();//Overriden
		c.stop();//Overriden
		
		//Down Casting
		//BMW b1 = (BMW)new Car(); 
		
		//Composition
		BMW composition = new BMW();
		composition.bmwLoading();

	}

}
