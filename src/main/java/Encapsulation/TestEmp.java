package Encapsulation;

public class TestEmp {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		e1.setName("TOM");
//		String name = e1.getName();
//		System.out.println(name);
//		
//		e1.setAge(30);
//		int age = e1.getAge();
//		System.out.println(age);
//		
//		e1.setSalary(56.34);
//		double salary = e1.getSalary();
//		System.out.println(salary);
//		
//		e1.setPerm(true);
//		boolean isPerm = e1.isPerm();
//		System.out.println(isPerm);

		// Create - POST
		Employee e2 = new Employee("Vasu", 30, 23.22, true);

		// Retrieve - GET
		System.out.println(e2.getName() + " " + e2.getAge() + " " + e2.getSalary() + " " + e2.isPerm());

		// Update - PUT
		e2.setAge(31);
		e2.setSalary(45.09);

		// Retrieve - GET
		System.out.println(e2.getName() + " " + e2.getAge() + " " + e2.getSalary() + " " + e2.isPerm());

	}

}
