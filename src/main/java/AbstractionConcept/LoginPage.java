package AbstractionConcept;

public class LoginPage extends Page
{
	public LoginPage()
	{
		System.out.println("Calling LoginPage Abstract Class Default Constructor");
	}
	
	public LoginPage(int a)
	{
		System.out.println("Calling LoginPage Abstract Class Paremeterized Constructor"+a);
	}

	@Override
	public void title() {
		System.out.println("Login Page Title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page Url");
		
	}
	
	@Override
	public void loading() // Overriding Non Abstract Method (not Mandatory)
	{
		System.out.println("Page Loading in 5 seconds");
		
	}
	
	//Individual 
	public void doLogin()
	{
		System.out.println("Logged in");
	}

}
