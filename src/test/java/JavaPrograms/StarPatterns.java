package JavaPrograms;

import org.testng.annotations.Test;

public class StarPatterns 
{
	/*
	 
	 * 
	 **
	 ***
	 ****
	 *****
	 
	 */
	@Test
	public void pattern1()
	{
		for(int i=0;i<=4; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 
	*****
	****
	***
	**
	*
	 */
	@Test
	public void pattern2()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 
	*
	**
	***
	****
	
	 */
	@Test
	public void pattern3()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 	*
	   * *
      * * *
     * * * *
	 */
	@Test
	public void pattern4()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	// ** Printing the Alphabet pattern**
	/*
	 * A
	 * A B
	 * A B C
	 * A B C D
	 * A B C D E
	 * A B C D E F
	 */
	@Test
	public void alphabetPattern()
	{
		int alpha = 97;
		for(int i=0; i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j) + " ");//65+0=65->A
			}
			System.out.println();
		}
	}

}
