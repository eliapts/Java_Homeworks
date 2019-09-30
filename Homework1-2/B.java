package BTU;
import java.util.Scanner;
public class B extends A{
    int y;
    public void inputMethod() {
    System.out.print("Enter y: ") ;
    Scanner myinput = new Scanner(System.in);
    y = myinput.nextInt();
    }

    public int Sum(){
        System.out.println("x + y + ");
        return x+y;
    }

}
