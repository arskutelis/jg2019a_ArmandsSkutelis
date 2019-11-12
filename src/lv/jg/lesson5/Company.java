package lv.jg.lesson5;

import java.util.Objects;

public class Company {
	private String name;
	private String registrationNumber;

	public Company(String name, String registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Company that = (Company) o;
		//nav iespējamas divas dažādas kompānijas ar vienu reģistrācijas numuru, tatad pietiek ar "registrationNumber"
		return Objects.equals(name, that.name) && Objects.equals(registrationNumber, that.registrationNumber);

	}

	@Override
	public String toString() {
		return name + " ,registration number: " + registrationNumber;
	}
}
