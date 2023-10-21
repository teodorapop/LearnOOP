package interfaces;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.start();
        car.stop();

        Engine car1 = new Car();
        //car1.a; // even with this I cannot access the "a" variable
        int n = Engine.PRICE;


        NiceCar car2 = new NiceCar();
        car2.start();
        car2.startMusic();

        car2.upgradeEngine();
        car2.start();
    }
}
