package JavaPrograms;

import org.testng.annotations.Test;

public class SwapVariablesWithoutThirdVariable 
{
	@Test
	public void swapWithoutThirdVariable()
	{
		int x = 5;
		int y = 10;
		
		//1 . With 3rd Variable
//		int t;
//		t=x;
//		x=y;
//		y=t;
		
		//2. Without using 3rd variable with + and - operator
		
//		x = x+y; //15
//		y = x-y; //5
//		x = x-y; //10
		
		//3 Without using 3rd variable with * and / operator
		
		x = x*y; //50
		y = x/y; //5
		x = x/y; //10
		
		System.out.println("x :" +x);
		System.out.println("y :" +y);

	}

}
