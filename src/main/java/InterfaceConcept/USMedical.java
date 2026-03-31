package InterfaceConcept;

/*
 * Interface we can have static method with body
 */
public interface USMedical extends WHO
{
	static int MIN_FEE=20;
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	//Static Method
	public static void billing()
	{
		System.out.println("US Medical Billing ");
	}
	
	//Non Static Method
	default void medicalInsurance()
	{
		System.out.println("US Medical Medical Insurance");
	}

}
