package WageComputation;

public class EmpWageBuilderUC_2 {
	public static void main(String[] args) {

		// Constants
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
        
		
        //Variables 
        int SALARY = 0;
        int WORKING_HOUR=0;
        
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
             WORKING_HOUR = 8;
		else 		    
		     WORKING_HOUR = 0;
		     SALARY=WAGE_PER_HOUR *WORKING_HOUR;
		     System.out.println("Salary is : " + SALARY);
		
		}
}

