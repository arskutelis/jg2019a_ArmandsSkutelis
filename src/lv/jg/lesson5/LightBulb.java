package lv.jg.lesson5;

import java.util.Objects;

public class LightBulb {
	private int currentTurnOnCount;
	private boolean turnedOn;

	public LightBulb(int currentTurnOnCount, boolean turnedOn) {
		this.currentTurnOnCount = currentTurnOnCount;
		this.turnedOn = turnedOn;
	}

	public int getCurrentTurnOnCount() {
		return currentTurnOnCount;
	}

	public boolean getTurnedOn() {
		return turnedOn;
	}

	public void setCurrentTurnOnCount(int currentTurnOnCount) {
		this.currentTurnOnCount = currentTurnOnCount;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public boolean turnOff() {
		return turnedOn = false;
	}

	public boolean turnOn() {
		//šis if ir lieks, jo nemizmaina stāvokli uz jaunu,
		if (turnedOn == true) {
			return turnedOn = true;
		} else {
			//pieliec šeit klāt nosacijumu " && !turnedOn"
			if (currentTurnOnCount < 5) {
				currentTurnOnCount++;
				return turnedOn = true;
			} else {
				//šī darbība nav nepieciešama, pietiek ar "return turnedOn;"
				return turnedOn = false;
			}
		}
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		LightBulb that = (LightBulb) o;
		return Objects.equals(currentTurnOnCount, that.currentTurnOnCount)&& Objects.equals(turnedOn, that.turnedOn);
	}

	@Override
	public String toString() {
		return "Light bulb current turn on count: " + currentTurnOnCount + ", light bulb is turned on : " + turnedOn;
	}
}
