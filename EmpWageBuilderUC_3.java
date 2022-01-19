package WageComputation;

public class EmpWageBuilderUC_3 {
	public static void main(String[] args) {

		// Constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int WAGE_PER_HOUR = 20;
        
		
        //Variables 
        int SALARY = 0;
        int WORKING_HOUR=0;
        
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
               WORKING_HOUR = 8;
		else if (empCheck == IS_PART_TIME)
               WORKING_HOUR = 4;
		else 
		       WORKING_HOUR = 0;
		       SALARY=WAGE_PER_HOUR *WORKING_HOUR;
		       System.out.println("Salary is : " + SALARY);
		}
}
