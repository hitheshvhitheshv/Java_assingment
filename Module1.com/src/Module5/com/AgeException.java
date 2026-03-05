package Module5.com;
public class AgeException {

    public static void main(String[] args) {

        int age = 16;

        if(age < 18) {
            throw new ArithmeticException("Age is less than 18");
        }

        else {
            System.out.println("Eligible to vote");
        }
    }
}