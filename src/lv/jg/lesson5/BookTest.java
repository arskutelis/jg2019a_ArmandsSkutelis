package lv.jg.lesson5;

public class BookTest {
	public static void main(String[] args) {
		Book azkaban = new Book("J.K.Rowling", "Prisoner of Azkaban", 450);
		Book potter = new Book("J.K.Rowling", "PhilOsopher's Stone", 450);
		Book potterHallows = new Book("J.K.Rowling", "Deathly Hallows", 512);
		Book fantasticBeasts = new Book("J.K.Rowling", "Fantastic Beasts", 875);
		Book Azkaban = new Book("J.Smith", "Prisoner of Azkaban", 450);
		Book Potter = new Book("J.K.Rowling", "Philosopher's Stone", 450);
		Book potterFourth = new Book("J.K.Rowling", "Fantastic Beasts", 875);
		Book PotterHallows = new Book("J.K.Rowling", "Deathly Hallows", 512);
		
		System.out.println("COMPARE /azkaban/ WITH /Azkaban/");
		System.out.println(azkaban);
		System.out.println(Azkaban);
		System.out.println("The result is: " + azkaban.equals(Azkaban));
		System.out.println("...........................................");
		System.out.println("COMPARE /potter/ WITH /Potter/");
		System.out.println(potter);
		System.out.println(Potter);
		System.out.println("The result is: " + potter.equals(Potter));
		System.out.println("...........................................");
		System.out.println("COMPARE /fantasticBeasts/ WITH /potterFourth/");
		System.out.println(fantasticBeasts);
		System.out.println(potterFourth);
		System.out.println("The result is: " + fantasticBeasts.equals(potterFourth));
		System.out.println("...........................................");
		System.out.println("COMPARE /potterHallows/ WITH /PotterHallows/");
		System.out.println(potterHallows);
		System.out.println(PotterHallows);
		System.out.println("The result is: " + potterHallows.equals(PotterHallows));
	}
}
