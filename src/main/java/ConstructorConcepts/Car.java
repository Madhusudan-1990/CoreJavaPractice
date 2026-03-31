package ConstructorConcepts;

public class Car 
{
	String name;
	String color;
	double price;
	String model;
	String chassisNumber;
	
	public Car(String name, String color) {

		this.name = name;
		this.color = color;
	}
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, String color, double price, String model) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	public Car(String name, String color, double price, String model, String chassisNumber) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chassisNumber = chassisNumber;
	}

	public static void main(String[] args) 
	{
		Car c1 = new Car("BMW", 50.44);
		Car c2 = new Car("BMW", "Red", 80.33, "X3");
		Car c3 = new Car("Audi", "Green", 67.2, "q3", "23123xXlkkjlkjs");
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.chassisNumber + " " + c1.color);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.chassisNumber + " " + c2.color);
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.chassisNumber + " " + c3.color);

	}

}
