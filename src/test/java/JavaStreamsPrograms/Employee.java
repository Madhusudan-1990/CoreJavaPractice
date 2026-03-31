package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee 
{

	int empId;
	String name = "";
	float  salary;
	
	public Employee(int empId,String name,float salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		List<Employee> streamEmp = Arrays.asList(new Employee(1, "ABC", 20000),
												 new Employee(2, "BBB", 10000),
												 new Employee(3, "CCC", 15000),
												 new Employee(4, "DDD", 30000),
												 new Employee(5, "EEE", 50000));
		
		List<Float> empSalary = streamEmp.stream().filter(emp->emp.salary>=20000).map(emp->emp.salary).collect(Collectors.toList());
		empSalary.forEach(empSal->System.out.println("Employee Salary  Greater than equal to 20K :"+empSal));
		

	}

}
