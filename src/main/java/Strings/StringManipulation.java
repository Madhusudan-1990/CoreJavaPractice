package Strings;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String str = "hi this is my java code and i am so happy";
//		String str2 = "hello hi this is my java code and i am so happy";
		
		//1. Length of string
		System.out.println(str.length()); //41
		
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (str.length()-1));
		
		//2. charAt()
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(10));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//SIOB
		//System.out.println(str.charAt(-1));//SIOB
		
		//3. indexOf()
		System.out.println(str.indexOf('h')); //0
		System.out.println(str.indexOf('i')); //1 always returns 1st occurance
		System.out.println(str.indexOf('a'));//15
		
		// 2nd Occurance
		System.out.println("2nd Occurance " + str.indexOf('i', str.indexOf('i')+1)); // This would return 2nd occurrance of 'i' irrespective of 1st position of i
		
		//3rd Occurance
		int sencondOccurance = str.indexOf('i', str.indexOf('i')+1);
//		System.out.println("2nd Occurance : " + sencondOccurance); //5
		//Printing 3rd Occurance
		System.out.println("3rd Occurance " + str.indexOf('i', sencondOccurance+1)); //8
		
		//4th Occurance
		
		int thirdOccurance = str.indexOf('i', sencondOccurance+1);
		System.out.println("4th Occurancce : "+ str.indexOf('i', thirdOccurance+1)); //28
		
		//4. indexOf()->String
		System.out.println(str.indexOf("java")); //14
		System.out.println(str.indexOf("python")); //-1
		
		//Wrong way of validation if the string is String mesg = "admin welcome"
		String mesg = "welcom admin";
		if(mesg.indexOf("admin")>0)
		{
			System.out.println("admin is present");
		}
		else
		{
			System.out.println("admin is not present");
		}
		
		//5. trim() -> Removes trailing spaces(from corners) not in between
		String s1 = " Hello World ";
		System.out.println(s1.trim());
		
		//6. Lower and UpperCase:
		String s2 = "Hello JAva World";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		//7. replace()
		String s3 = "09-Dec-1990";
		System.out.println(s3.replace("-", "/"));
		
		String s4 = "Hello Java    World"; //remove spaces in between
		System.out.println(s4.replace(" ", ""));
		
		//8 containes() - > returns boolean
		String s5 = "I Love Java Coding";
		System.out.println(s5.contains("Java")); // true
		System.out.println(s5.contains("Pythons")); // false
		
		//9 equals() : Compares based on object
		String s6 = "Hello Selenium";
		String s7 = "Hello Selenium";
		String s8 = "Hello selenium";
		
		System.out.println(s6.equals(s7)); //true
		System.out.println(s7.equals(s8)); //false
		System.out.println(s7.equalsIgnoreCase(s8)); //true
		
		//10 split() -> return type of split() is string [] 
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		System.out.println(lang.split("_"));
		
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		System.out.println(lg[1]);
		System.out.println(lg[2]);
		System.out.println(lg[3]);
		
		System.out.println(Arrays.toString(lg));
		
		String pop = "xXHelloXxXSeleniumXTestingXxXGoogleX";
		
		String pp[] = pop.split("xX");
		System.out.println(pp[0]);//nothing . Split happens between x and X. and the there's no index before 'x'
		System.out.println(pp[1]);//HelloX
		System.out.println(pp[2]);//SeleniumXTestingX
		System.out.println(pp[3]);//GoogleX
//		System.out.println(pp[4]);//AIOB
		
		
		System.out.println("naveen;automation;labs".split(";")[0]);//naveen
		
		
		String otp = "your otp number is 09324";
		String [] extractOtp = otp.split(" ");
		int highestIndex = extractOtp.length-1;
		System.out.println(extractOtp[highestIndex]); //09324
		
		
		
	}

}
