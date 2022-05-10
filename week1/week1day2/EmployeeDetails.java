package week1day2assignment;

public class EmployeeDetails {
	public void printEmployeeName(String empName,int empId) {
	System.out.println("Employee name: "+empName+" "+"Emp id:  "+empId);
} 
	public void getEmployeeAddress(String empAddress) {
		System.out.println("EmployeeAddress:" +empAddress );
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("EmployeeSalary:" +empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("EmployeeName:" +mobNum );
	}
    public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("dell", 101);
		emp.getEmployeeAddress("chennai");
		emp.printEmployeeSalary(525444);
		emp.printEmployeeMobileNumber(623552377);
	}

}

