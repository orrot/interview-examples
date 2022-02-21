package animality;

public class Human extends Animal {
    @Override
    public void eat() {
        System.out.println("I eat with my mouth");
    }

    @Override
    public void walk() {
        System.out.println("I walk with two legs");
    }

    @Override
    public void run() {
        System.out.println("I run with two legs");
    }

    public void talk() {
        System.out.println("I know english");
    }
}
