package JavaPrograms;

public class CheckIsNumeric 
{
	public static boolean isEmpty(CharSequence cs)
	{
		return cs == null || cs.length() == 0;
	}
	
	public static boolean isNumeric(CharSequence cs)
	{
		if(isEmpty(cs))
		{
			return false;
		}
		int len = cs.length();
		for(int i = 0; i<len;i++)
		{
			if(!Character.isDigit(cs.charAt(i))) // This will filter all the input other than digits.
			{
				return false;
			}
			
		}  
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.println(isNumeric(null));
		System.out.println(isNumeric("34"));
		System.out.println(isNumeric("-34"));
		System.out.println(isNumeric("+34"));
		System.out.println(isNumeric("034"));
		System.out.println(isNumeric("@#@#34"));
		System.out.println(isNumeric("avasd34"));
		System.out.println(isNumeric("34DAsdasd"));
		System.out.println(isNumeric("0"));
		System.out.println(isNumeric("/@@#!@#"));
		System.out.println(isNumeric("3.4"));
	}

}
