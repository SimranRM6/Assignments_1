package oops_Q2;

public class FullTimeEmployee extends Employee {
	
	double overTime;
	public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double overTime) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.overTime=overTime;
	}
	
	@Override
	public void CalcSalary() {
		this.sal = this.getBasic()+this.overTime+this.getAllowance()-this.getDeductions();
	}
	
}