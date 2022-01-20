package WageComputation;

public class EmpWageBuilderUC_2 {
	public static final int IS_FULL_TIME = 1;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		int Salary = 0;
		int WorkingHour = 0;
		double EmpCheck;

		EmpCheck = Math.floor(Math.random() * 10) % 2;
		if (EmpCheck == IS_FULL_TIME)
			WorkingHour = 8;
		else 		    
			WorkingHour = 0;
		Salary = WAGE_PER_HOUR * WorkingHour;
		System.out.println("Salary is : " + Salary);

	}
}

