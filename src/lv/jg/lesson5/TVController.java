package lv.jg.lesson5;

import java.util.Objects;

public class TVController {
	private TV tv;

	public TVController(TV tv) {
		this.tv = tv;
	}

	public TV getTV() {
		return tv;
	}

	public void setTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TVController that = (TVController) o;
		return Objects.equals(tv, that.tv);
	}

	@Override
	public String toString() {
		return "TV: " + tv;
	}
}
