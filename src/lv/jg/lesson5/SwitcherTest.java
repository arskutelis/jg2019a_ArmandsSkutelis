package lv.jg.lesson5;

public class SwitcherTest {
	public static void main(String[] args) {
		LightBulb livingRoom = new LightBulb(1, false);
		LightBulb bathroom = new LightBulb(2, true);
		LightBulb kitchen = new LightBulb(3, false);

		Switcher livingRoomSwitcher = new Switcher(livingRoom, false);
		Switcher bathroomSwitcher = new Switcher(bathroom, false);
		Switcher kitchenSwitcher = new Switcher(kitchen, false);

		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		livingRoomSwitcher.switchOnOff();
		
		bathroomSwitcher.switchOnOff();
		kitchenSwitcher.switchOnOff();
		
		System.out.println(livingRoomSwitcher);
		System.out.println(bathroomSwitcher);
		System.out.println(kitchenSwitcher);
	}
}
