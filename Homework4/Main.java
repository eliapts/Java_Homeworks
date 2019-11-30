import generator.Generator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String language;
        String parameters;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sheiyvanet ena: \"en\",\"ge\" or \"ru\" ");
        language = scan.nextLine();
        System.out.println("sheiyvanet parametrebi pormit:  p-*-s-*-*-w-*-*");
         String params = scan.nextLine();
        parameters = "p-2-s-5-17-w-3-9";
        Generator generator = new Generator(language, parameters);
        generator.parseStringToarray();
        // System.out.println(generator.generateAlpha('ა', 'ჰ'));
        System.out.println(generator.generateRandomChar());
    }
}
