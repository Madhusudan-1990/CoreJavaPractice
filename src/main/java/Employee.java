/*
 * Class:
 * A class is a blueprint or template used to create objects.
 *
 * Object:
 * An object is a real-world entity created from a class.
 *
 * Class Variable (Static Variable):
 * A class variable is shared across all objects of the class.
 * It is declared using the 'static' keyword.
 * These variables can be initialized at the class level.
 *
 * Memory in Java:
 * Java memory is mainly divided into:
 *   - Stack Memory
 *   - Heap Memory
 *
 * Heap Memory:
 *   - Used to store objects
 *
 * Stack Memory:
 *   - Used to store reference variables and method calls
 *
 * No Reference Object:
 * An object created without assigning it to a reference variable.
 *
 * Example:
 *   new Employee();
 *
 * Garbage Collection:
 *   - Managed automatically by the JVM
 *   - System.gc() is only a request and does not guarantee execution
 *
 *   - Objects eligible for garbage collection:
 *       - Objects with no reference
 *       - Objects with null reference
 *
 *   - Garbage Collector works only on Heap Memory
 *     (it does not clean Stack Memory)
 */
 
public class Employee {
	
	String name;
	int age;
	double salary;
	char gender;
	boolean isPerm;
	
	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.isPerm);
		
		obj.name = "Amith";
		obj.age = 34;
		obj.salary = 34.5;
		obj.gender = 'M';
		obj.isPerm = true;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.isPerm);
		
		//No Reference Object -> 2 Objects are created unnecessarily leading to memory wastage.
		new Employee().name = "Tom";
		new Employee().age = 24;
		
		//Null Pointer Object Reference
//		Employee t1 = new Employee();
//		t1 = null;
//		t1.name = "Naveen"; // NPE
//		System.out.println(t1.name);
		
		// Assigning one reference variable to another (interview question)
		
		Employee emp1 = new Employee();
		emp1.name = "Tom";
		emp1.age = 33;
		emp1.salary = 28.5;
		

		Employee emp2 = new Employee();
		emp2.name = "Dick";
		emp2.age = 32;
		emp2.salary = 33.5;
		
		Employee emp3 = new Employee();
		emp3.name = "Harry";
		emp3.age = 35;
		emp3.salary = 40.5;
		
		
		
		emp1=emp2;
		
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.salary); //Dick
		System.out.println(emp2.name + " " + emp2.age + " " + emp2.salary); //Dick
		System.out.println(emp3.name + " " + emp3.age + " " + emp3.salary); //Harry
		
		System.out.println("----------------------------------------------");
		
		emp2=emp3;
		
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.salary);//Dick
		System.out.println(emp2.name + " " + emp2.age + " " + emp2.salary);//Harry
		System.out.println(emp3.name + " " + emp3.age + " " + emp3.salary);//Harry
		
		System.out.println("----------------------------------------------");
		
		emp3=emp1;
		
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.salary);//Dick
		System.out.println(emp2.name + " " + emp2.age + " " + emp2.salary);//Harry
		System.out.println(emp3.name + " " + emp3.age + " " + emp3.salary);//Dick
		
		System.out.println("----------------------------------------------");
		
		emp1=emp2=emp3; // Execution starts from RHS(em2=emp3) and then LHS(emp1=emp2)
		
		System.out.println(emp1.name + " " + emp1.age + " " + emp1.salary);//Dick
		System.out.println(emp2.name + " " + emp2.age + " " + emp2.salary);//Harry
		System.out.println(emp3.name + " " + emp3.age + " " + emp3.salary);//Dick
		
		System.out.println("----------------------------------------------");
		

	}

}
