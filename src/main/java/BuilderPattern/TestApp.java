package BuilderPattern;


public class TestApp {

	public static void main(String[] args) 
	{
		Application app = new Application();
		
		//Worflow Chain Scenario :
		
		//1
		app.login("naveen@gmail.com","pass")
			.search("Bag", 200)
				.addToCart("Bag")
					.doPayment("naveen@okicici")
						.generateOrder()
							.logout();
		
		//2
		app.login("naveen@gmail.com","pass")
		.search("Bag", 200)
			.addToCart("Bag")
				.doPayment("0934 0903 0984 9739", 122)
					.generateOrder()
						.logout();
		
		//3
		app.login("naveen@gmail.com","pass")
			.search("Bag")
				.logout();
		
		
	}

}
