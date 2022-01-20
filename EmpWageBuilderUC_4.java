package WageComputation;

public class EmpWageBuilderUC_4 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		int WorkingHour = 0;
		int TotalSalary = 0;
		int EmpCheck;

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
		TotalSalary = WAGE_PER_HOUR * WorkingHour;
		System.out.println("salary is  : " + TotalSalary);
	}
}
