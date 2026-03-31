package InheritanceConcept;

/*
 * Composition:
 * 
 * Composition is a "has-a" relationship where one class contains
 * an object of another class and uses its functionality.
 * 
 * - It represents strong association
 * - The contained object is usually dependent on the parent object
 * 
 * Example:
 * class Engine {
 *     void start() {
 *         System.out.println("Engine started");
 *     }
 * }
 * 
 * class Car {
 *     private Engine engine = new Engine();  // Composition
 * 
 *     void startCar() {
 *         engine.start();
 *     }
 * }
 * 
 * Key Points:
 * - Car HAS-A Engine
 * - Car uses Engine’s functionality
 * - No inheritance involved
 */
public class BMW extends Car 
{
	@Override 
	public void start()
	{
		System.out.println("Starting BMW");
	}
	
	public void autoParking()
	{
		System.out.println("Auto Parking BMW");
	}
	
	@Override
	public void refuel()
	{
		System.out.println("BMW Refuel");
	}
	
	@Override
	public void stop()
	{
		System.out.println("BMW Stop");
	}
	
	public void bmwLoading()
	{
		Truck tr = new Truck();
		tr.truckLoading();
	}

}
