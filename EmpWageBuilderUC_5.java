package WageComputation;

public class EmpWageBuilderUC_5 {
	 // Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME = 2;
	public static final int WAGE_PER_HOUR =20;
	public static final int NO_OF_DAYS=20;
	
	 public static void main(String[] args) {		  
		  //variables
		  int WORKING_HOUR=0;
		  int TOTAL_SALARY=0;
		  int SALARY=0;
		  
	      
	      System.out.println("Welcome to Employee Wage Computaion");
	     // Computation
	         for(int days=0 ;days<NO_OF_DAYS ;days++) {
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
	    	  SALARY= WAGE_PER_HOUR*WORKING_HOUR;
	    	   TOTAL_SALARY+=SALARY;
	    	   System.out.println("salary is  : " + SALARY);
	    }
	         System.out.println("total salary is  : " + TOTAL_SALARY);
  }
}
