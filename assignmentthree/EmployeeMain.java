package assignmentthree;

public class EmployeeMain {

	public static void main(String[] args) {
		
		PermanentEmployee emp1 = new PermanentEmployee(1001, "aman", 30, 15000);
		TemporaryEmployee emp2 = new TemporaryEmployee(2001, "raj", 15, 10000);
		System.out.println(emp1.avail_leave(3,'c'));
		emp1.calculate_balance_leaves();
		System.out.println(emp1.avail_leave(4,'c'));
		emp1.calculate_salary();
		emp2.calculate_salary();
		}

}
