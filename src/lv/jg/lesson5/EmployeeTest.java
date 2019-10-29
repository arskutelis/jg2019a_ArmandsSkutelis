package lv.jg.lesson5;

public class EmployeeTest {
	public static void main(String[] args) {
		Company companyAlex = new Company("IBM", "123456");
		Department departmentAlex = new Department("Sales", companyAlex);
		Employee alex = new Employee("Alex Fowler", "14578", 1600, departmentAlex);
		
		Company companySigne = new Company("Apple", "154867");
		Department departmentSigne = new Department("Billing", companySigne);
		Employee signe = new Employee("Signe Oga", "18546", 1600, departmentSigne);
		
		System.out.println(alex);
		System.out.println(signe);
	}
}
