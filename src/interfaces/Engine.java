package interfaces;

public interface Engine {

    // static final int price = 78000; you don't have to write like this, bc it's already static final

    int PRICE = 78000;

    int a = 5; // this cannot be accessed

    void start();
    void stop();
    void acc();
}
