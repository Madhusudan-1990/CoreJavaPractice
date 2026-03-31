package Encapsulation;

/*
 * Encapsulation:
 * 
 * Encapsulation is the process of hiding internal data and implementation details,
 * and exposing only the required functionality through controlled methods.
 * 
 * - Data members (variables) are made private
 * - Access is provided using public getter and setter methods
 * 
 * Getter:
 * - Used to read/access data
 * 
 * Setter:
 * - Used to modify/update data (can include validation logic)
 *   Example: Phone Number, Aadhar, Address etc.
 * 
 * Constructor vs Setter:
 * - Constructor is used to initialize data at the time of object creation
 * - Setter is used to update or modify data later
 * 
 * Note:
 * - Setter is optional (used only when data needs to be mutable)
 * - If no setters are provided, the object can be made immutable
 * 
 * Encapsulation also includes hiding internal implementation details (methods)
 * by making them private and exposing only required operations via public methods.
 * 
 * Validation:
 * - We can enforce conditions in both setters and constructors
 *   to ensure only valid data is assigned.
 * 
 * Important Clarification:
 * - Constructor does NOT update existing objects.
 * - It is only used during object creation.
 * - To change data in an existing object, setters are used.
 * - Creating a new object via constructor is different from updating an existing one.
 */
public class Employee 
{
	
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	
	public Employee(String name, int age, double salary, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
	//public methods : getter/setter
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
}
