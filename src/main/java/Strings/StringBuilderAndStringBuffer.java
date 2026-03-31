package Strings;

/*
 * No entry in SCP for both StringBuilder and StringBuffer. Only one object is created in the heap
 * When there's a requirement for heavy manipulations , then String Builder or String Buffer would be better choice than Strings
 * reverse() 
 */
public class StringBuilderAndStringBuffer {

	public static void main(String[] args) 
	{
		//StringBuilder : 1.5 (Latest) compatible with multi thread, supports parallel execution
		StringBuilder sb = new StringBuilder("selenium");
		
		sb.append("automation");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
		//StringBuffer(Legacy) : 1.0 : Thread Safe (Slower) synchronized thread, supports only sequential execution
		
		StringBuffer sb1 = new StringBuffer("selenium");
		System.out.println(sb1.reverse());
		
		

	}

}
