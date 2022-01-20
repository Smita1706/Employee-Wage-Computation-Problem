package WageComputation;

public class EmpWageBuilderUC_1 {
	public static final int IS_FULL_TIME = 1;
	public static void main(String[] args) {
		double EmpCheck;
		EmpCheck = Math.floor(Math.random() * 10) % 2;
		if (EmpCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
	}
}