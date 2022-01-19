package WageComputation;

public class EmpWageBuilderUC_4 {
	 // Constants
	  public static final int IS_PART_TIME=1;
	  public static final int IS_FULL_TIME = 2;
	  public static final int WAGE_PER_HOUR =20;
	public static void main(String[] args) {
		
		 //variables
		  int WORKING_HOUR=0;
		  int TOTAL_SALARY=0;
	      
	     // Computation 
	    	   int empCheck =(int) Math.floor(Math.random() * 10) % 3;
	    	   switch(empCheck) {
	    	   
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
	    	   TOTAL_SALARY= WAGE_PER_HOUR*WORKING_HOUR;
	    	   System.out.println("salary is  : " + TOTAL_SALARY);
  }
}
