import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class First{

    public static void main(String[] args) throws
    
     IOException {

        int [] shualedi = {1, 2};
        double y;

        BufferedWriter bf = new BufferedWriter(new FileWriter("function.txt", true));

        for (int x : shualedi) {
            
           y = Math.pow(x, 2) + 2 * x + 3;
           bf.write(String.valueOf(y));
           bf.newLine();
        }

       bf.close();
    }

}
