package WageComputation;

public class EmpWageBuilderUC_5 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int NO_OF_DAYS = 20;

	public static void main(String[] args) {		  
		int WorkingHour = 0;
		int TotalSalary = 0;
		int Salary = 0;
		int EmpCheck;
		int Days;

		for(Days=0 ;Days < NO_OF_DAYS ;Days++) {
			EmpCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch(EmpCheck) {
			case 1:
				WorkingHour = 8;
				break;
			case 2:
				WorkingHour = 4;
				break;
			default: 
				WorkingHour = 0;
				break;
			}
			Salary = WAGE_PER_HOUR * WorkingHour;
			TotalSalary = TotalSalary + Salary;
			System.out.println("salary is  : " + Salary);
		}
		System.out.println("total salary is  : " + TotalSalary);
	}
}
