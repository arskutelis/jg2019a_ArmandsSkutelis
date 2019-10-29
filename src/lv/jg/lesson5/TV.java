package lv.jg.lesson5;

import java.util.Objects;

public class TV {
	private int currentChannel;
	private int currentVolumeLevel;
	private String manufacturer;
	private boolean turnedOn;
	
	public TV(String manufacturer, boolean turnedOn, int currentChannel, int currentVolumeLevel) {
		this.currentChannel = currentChannel;
		this.currentVolumeLevel = currentVolumeLevel;
		this.manufacturer = manufacturer;
		this.turnedOn = turnedOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolumeLevel() {
		return currentVolumeLevel;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}


	public boolean turnOff() {
		return turnedOn = false;
	}

	public boolean turnOn() {
		return turnedOn = true;
	}

	public void incrementChannel() {
		if (turnedOn == true) {
			currentChannel++;
		} else {
			turnedOn = false;
		}
	}

	public void decrementChannel() {
		if (turnedOn == true) {
			currentChannel--;
		} else {
			turnedOn = false;
		}
	}

	public void incrementVolume() {
		if (turnedOn == true) {
			currentVolumeLevel++;
		} else {
			turnedOn = false;
		}
	}

	public void decrementVolume() {
		if (turnedOn == true) {
			currentVolumeLevel--;
		} else {
			turnedOn = false;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TV that = (TV) o;
		return Objects.equals(currentChannel, that.currentChannel)
				&& Objects.equals(currentVolumeLevel, that.currentVolumeLevel)
				&& Objects.equals(manufacturer, that.manufacturer) && Objects.equals(turnedOn, that.turnedOn);
	}
//public String toString() {
//	return getClass().getName() + "@"
//			+Integer.toHexString(hashCode());
//}

	@Override
	public String toString() {
		return "TV " + " manufacturer: " + manufacturer + " , current channel: " + currentChannel
				+ " , current volume level: " + currentVolumeLevel + " , turned on: " + turnedOn + ".";
	}
	public int getValueChannel() {
		return currentChannel;
	}
	public int getValueVolume() {
		return currentVolumeLevel;
	}

	public void setValueChannel(int currentChannel) {
		this.currentChannel= currentChannel = currentChannel > 0 ? currentChannel : 0;
}
	public void setValueVolume(int currentVolumeLevel) {
		this.currentVolumeLevel= currentVolumeLevel > 0 ? currentVolumeLevel : 0;
}
}