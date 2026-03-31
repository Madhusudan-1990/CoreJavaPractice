package JavaStreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatStream3 
{
	int id;
	String name;
	int age;
	
	public FlatStream3(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) 
	{
		
		List<FlatStream3> flatList1 = new ArrayList<FlatStream3>();
		flatList1.add(new FlatStream3(01,"ABC", 20));
		flatList1.add(new FlatStream3(02,"BCC",39));
		flatList1.add(new FlatStream3(03,"CAB",32));
		
		List<FlatStream3> flatList2 = new ArrayList<FlatStream3>();
		flatList2.add(new FlatStream3(04,"DDA", 20));
		flatList2.add(new FlatStream3(05,"CDA",39));
		flatList2.add(new FlatStream3(06,"ADC",32));
		
		List<List<FlatStream3>> finalList = Arrays.asList(flatList1,flatList2);
		// Here stream of students is returned from student.stream() and later map is used to fetch the name of students and the collected to list
		finalList.stream().flatMap(student->student.stream()).map(student->student.name).collect(Collectors.toList()).forEach(student->System.out.println(student));
		
		

	}

}
