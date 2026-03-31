package InterfaceConcept;

import InheritanceConcept.Medical;

public class FortisHospital extends Medical implements USMedical,UKMedical,INDMedical
{
	
   static int MIN_FEE = 50;
	
	@Override
	public void physioServices() {
		System.out.println("cardioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("dentalServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("cardioServices");
		
	}

	@Override
	public void arthoServices() {
		System.out.println("arthoServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("neuroServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("entServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("pediaServices");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("dermaServices");
		
	}
	
	public void medicalTrainingServices() {
		System.out.println("medicalTrainingServices");
		
	}
	
	public void pathoServices() {
		System.out.println("pathoServices");
		
	}

	
	//Common method
	@Override
	public void emergencyServices() {
		System.out.println("emergencyServices");
		
	}
	
	//Method Hiding
	public static void billing()
	{
		System.out.println("Fortis billing");
	}
	
	@Override
	public void medicalInsurance()
	{
		System.out.println("US Medical Medical Insurance");
	}

	@Override
	public void covidVaccination() {
		System.out.println("Covid Vacination");
		
	}

}
