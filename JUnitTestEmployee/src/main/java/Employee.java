package main.java;

/**
 * POJO Class Employee
 * 
 * @author Direk
 *
 */
public class Employee {
	
	private String name;
	private double salary;
	private int depId;
	
	public Employee(String name, double salary, int depId) {
		super();
		this.name = name;
		this.salary = salary;
		this.depId = depId;
	}
	
	public Employee(){
		super();
	}
	
	//gettets and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}

}
