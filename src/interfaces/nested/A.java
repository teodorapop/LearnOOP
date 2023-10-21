package interfaces.nested;

public class A {
    // nested interface
    // the only difference is that can pe private, public or protected
    // but top one has to be declared public or default(nothing)
    public interface NestedInterface{
        boolean isOdd(int num);

    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
