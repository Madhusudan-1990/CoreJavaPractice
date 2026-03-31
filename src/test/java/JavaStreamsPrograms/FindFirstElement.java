package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class FindFirstElement 
{
	@Test
	public void findFirstEle()
	{
		List<String> names = Arrays.asList("Rama","Krishna","Narasimha","Govinda","Mukunda");
		Optional<String> firstName = names.stream().findFirst();
		System.out.println("First Name : "+firstName.get());
	}

}
