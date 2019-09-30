package BTU;
import java.util.Scanner;

public class A {
    int x;
    public  A() {
        System.out.println("Hello!");
    }
    public void InputMethod() {
        System.out.print("Enter x : ");
        Scanner input = new Scanner(System.in);
        x= input.nextInt();
        System.out.println("x = " + x);
    }
    public void SumMethod(){
        System.out.println("x + 12 = " + (x + 12));
    }
    public void EvenOrOdd() {
        if(x%2==0)
            System.out.println ("X is Odd");
        else
            System.out.println("X is Even");
    }

}
