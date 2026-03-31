/*
 * Calling B main from A main
 * This will run into Stack Over Flow because each main class will be calling each other and which leads to over flow of stack memory
 */

public class A {

	public static void main(String[] args) {
		
		System.out.println("A - main");
		B.main(args);

	}

}
