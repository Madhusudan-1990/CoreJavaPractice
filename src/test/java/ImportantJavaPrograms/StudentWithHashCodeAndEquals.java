package ImportantJavaPrograms;

import java.util.Objects;

public class StudentWithHashCodeAndEquals {
	private int id;
	private String name;

	// Constructor
	public StudentWithHashCodeAndEquals(int id, String name) {
	this.id = id;
	this.name = name;
	}

	// Getters and setters (omitted for brevity)
	// hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		StudentWithHashCodeAndEquals student = (StudentWithHashCodeAndEquals) obj;
		return id == student.id && Objects.equals(name, student.name);
	}

	public static void main(String[] args) {
		// Creating objects of Student class
		StudentWithHashCodeAndEquals student1 = new StudentWithHashCodeAndEquals(1, "Alice");
		StudentWithHashCodeAndEquals student2 = new StudentWithHashCodeAndEquals(2, "Bob");
		StudentWithHashCodeAndEquals student3 = new StudentWithHashCodeAndEquals(1, "Alice");
		// Testing equals method
		System.out.println("student1.equals(student2): " + student1.equals(student2)); // Output: false
		System.out.println("student1.equals(student3): " + student1.equals(student3)); // Output: true
		// Testing hashCode method
		System.out.println("Hashcode of student1: " + student1.hashCode());
		System.out.println("Hashcode of student2: " + student2.hashCode());
		System.out.println("Hashcode of student3: " + student3.hashCode());
	}
}
