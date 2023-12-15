package basic;

public class StreamsPart1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running code in a thread");
            }
        };

        // Create a Runnable implementation using a lambda exp
        // (most of the time this same example but with a custom functional interface created during the interview)
    }
}
