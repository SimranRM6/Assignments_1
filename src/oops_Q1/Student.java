package oops_Q1;

public class Student {
    private int studentId;
    private String name;
    private String mobileNo;
    private String address;
    private String course;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 15) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name should not be greater than 15 characters.");
        }
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if (mobileNo.length() == 10) {
            this.mobileNo = mobileNo;
        } else {
            System.out.println("Invalid mobile number! Mobile number should have exactly 10 digits.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double calculateFee(String course) {
    	switch(course) {
		case "Java" : return 2000;
		case "Springboot" : return 1500;
		case "Hibernate" : return 2500;
		case "React" : return 2000;
		default : System.out.println("Please select a valid course"); 
			return 0;
	}
        
    }
}
