package interfaces;

public class Car implements Engine, Break{
    @Override
    public void breakk() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");

    }
}
