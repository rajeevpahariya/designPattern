package mvcPattern.mvc1;

public class EmployeeController {
	
	private EmployeeDashboardView view;
	Employee employee;
	
	public EmployeeController(EmployeeDashboardView view, Employee employee) {
		this.view = view;
		this.employee = employee;
	}

	public void setEmployee(String fName, String lName) {
		employee.setFirstName(fName);
		employee.setLastName(lName);
	}
	
	public void setSSN(String ssn) {
		employee.setSsNumber(ssn);
	}
	
	public void updateView() {
		view.printEmployeeInformation(employee);
	}
	
}
