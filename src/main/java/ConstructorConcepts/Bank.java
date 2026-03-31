package ConstructorConcepts;

public class Bank 
{
	
	private String name;
	private int age; // age>=15
	private String aadharNumber; // Aadhar number is made String as we don't per form any methematical operation
									// on it
	private String phone;

	public Bank(String name, int age, String aadharNumber, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.aadharNumber = aadharNumber;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
