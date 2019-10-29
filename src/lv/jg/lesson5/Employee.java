package lv.jg.lesson5;

import java.util.Objects;

public class Employee  {
	String employeeName;
	String contractNumber;
	double salary;
	Department department;
	

	public Employee(String employeeName, String contractNumber, double salary, Department department) {
		this.contractNumber = contractNumber;
		this.salary = salary;
		this.department = department;
		this.employeeName = employeeName;
	}
	
	public String getContractNumber() {
		return contractNumber;
	}

	public double getSalary() {
		return salary;
	}
		public String getEmployeeName() {
			return employeeName;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
	Employee that = (Employee) o;
		return Objects.equals(contractNumber, that.contractNumber) && Objects.equals(salary, that.salary)
				&& Objects.equals(department, that.department);

	}
	@Override
	public String toString() {
		return "Employee name: " + employeeName + ", contract number: " + contractNumber + ", salary: " + salary + ", " + department + ".";
	}
}
