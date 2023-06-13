package oops_Q2;

public class NightShiftEmployee extends Employee {
	
	double NightShiftPremium;
	
	public NightShiftEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double NightShiftPremium) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.NightShiftPremium = NightShiftPremium;
	}
	
	@Override
	public void CalcSalary() {
		this.sal = this.getBasic() + this.getAllowance() + this.NightShiftPremium - this.getDeductions();
	}

}