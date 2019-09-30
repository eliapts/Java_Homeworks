package BTU;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A : ");
        int A = input.nextInt();
        System.out.print("Enter number B : ");
        int B = input.nextInt();

        int Even = 0;
        int Odd = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        Random r = new Random();
        if (A != B) {

            if (A > B) {
                int temp=A;
                A=B;
                B=A;
            }

                for (int i = 0; i < 40; i++) {
                    int rand = r.nextInt((B - A) + 1) + A;
                    System.out.println(rand);
                    if (rand%2==0){
                        Even+=1;
                        sumOfEven+=rand;
                    }
                    else{
                        Odd+=1;
                        sumOfOdd+=rand;
                    }
                }
        }
            else {
                    for (int i = 0; i < 40; i++) {
                        int random = (int)(Math.random() * (B-A) + A );
                        System.out.println(random);
                    }

                }

            System.out.println("Even : "+ Even);
            System.out.println("Odd : "+ Odd);

            System.out.println( sumOfEven);
            System.out.println(sumOfOdd);


        for(int x = 1; x<=5; x++ )
        {
            if(sumOfEven > sumOfOdd)
            {
                System.out.println(r.nextInt((sumOfEven-sumOfOdd)+1) + sumOfOdd);
            }
            else
            {
                System.out.println(r.nextInt((sumOfOdd-sumOfEven)-1) + sumOfEven);
            }

        }
            }
        }


