package oops_Q2;

public class Manager extends Employee {
	
	double NightShiftPremium;
	double overTime;
	
	public Manager(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double NightShiftPremium, double overTime) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.NightShiftPremium = NightShiftPremium;
		this.overTime = overTime;
	}
	
	@Override
	public void CalcSalary() {
		this.sal = this.getBasic() + this.overTime + this.NightShiftPremium + this.getAllowance() - this.getDeductions();
	}
}