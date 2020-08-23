package mvcPattern.mvc1;

public class Main {
	public static void main(String[] args) {
		
		EmployeeDashboardView employeeDashboardView = new EmployeeDashboardView();
		Employee employee = retrieveEmployeeFromServer();
		EmployeeController controller = 
				new EmployeeController(employeeDashboardView, employee);
		controller.updateView();
		
		// Update details
		
		controller.setSSN("23456");
		controller.updateView();
	}
	
	public static Employee retrieveEmployeeFromServer() {
		Employee employee = new Employee();
		employee.setFirstName("Rajeev");
		employee.setLastName("Gupta");
		employee.setSsNumber("12345");
		employee.setSalary(1235000);
		return employee;
	}
}
