package generator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements GeneratorInterface {
    private Hashtable alphabet;
    private String language;
    private String parameters;
    private ArrayList param;

    public Generator(String language, String parameters) {
        this.language = language;
        this.parameters = parameters;
        param = new ArrayList();
        alphabet = new Hashtable();
        generateAlphabet();
    }

    public String generateAlpha(char startSymbol, char endSymbol){
        String alphabet = "";
        for(int i=(int)startSymbol; i<=(int)endSymbol; i++){
            alphabet += (char)i;
        }
        return alphabet;
    }

    public void parseStringToarray(){
        // System.out.println(parameters);
        String [] par = parameters.split("-");
        for (String item:par) {
//            System.out.println(item);
            try {
                param.add(Integer.parseInt(item));
            } catch (NumberFormatException e) {
//                e.printStackTrace();
            }
        }
//        System.out.println(Arrays.toString(par));
        // System.out.println(param);
    }

    @Override
    public void generateAlphabet() {
        alphabet.put("ge",generateAlpha('ა','ჰ'));
        alphabet.put("en",generateAlpha('a','z'));
        alphabet.put("ru",generateAlpha('а','я'));

    }

    @Override
    public char generateRandomChar() {
        char symbol=' ';
        Random random = new Random();
        String a = alphabet.get(language).toString();
        symbol =a.charAt(random.nextInt(a.length()));
        return symbol;
    }

    @Override
    public String generateRandomWord() {
        return null;
    }

    @Override
    public String generateSentence() {
        return null;
    }
}
