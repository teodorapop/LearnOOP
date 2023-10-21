package interfaces.extendInterface;

public interface A {

    void fun();


    // The default method cannot be overridden when a class (Main) implements multiple interfaces (A, B)
    //    default void funn(){
    //        System.out.println("I am in A");
    //    }
    // The original intention behind interfaces remains the same: to provide a means by which interfaces
    // can be expanded without breaking existing code.
    // if you add a new method without a body in the interface, all classes that implement the interface
    // are required to provide an implementation for the new method.


}
