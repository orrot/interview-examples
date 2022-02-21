package basic;

public class StreamsPart1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running code in a thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
