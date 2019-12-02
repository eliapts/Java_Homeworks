
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String alphabet;
    String language;
    String parameters;

    Scanner input = new Scanner(System.in);
    System.out.println("sheiyvanet ena : \"en\" \"ru\" an \"ge\" ");
    language = input.nextLine();
    System.out.println("sheiyvanet parametrebi pormit: p-*-s-*-*-w-*-*");
    parameters = input.nextLine();
    String[] params = parameters.split("-");
    int p = Integer.parseInt(params[1]);
    int s1 = Integer.parseInt(params[3]);
    int s2 = Integer.parseInt(params[4]);
    int w1 = Integer.parseInt(params[6]);
    int w2 = Integer.parseInt(params[7]);

    
    if (language.equals("en")) {alphabet = "abcdefghijklmnopqrstuvwxyz";}
    else if (language.equals("ru")) {alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";}
    else if (language.equals("ge")) {alphabet = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ";}
    else {alphabet = "abcdefghijklmnopqrstuvwxyz";}

    for(int i=0; i<p; i++) {
		sentenceGenerator(s1,s2,w1,w2,alphabet);
	}
}
  
    public static void sentenceGenerator(int s1,int s2,int w1,int w2, String alphabet){
        
        Random rand = new Random();
        String text = "";
        int sentenceLength=rand.nextInt(s2-s1+1)+s1;
        for(int i=0;i < sentenceLength;i++){
          int wordLength = rand.nextInt(w2-w1+1)+w1;
          // char[] text = new char[wordLength];
          StringBuilder sb = new StringBuilder(wordLength);
          for (int j = 0; j < wordLength; j++) {
          sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        text += sb + " ";
    }
    System.out.println(text);
    
   }
  }
