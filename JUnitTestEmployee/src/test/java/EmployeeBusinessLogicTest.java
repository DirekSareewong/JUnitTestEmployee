package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Employee;
import main.java.EmployeeBusinessLogic;

public class EmployeeBusinessLogicTest {

	EmployeeBusinessLogic empLogic = new EmployeeBusinessLogic();
	Employee emp = new Employee();
	
	@Before
	public void setUp(){
		emp.setName("Rajeev");
		emp.setSalary(10000);
		emp.setDepId(10);
	}
	
	/**
	 * test methode for the CalculateAppraisal of EmployeeBusinessLogic class
	 */
	@Test
	public void testCalculateAppraisal(){
		double appraisal = empLogic.calculateApprisal(emp);
		assertEquals(1000, appraisal, 0.0);
		
		emp.setSalary(9999);
		appraisal = empLogic.calculateApprisal(emp);
		assertEquals(500, appraisal, 0.0);
		
		emp.setSalary(10000);

	}
	
	/**
	 * test methode for yealry salary calculation of an employee
	 */
	@Test
	public void testCalculateYearlySalary(){
		double yearlySalary = empLogic.calculateYearlySalary(emp);
		assertEquals(120000, yearlySalary, 0.0);
	}

}
