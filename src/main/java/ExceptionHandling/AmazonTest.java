package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) 
	{
		String browser = "naveen";
		
		switch(browser)
		{
		case "chrome":
				System.out.println("Launch Chrome");
				break;
		case "firefox":
				System.out.println("Launch FF");
				break;
		case "edge":
				System.out.println("Launch edge");
				break;
		case "safari":
				System.out.println("Launch safari");
				break;
		default:
				System.out.println("Pass Correct Browser");
				throw new MyException("==========Wrong Browser PASSED=======");
			
				
		}
		
		System.out.println("Launch Browser");
		System.out.println("Login to app");
		System.out.println("Shop a product");
		System.out.println("close browser");

	}

}
