package oops_Q2;

public class PartTimeEmployee extends Employee {
	double hourlyRate;
	int hours;
	
	public PartTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double hourlyRate, int hours) {
		
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.hourlyRate=hourlyRate;
		this.hours=hours;
	}
	
	
    public void CalcSalary() {
        
        this.sal = this.hourlyRate * this.hours;
    }
	
}