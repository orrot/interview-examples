package basic;



import lombok.Data;

@Data
public class Point {

    // What is the access if modifier is removed
    private int x;
    private int y;

    // If I add a public List<Integer> integers and I try to access as Point.integers.add(1), what is missing?
    // final in the class level?
    // final in the same public List<Integer> ?
    // synchronized in a method?

    // What is a record in new java versions?

    // Immutability:
    // What is?
    // Why?
    // How to transform this into an immutable class
}
