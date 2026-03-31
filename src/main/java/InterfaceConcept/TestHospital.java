package InterfaceConcept;

import InheritanceConcept.Medical;

/*
 * Interface -> 100% Abstraction by default
 * Upcasting (with Interface):
 * 
 * A class implementing an interface can be referred using the interface reference.
 * 
 * Example:
 * InterfaceA obj = new ClassA();
 * 
 * Key Points:
 * - Only methods declared in the interface can be accessed
 * - Implementation-specific methods cannot be accessed
 * 
 * ---------------------------------------------------------
 * Downcasting (with Interface):
 * 
 * Downcasting is possible if the object actually belongs to the implementing class.
 * 
 * Example (Valid):
 * InterfaceA obj = new ClassA();
 * ClassA c = (ClassA) obj;  // Safe
 * 
 * Invalid Case:
 * InterfaceA obj = new ClassB();
 * ClassA c = (ClassA) obj;  // Compiles, but throws ClassCastException at runtime
 * 
 * ---------------------------------------------------------
 * Interfaces:
 * 
 * - Interface is a blueprint of a class
 * 
 * Methods:
 * - By default, methods are public and abstract
 * - From Java 8:
 *     ✔ static methods with body
 *     ✔ default methods (non-static with body)
 * - From Java 9:
 *     ✔ private methods (used internally within interface)
 * 
 * Default Methods:
 * - Can be overridden in implementing class
 * - Must be declared as public in the class
 * 
 * Variables:
 * - All variables are public, static, and final by default
 * 
 * Multiple Inheritance:
 * - A class can implement multiple interfaces
 * 
 * Syntax Rule:
 * - Class can extend only one class but implement multiple interfaces
 * 
 * Example:
 * public class FortisHospital extends Medical
 *         implements USMedical, UKMedical, INDMedical {
 * }
 */
public class TestHospital {

	public static void main(String[] args) 
	{
		FortisHospital fs = new FortisHospital();
		fs.physioServices();
		fs.entServices();
		fs.cardioServices();
		fs.dentalServices();
		fs.dermaServices();
		fs.neuroServices();
		fs.pediaServices();
		fs.arthoServices();
		fs.oncologyServices();
		fs.medicalTrainingServices();
		fs.pathoServices();
		fs.covidVaccination();
		
		fs.emergencyServices(); //commom method
		FortisHospital.billing(); // static method and method hiding
		
		fs.medicalInsurance(); // Default Method inherited from Interface
		
		
		USMedical us = new FortisHospital();
		us.oncologyServices();
		us.dentalServices();
		us.physioServices();
		us.emergencyServices();
		us.covidVaccination();
		
		USMedical.billing(); // static method and method hiding
		
		System.out.println(USMedical.MIN_FEE);
		System.out.println(FortisHospital.MIN_FEE);

	}

}
