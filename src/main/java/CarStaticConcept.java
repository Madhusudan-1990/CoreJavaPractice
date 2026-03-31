/*
 * Metaspace (Earlier PermGen):
 * 
 * - In modern JVMs, class metadata is stored in Metaspace (introduced in Java 8)
 * - It replaces the older PermGen space
 * 
 * Static Variables:
 * - Stored in the method area (associated with class metadata, not objects)
 * - Belong to the class, not individual instances
 * - Shared across all objects of the class
 * 
 * Note:
 * - "Common Memory Area (CMA)" is an informal term, not an official JVM term
 * 
 * Local Variables:
 * - Cannot be declared as static
 * - static keyword is applicable only to class-level (member) variables, methods, blocks, and nested classes
 * 
 * static final:
 * - Used to declare constants
 * - Value is initialized once and cannot be changed
 * 
 * Example:
 *   static final int MAX_USERS = 100;
 * 
 * Static Classes:
 * - Top-level classes cannot be static
 * - Only nested classes can be declared static
 * 
 * Example:
 *   class Outer {
 *       static class Inner {
 *       }
 *   }
 */
public class CarStaticConcept {

	String name;
	int price;
	String modelNumer;
	static final int wheels = 4; // Common Property(Static Class Variable).
	public static void main(String[] args) {
		
		CarStaticConcept c1 = new CarStaticConcept();
		c1.name = "BMW";
		c1.price = 500000;
		c1.modelNumer = "X1";
		
		CarStaticConcept c2 = new CarStaticConcept();
		c2.name = "Audi";
		c2.price = 600000;
		c2.modelNumer = "Q3";
		
		CarStaticConcept c3 = new CarStaticConcept();
		c3.name = "Benz";
		c3.price = 800000;
		c3.modelNumer = "M Series";
		
		// Access Static Variable
		//1. Using Class Name
		System.out.println(CarStaticConcept.wheels);
		
		//2. Using Directly
		System.out.println(wheels);
		
		//3. Accessing with Object Reference shows warning. Not a good practice.
		System.out.println(c1.wheels);
		
		// Access non static variables using object reference name
		System.out.println(c1.name + " " + c1.price + " " +  " " + c1.modelNumer);
		System.out.println(c2.name + " " + c2.price + " " +  " " + c1.modelNumer);
		System.out.println(c3.name + " " + c3.price + " " +  " " + c1.modelNumer);
		

	}

}
