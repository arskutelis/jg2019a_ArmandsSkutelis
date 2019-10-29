package lv.jg.lesson5;

import java.util.Objects;

public class Department {

	private String name;
	private Company company;

	public Department(String name, Company company) {
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Department that = (Department) o;
		return Objects.equals(name, that.name) && Objects.equals(company, that.company);

	}

	@Override
	public String toString() {
		return "department name: " + name + ", company: " + company;
	}
}
