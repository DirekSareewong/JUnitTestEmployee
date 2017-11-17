package main.java;

/**
 * Business Logic for Employee class
 * @author Direk
 *
 */
public class EmployeeBusinessLogic {
	/**
	 * Calculate yearly salary of an employee
	 * @param Employee emp
	 * @return Salary of 12 months
	 */
	public double calculateYearlySalary(Employee emp) {
		return emp.getSalary()*12;
	}

	/**
	 * Calculate the appraisal of an employee, based on the current salary
	 * @param Emoployee emp
	 * @return Appraisal, depending on the salary
	 */
	public double calculateApprisal(Employee emp) {
		if(emp.getSalary() < 10000)
			return 500;
		else
			return 1000;
	}
}
