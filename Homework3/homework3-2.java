import java.util.Random;
import java.util.ArrayList;

class Main {

  ArrayList<Integer> mylist = new ArrayList<Integer>();
  Random rand = new Random();
  int a = 5;
  int b = 10;
  int c = 20;
  int d = 25;

  public void RandNums() {

    for (int i = 0; i <= 12; i++) {
      mylist.add(rand.nextInt(b - a + 1) + a);

    }
    System.out.println("shemxtveviti ricxvebi: " + mylist);
  }

  public void SamisJeradi() {
    for (int i = 0; i < mylist.size(); i++) {
      if (i % 3 == 0 && i !=0) {
        mylist.add(i+1,rand.nextInt(d - c + 1) + c);
      }
    }
    System.out.println("3is jeradi indexis mere: " + mylist);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.RandNums();
    main.SamisJeradi();
  }
}
