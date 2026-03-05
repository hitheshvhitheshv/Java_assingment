package Module5.com;
public class DivisionDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}