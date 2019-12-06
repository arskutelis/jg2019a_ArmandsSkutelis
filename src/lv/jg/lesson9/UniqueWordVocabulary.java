package lv.jg.lesson9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();

        addWords(words);
        getUniqueWords(words);
        printToConsole(words);

    }

    private static void addWords(Set<String> list) {
        list.add("tree");
        list.add("animal");
        list.add("plant");
        list.add("John");
        list.add("cool");
        list.add("tree");
        list.add("animal");
    }

    //since Set only takes unique values, this already shows unique
    public static void getUniqueWords(Set<String> unique) {
        System.out.println("Unique entries: " + unique.size());
    }

    //Duplicate values are overriden in Set, so only these are there
    public static void printToConsole(Set<String> all) {
        System.out.println("===================");
        System.out.println("All elements in the Set:");
        all.forEach(System.out::println);
    }
}
