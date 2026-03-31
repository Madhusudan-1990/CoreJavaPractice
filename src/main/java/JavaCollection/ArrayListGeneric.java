package JavaCollection;

//Generics are to be defined within <>
import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) 
	{
		List<Object> employeeData = new ArrayList<Object>(); // TopCasting
		employeeData.add("Madhu");
		employeeData.add(35);
		employeeData.add(20.2);
		employeeData.add('M');
		employeeData.add(true);
		
		
		employeeData.add("Sudi");
		employeeData.add(14);
		employeeData.add(10.2);
		employeeData.add('M');
		employeeData.add(true);
		
		employeeData.add("Amith");
		employeeData.add(34);
		employeeData.add(23.2);
		employeeData.add('M');
		employeeData.add(false);
		
		
		employeeData.add("Madhu");
		employeeData.add(35);
		employeeData.add(20.2);
		employeeData.add('M');
		employeeData.add(true);
		System.out.println(employeeData.size());
		
		for(Object obj : employeeData)
		{
			System.out.println(obj);
		}

		System.out.println(" Total Array Size : " + employeeData.size()); //20
		
//		employeeData.add(22, "Ani"); // AIOB as index 21 is not created 
		
		//For update use set() method. This is replace
		
		//Before Update
		System.out.println(employeeData.get(2)); //20.2
		
		//After Update
		employeeData.set(2, 50.2);
		System.out.println(employeeData.get(2));//50.2
		
		
	}

}
