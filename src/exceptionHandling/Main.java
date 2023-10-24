package exceptionHandling;

public class Main {
    public static void main(String[] args) {

        /*
        int a = 5;
        int b = 0;
        int c = a / b;
        */
        // exception: / by zero
        // ArithmeticException extends RuntimeException extends Exception

        int a = 5;
        int b = 0;
        try{
            divide(a,b);
            String name = "MY EXCEPTION";
            // int c = a / b;
            if(name.equals("MY EXCEPTION")){
                throw new MyException("exception is my exception");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException i){
            System.out.println(i.getMessage());
        }catch (Exception e){ // Exceptions includes every exception
            System.out.println("normal exception");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if ( b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
