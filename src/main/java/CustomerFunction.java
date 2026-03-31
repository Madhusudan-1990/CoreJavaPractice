
public class CustomerFunction {
	
	/* WAF : Create a function which will return customer marks on basis of given customer name
	 * name : getCustomerMarks(String name)
	 * return : marks(int)
	 * Return statements:
	 *   - A method can have single or multiple return statements.
	 *
	 *   - The 'return' statement exits the method immediately,
	 *     so using 'break' along with 'return' is unnecessary.
	 *
	 *   - In a switch case, if 'return' is used inside a case block,
	 *     there is no need to use 'break', as control exits the method directly.
	 */
	
	public int getIfElseCustomerMarks(String name)
	{
		int marks = -1;
		System.out.println("Customer Name is : "+ name);
		if(name.equals("Piyush"))
		{
//			return 90;
			marks = 90;
		}
		else if(name.equals("Vijay"))
		{
//			return 70;
			marks = 70;
		}
		else if(name.equals("Anuj"))
		{
//			return 95;
			marks = 95;
		}
		else
		{
			System.out.println("Please pass right customer name : "+ name);
			
		}
		return marks;
	}
	
	public int getCustomerMarksSwitchCase(String name)
	{
		System.out.println("Student Name : "+name);
		
		switch(name.toLowerCase().trim())
		{
		case "ankit":
			return 90;
		
		case "mohan" :
			return 50;
		
		
		case "anurag" :
			return 70;
			
			
		default :
			 System.out.println("Enter Correct Customer Name ");
			return -1;
		}
		
		
	}

	public static void main(String[] args) 
	{
		CustomerFunction c = new CustomerFunction();
		int m = c.getIfElseCustomerMarks("Anuj");
		System.out.println(m);
		
		int marks = c.getCustomerMarksSwitchCase("anuchet");
		System.out.println(marks);
		if(marks>0)
		{
			System.out.println("Print MarkSheets");
		}

	}

}
