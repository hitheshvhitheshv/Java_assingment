package Module5.com;

import java.io.*;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception handled");
        }

        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled");
        }
    }
}