package lv.jg.lesson5;

//ok
//nav notestēts setValueVolume un setValueChannel
public class TVTest {
	public static void main(String[] args) {
		TV lg = new TV("LG", false, 1, 13);
		TV samsung = new TV("Samsung", true, 2, 16);//typo

		//metodes nosaukums rakstāms ar mazo burtu
		CheckIfIncrementsChannelWhenSwitchedOff();
		CheckIfIncrementsChannelWhenSwitchedOn();
		CheckIfDecrementsChannelWhenSwitchedOff();
		CheckIfDecrementsChannelWhenSwitchedOn();
		CheckIfIncrementsVolumeWhenSwitchedOff();
		CheckIfIncrementsVolumeWhenSwitchedOn();
		CheckIfDecrementsVolumeWhenSwitchedOff();
		CheckIfDecrementsVolumeWhenSwitchedOn();
		System.out.println("...........................................");

		lg.turnOn();
		lg.incrementChannel();
		lg.incrementChannel();
		lg.incrementVolume();
		lg.incrementVolume();
		samsung.turnOff();
		samsung.decrementChannel();
		samsung.turnOn();
		samsung.decrementVolume();
		samsung.incrementChannel();

		System.out.println("COMPARE /lg/ WITH /samsung/");
		System.out.println(lg);
		System.out.println(samsung);
		System.out.println("The result is: " + lg.equals(samsung));
		System.out.println("...........................................");
	}

	private static void CheckIfIncrementsChannelWhenSwitchedOff() {
		TV sony = new TV("Sony", true, 2, 13);
		sony.turnOff();
		sony.incrementChannel();
		int result = sony.getValueChannel();
		int expectedResult = 2;

		printResults(result, expectedResult, "Check If Increments Channel When Switched Off: ");
	}

	private static void CheckIfIncrementsChannelWhenSwitchedOn() {
		TV sony = new TV("Sony", true, 2, 13);
		sony.turnOn();
		sony.incrementChannel();
		int result = sony.getValueChannel();
		int expectedResult = 3;

		printResults(result, expectedResult, "Check If Increments Channel When Switched On: ");
	}

	private static void CheckIfDecrementsChannelWhenSwitchedOff() {
		TV sony = new TV("Sony", true, 2, 13);
		sony.turnOff();
		sony.decrementChannel();
		int result = sony.getValueChannel();
		int expectedResult = 2;

		printResults(result, expectedResult, "Check If Decrements Channel When Switched Off: ");
	}

	private static void CheckIfDecrementsChannelWhenSwitchedOn() {
		TV sony = new TV("Sony", true, 2, 13);
		sony.turnOn();
		sony.decrementChannel();
		int result = sony.getValueChannel();
		int expectedResult = 1;

		printResults(result, expectedResult, "Check If Decrements Channel When Switched On: ");
	}

	private static void CheckIfIncrementsVolumeWhenSwitchedOff() {
		TV sony = new TV("Sony", true, 1, 13);
		sony.turnOff();
		sony.incrementVolume();
		int result = sony.getValueVolume();
		int expectedResult = 13;

		printResults(result, expectedResult, "Check If Increments Volume When Switched Off: ");
	}

	private static void CheckIfIncrementsVolumeWhenSwitchedOn() {
		TV sony = new TV("Sony", true, 1, 13);
		sony.turnOn();
		sony.incrementVolume();
		int result = sony.getValueVolume();
		int expectedResult = 14;

		printResults(result, expectedResult, "Check If Increments Volume When Switched On: ");
	}

	private static void CheckIfDecrementsVolumeWhenSwitchedOff() {
		TV sony = new TV("Sony", true, 1, 13);
		sony.turnOff();
		sony.decrementVolume();
		int result = sony.getValueVolume();
		int expectedResult = 13;

		printResults(result, expectedResult, "Check If Decrements Volume When Switched Off: ");
	}

	private static void CheckIfDecrementsVolumeWhenSwitchedOn() {
		TV sony = new TV("Sony", true, 1, 13);
		sony.turnOn();
		sony.decrementVolume();
		int result = sony.getValueVolume();
		int expectedResult = 12;

		printResults(result, expectedResult, "Check If Decrements Volume When Switched On: ");
	}

	private static void printResults(int result, int expectedResult, String testName) {
		if (result == expectedResult) {
			System.out.println("Test " + testName + ": PASSED");
		} else {
			System.out.println("Test " + testName + ": FAILED");
		}
	}
}
