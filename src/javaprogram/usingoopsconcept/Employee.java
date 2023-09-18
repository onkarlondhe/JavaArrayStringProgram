package javaprogram.usingoopsconcept;

public abstract class Employee {

	int empId;
	String empName;
	int empSal;
	
	public Employee(int empId, String empName, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	 abstract void empCompany();

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
	
}
