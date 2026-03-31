/*
 * Method Overloading:
 * Method overloading is an example of Compile-Time Polymorphism.
 *
 * It occurs when multiple methods in the same class have:
 *   - Same method name
 *   - Different number of parameters, OR
 *   - Different types of parameters, OR
 *   - Different order (sequence) of parameters
 *
 * Return type:
 *   - Return type alone is not sufficient for method overloading.
 *   - It must differ in parameter list.
 *
 * Purpose of Method Overloading:
 *   - Improves code readability and reusability
 *   - Allows performing similar operations in different ways
 *
 * Example:
 *   add(int a, int b)
 *   add(int a, int b, int c)
 *   add(double a, double b)
 */
public class MethodOverLoading {

	public int test()
	{
		System.out.println("test 1 method");
		return 100;
	}
	
	public double test(int a)
	{
		System.out.println("test 2 method");
		return 12.33;
	}
	
	public void test(String x)
	{
		System.out.println("Test 3 method");
	}
	
	public void test(String x, String y)
	{
		
	}
	public void test(String a, int b)
	{
		System.out.println(a+b);
	}
	
	public int test(int a, String b)
	{
		return 100;
	}
	
	// Real time example for method overloading
	public double calculateTax(int totalIncome, int bonus, int stocksProfit)
	{
		System.out.println("Calculating Total Tax with Stocks");
		double totalTax = (totalIncome*30)/100+(bonus*5)/100 +(stocksProfit*2)/100;
		return totalTax;
	}
	
	public double calculateTax(int totalIncome, int bonus)
	{
		System.out.println("Calculating Total Tax without Stocks");
		double totalTax = (totalIncome*30)/100+(bonus*5)/100;
		return totalTax;
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverLoading m = new MethodOverLoading();
		m.test("naveen", 0);

		// Calling Real Time Scenario for method overloading
		double taxWithStocks = m.calculateTax(1000, 500, 20);
		System.out.println(taxWithStocks);
		
		double taxWithoutStocks = m.calculateTax(1000, 300);
		System.out.println(taxWithoutStocks);
	}

}
