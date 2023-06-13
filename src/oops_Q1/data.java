package oops_Q1;

public class data {

	public static void main(String[] args)  {
		Student student1 = new Student();
		student1.setName("Simran Manturgimath");
		student1.setAddress("Fairfax");
		student1.setCourse("React");
		student1.setMobileNo("7033897074");
		student1.setStudentId(1);
		System.out.println(" Student Id: " + student1.getStudentId() + " \n Name: " + student1.getName() + " \n Address: "
				+ student1.getAddress() + " \n Mobile: " + student1.getMobileNo() + " \n Course: " + student1.getCourse() + " \n Fees: "
				+ student1.calculateFee(student1.getCourse()));
		
		System.out.println();
		Student student2 = new CorporateBatchStudent();
		student2.setName("Sajina Ali");
		student2.setAddress("Fairfax");
		student2.setCourse("Hibernate");
		student2.setMobileNo("7033897074");
		student2.setStudentId(2);
		System.out.println(" Student Id: " + student2.getStudentId() + " \n Name: " + student2.getName() + " \n Address: "
				+ student2.getAddress() + " \n Mobile: " + student2.getMobileNo() + " \n Course: " + student2.getCourse() + " \n Fees: "
				+ student2.calculateFee(student1.getCourse()));
		
		
	}
}