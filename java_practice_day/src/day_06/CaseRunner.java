package day_06;

public class CaseRunner {
	/*
	 * Create CaseRunner class actualCase= Covid 19 isTested=true conclusion=Tested
	 * Negative if conclusion contains "negative" print "You can go to work" 
	 * otherwise print "15 days quarantine"
	 */

	public static void main(String[] args) {

		Case caseObject = new Case();

		caseObject.setActualCase("Covid 19");
		caseObject.setTested(true);
		caseObject.setConculusion("Tested Negative"); //Positive yazarsak You can go to the work 

		System.out.println("Actual Case: " + caseObject.getActualCase());
		System.out.println("Tested: " + caseObject.isTested());
		System.out.println("Conculusion: " + caseObject.getConculusion());

		if(caseObject.getActualCase().toLowerCase().contains("negative")) {
			System.out.println("You can go to the work");
		}else {
			System.out.println("15 days quarantine"); //15 days quarantine
		}
		
		//Create patient object or use Patient class
		Patient patient = new Patient();
		patient.setFirstName("Sade");
		patient.setLastName("Kate");
		System.out.println("Frist Name: "+patient.getFirstName());
		System.out.println("Last Name "+patient.getLastName());
		
		
		//setCaseOptions Accepts Case Object
        //Step: We are using setter to assing the value		
		patient.setCaseOptions(caseObject);
		
		//Step: Used class object and getter to print the values
		System.out.println(patient.getCaseOptions().getActualCase());
		System.out.println(patient.getCaseOptions().isTested());
		System.out.println(patient.getCaseOptions().getConculusion());
	}

		
}
