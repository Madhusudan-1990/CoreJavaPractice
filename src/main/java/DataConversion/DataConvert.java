package DataConversion;

/*
 * For primitive data type always use == operator for comparison and for non primitive data type always use  .equals()
 */
public class DataConvert {

	public static void main(String[] args) 
	{
		//String to Integer
		String s = "100";
		System.out.println(s+100);//10020
		
		//Wrapper Class
		int i = Integer.parseInt(s);
		System.out.println(i+20);//120
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		String y = "100A";
		//int j = Integer.parseInt(y);//NFE(NumberFormatException)
		int j = Integer.parseInt(y.replace("A", ""));
		System.out.println(j+20);
		
		
		//String to Double
		String s1 = "100.33";
		double d = Double.parseDouble(s1);
		System.out.println(d+20);
		
		// int to String
		int t = 100;
		System.out.println(t+20);//120
		String e = String.valueOf(t); 
		System.out.println(e+20);//10020
		
		//double to String
		double marks = 200.02;
		System.out.println(marks + 20);//220.02
		String s2 = String.valueOf(marks);
		System.out.println(s2+20);//200.0220
		
		//String to boolean
		String tr = "TRUE"; //true//TRUE
		Boolean flag = Boolean.parseBoolean(tr);
		System.out.println(flag); //true
		if(flag)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		//boolean to String
		boolean flag1 = true;
		String s3 = String.valueOf(flag1);
		System.out.println(s3+20);
		
		//char to String
		char ch = 'A';
		String s4 = String.valueOf(ch);
		System.out.println(s4+20);
		
		//char array to String
		char[] chArray = {'s','e','l','e','n','i','u','m'};
		String charToString = String.valueOf(chArray);
		System.out.println(charToString);//selenium
		
	
		Integer v = 100;
		Integer v2 = 100;
		if(v==v2)
		{
			System.out.println("hi");
		}
		if(v.equals(v2))
		{
			System.out.println("hello");
		}
		
		//Escaping the double quotes " " 
		String rest = "I love \"java\" code";
		System.out.println(rest);//I Love "java" code
		

	}

}
