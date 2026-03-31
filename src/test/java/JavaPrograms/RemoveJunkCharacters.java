package JavaPrograms;

import org.testng.annotations.Test;

public class RemoveJunkCharacters 
{
	@Test
	public void testRemoveJunk()
	{
	String s = "笔记本/筆記本 latin string 0123456789";
	
	String s1 = "@#$#$@#$@# testing )_)#@(#$@@#$@#  Selenium #$@{}{}{}{ java";
	
	//Use Regular Expressions : [^a-zA-Z0-9] --> This is the regular expression to remove everything except characters from a-z and A-Z and 0-9 and "^" denotes Not. [a-zA-Z0-9] --> this is regular expression to remove a-z and A-Z and 0-9 
	
	s = s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
	
	s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s1);
	
	}
}
