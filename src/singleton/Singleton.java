package singleton;

public class Singleton {

    // private constructor
    private Singleton(){

    }

    private static Singleton instance;

    // static ca sa o pot accesa in afara clasei
    public static Singleton getInstance(){

        // check whether 1 object is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
