/*
 * When to use a do-while loop:
 * A do-while loop ensures that the statements inside the loop are executed at least once,
 * before evaluating the condition.
 *
 * Use case:
 *   - Waiting for an element (where the action must be attempted at least once before checking)
 *
 * The break statement must be placed inside the do block.
 * It cannot be written after the while condition.
 *
 * The increment or decrement operation helps control the loop flow
 * and can act as a condition to eventually exit the loop.
 */

public class DoWhileConcept {

	public static void main(String[] args) {
		
		//Eg 1 
		int i = 1;
		do {
			System.out.println(i); //12345678910
			i++;
		}
		while(i<=10);
		
		//Eg 2 
				int a = 1;
				do {
					System.out.println(a); //1
					a++;
					break;
				}
				while(a<=10);
				
		
		//Eg 3
				int b = 10;
				do {
					System.out.println("b : "+b);
					b--;
				}
				while(true); // it goes to negative infinite loop

	}

}
