package WageComputation;

public class EmpWageBuilderUC_6 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int NO_OF_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public static void main(String[] args) {
		int WorkingHour = 0;
		int TotalWorkingHour = 0;
		int TotalSalary = 0;
		int Salary = 0;
		int Days = 0;
		int EmpCheck;

		while(Days < NO_OF_DAYS && TotalWorkingHour <= MAX_HOURS_IN_MONTH) {
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
			Days++;
			Salary = WAGE_PER_HOUR * WorkingHour;
			TotalWorkingHour = TotalWorkingHour + WorkingHour;
			TotalSalary = TotalSalary + Salary;
			System.out.println("salary is  : " + Salary);
		}
		System.out.println("total working hours are  : " + TotalWorkingHour);
		System.out.println("total salary is  : " + TotalSalary);
	}
}
