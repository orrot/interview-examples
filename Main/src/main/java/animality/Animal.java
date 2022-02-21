package animality;

public abstract class Animal {

    public abstract void eat();

    public abstract void walk();

    public abstract void run();

    private void eatWithMouth() {
        System.out.println("I eat with my mouth");
    }
}
