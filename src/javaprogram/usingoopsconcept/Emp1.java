package javaprogram.usingoopsconcept;

public class Emp1 extends Employee {

	String empRol;
	public Emp1(int empId, String empName, int empSal, String empRole) {
		super(empId, empName, empSal);
		this.empRol = empRole;
	}

	 
	@Override
	public String toString() {
		return "empId=" + empId +"\n"+ "empName=" + empName +"\n" + "empSal=" + empSal +"\n"
				+ "empRol=" + empRol;
	}


	@Override
	void empCompany() {
		System.out.println(empName+" working in TCS as a "+empRol+" Role.");
		
	}
 
	

	 
	
	

}
