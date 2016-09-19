package assignmentthree;

public class TemporaryEmployee extends Employee {

	
	public TemporaryEmployee(int empId, String empName, int total_leaves,
			double basic) {
		super(empId, empName, total_leaves, basic);
		// TODO Auto-generated constructor stub
	}
	int total;
	int paid_leave= 4,sick_leave= 2,casual_leave= 3;
	 double basic;
	double hra;
	double pfa;
	void print_leave_details(){
		System.out.println("Paid Leaves taken " + paid_leave);
		System.out.println("Sick Leaves taken " + sick_leave);
		System.out.println("Casual Leaves taken " + casual_leave);
	}
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		total = super.total_leaves-(paid_leave+sick_leave+casual_leave);
		System.out.println("Total Leaves Left for the employee "+ empId + " is " + total);
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		calculate_balance_leaves();
		if(total>no_of_leaves){
			switch (Character.toLowerCase(type_of_leave)) {
			case 'p':
				paid_leave = paid_leave + no_of_leaves;
				break;
			case 's':
				sick_leave = sick_leave + no_of_leaves;
				break;
			case 'c':
				casual_leave = casual_leave + no_of_leaves;
				break;
			default:
				System.out.println("Undefined leave type");
				break;
			}
			return true;
		}
		return false;
		
	}
	void calculate_salary() {
		// TODO Auto-generated method stub
		double salary;
		pfa = 0.12*super.total_salary;
		hra = 0.5*super.total_salary;
		salary = super.total_salary + pfa + hra;
		System.out.println("Total Salary for employee "+ empId +" Is " + salary);
	}
	


}
