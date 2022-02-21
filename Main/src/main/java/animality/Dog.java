package animality;

public class Dog extends Animal {

    // Same method than the human? scope?
    // Do you like this design?
    @Override
    public void eat() {
        System.out.println("I eat with my mouth");
    }

    @Override
    public void walk() {
        System.out.println("I walk with four legs");
    }

    @Override
    public void run() {
        System.out.println("I run with four legs");
    }

    public void bark() {
        System.out.println("guau guau guau");
    }
}
