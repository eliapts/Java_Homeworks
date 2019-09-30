package BTU;
import java.util.Scanner;
public class C {
        int a, b, c;

        public void first() {
            Scanner input = new Scanner(System.in);
            System.out.println("a = ");
            a = input.nextInt();
            System.out.println("b = ");
            b = input.nextInt();
            System.out.println("c = ");
            c = input.nextInt();
        }

        public int lastDigit() {
            return (a % 10);
        }

        public int firstDigit() {
            int first_digit;
            first_digit = b;
            while (first_digit >= 10) {
                first_digit /= 10;
            }
            return first_digit;
        }

        public int sumMethod() {
            int sum = 0;

            while (c > 0) {
                sum = sum + c % 10;
                c /= 10;
            }
            return sum;
        }

        public int multiply() {
            return (firstDigit() * lastDigit());
        }
        public void mult() {
            System.out.println(multiply());
        }

        public void Sum() {
            System.out.println(multiply() + firstDigit());
        }


    }


