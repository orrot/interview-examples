package basic;

import java.util.List;
import java.util.function.Function;

public class Exercise {

    public static void main(String[] args) {
        List<Integer> myNumbers = List.of(55, 50, 55, 60);

        // How to calculate the average??
        double result = myNumbers.stream()
                .mapToInt(a -> a)
                .average();

        System.out.println("Average is: " + result);
    }

    public static String toUpperAndPrint(String fruit) {

        System.out.println(fruit + ", ");
        return fruit;
    }
}
