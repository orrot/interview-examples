package basic;

import java.util.List;

public class StreamsPart2 {

    public static void main(String[] args) {

        // what is the output?
        List<String> myStrings = List.of("apple", "pineapple", "cherries", "pear");

        myStrings.stream()
                .filter(fruit -> fruit.startsWith("p"))
                .map(fruit -> toUpperAndPrint(fruit));
    }

    public static String toUpperAndPrint(String fruit) {

        System.out.println(fruit + ", ");
        return fruit;
    }
}
