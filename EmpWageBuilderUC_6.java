package WageComputation;

public class EmpWageBuilderUC_6 {
	 public static void main(String[] args) {
	      // Constants
		  int IS_PART_TIME=1;
	      int IS_FULL_TIME = 2;
		  int WAGE_PER_HOUR =20;
		  int NO_OF_DAYS=20;
		  int MAX_HOURS_IN_MONTH=100;
		  
		  //variables
		  int WORKING_HOUR=0;
		  int TOTAL_WORKING_HOUR=0;
		  int TOTAL_SALARY=0;
		  int SALARY=0;
		  int i=0;
		  
	      
	      System.out.println("Welcome to Employee Wage Computaion");
	     // Computation
	        while(i < NO_OF_DAYS && TOTAL_WORKING_HOUR <= MAX_HOURS_IN_MONTH) {
	    	   double empCheck = Math.floor(Math.random() * 10) % 3;
	    	   int Check= (int)empCheck;
	    	   switch(Check) {
	    	   
	    	   case 1:
	        	       WORKING_HOUR=8;
	        	       break;
	    	   case 2 :
	                   WORKING_HOUR=4;
	                   break;
	           default : 
	        	        WORKING_HOUR=0;
	        	        break;
	       }
	    	   i++;
	    	  SALARY= WAGE_PER_HOUR*WORKING_HOUR;
	    	  TOTAL_WORKING_HOUR+=WORKING_HOUR;
	    	   TOTAL_SALARY+=SALARY;
	    	   System.out.println("salary is  : " + SALARY);
	    }
	        System.out.println("total working hours are  : " + TOTAL_WORKING_HOUR);
	         System.out.println("total salary is  : " + TOTAL_SALARY);
  }
}
