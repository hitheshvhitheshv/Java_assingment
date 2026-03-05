package Module5.com;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {

    static void check(int age) throws MyException {

        if(age < 18)
            throw new MyException("Age must be 18+");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            check(16);
        } catch(MyException e) {
            System.out.println(e);
        }
    }
}