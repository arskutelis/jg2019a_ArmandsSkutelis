package lv.jg.lesson5;

import java.util.Objects;

public class Switcher {
	private LightBulb lightBulb;
	private boolean turnedOn;

	public Switcher(LightBulb lightBulb, boolean turnedOn) {
		this.lightBulb = lightBulb;
		this.turnedOn = turnedOn;
	}

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	public void setLightBulb(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}
	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}
	public boolean getTurnedOn() {
		return turnedOn;
	}
	public void switchOnOff() {
		if (turnedOn == true) {
			 turnedOn = false;
			 lightBulb.turnOff();
		} else {
			turnedOn = true;
			lightBulb.turnOn();
			}
		}
		

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Switcher that = (Switcher) o;
		return Objects.equals(lightBulb, that.lightBulb)&& Objects.equals(turnedOn, that.turnedOn);
	}

	@Override
	public String toString() {
		return "Switcher status: " + lightBulb + " , switcher is on: " + turnedOn;
	}
}
