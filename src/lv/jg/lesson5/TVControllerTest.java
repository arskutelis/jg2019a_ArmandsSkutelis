package lv.jg.lesson5;

public class TVControllerTest {
	public static void main(String[] args) {
		
		TV phillips = new TV ("Phillips", false, 4, 10);
		TV sony = new TV ("Sony", true, 3, 7);
		TV lg = new TV("LG", false, 1, 13);
		
		TVController phillipsController = new TVController (phillips);
		TVController sonyController = new TVController (sony);
		TVController lgController = new TVController (lg);
		
		phillips.turnOn();
	    phillips.incrementChannel();
		phillips.decrementVolume();
		
		sony.turnOff();
		sony.incrementChannel();
		sony.decrementVolume();
		
		lg.turnOn();
	    lg.incrementChannel();
		lg.decrementVolume();
		
		System.out.println(phillipsController);
		System.out.println(sonyController);
		System.out.println(lgController);
	}
}
