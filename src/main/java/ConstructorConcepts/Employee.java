package ConstructorConcepts;

/*
 * Constructor in Java:
 *
 * - A constructor has the same name as the class.
 *
 * - It looks like a method but is not a regular method.
 *   It is a special block used for object initialization.
 *
 * - A constructor does not have any return type
 *   (not even void).
 *
 * - Constructors are used to initialize instance variables.
 *
 * - Constructor overloading is supported
 *   (multiple constructors with different parameters).
 *
 * - A constructor is automatically called when an object is created.
 *
 * - It is recommended to avoid heavy business logic inside constructors.
 *   Constructors should primarily be used for initialization.
 *
 * - If no constructor is defined, Java provides a default constructor.
 *
 * - Defining a parameterized constructor helps control how objects are created
 *   and ensures required data is provided during object creation.
 */
public class Employee {

	String name;
	int age;
	double salary;
	char gender;
	
	//Avoid creating Default Constructor
//	public Employee()
//	{
//		System.out.println("Default Constructor");
//	}
	
	// Over Loading Constructor
	public Employee(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public Employee(String name, int age, double salary,char gender)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	public static void main(String[] args) 
	{
		
//		Employee e1 = new Employee();
		Employee e2 = new Employee("Amar", 30);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " +e2.gender);
		//Update Salary of Amar
		e2.salary = 45.5;
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " +e2.gender);
		
		Employee e3 = new Employee("Kiran", 32, 35.40, 'M');
		System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " +e3.gender);

	}

}
