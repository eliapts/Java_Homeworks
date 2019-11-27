
import java.util.*;

class Main {
  ArrayList<Integer> intarray = new ArrayList<Integer>(12);

  int pick;
  Random rand = new Random();

  public void method1() {
    for (int i = 0; i <= 12; i++) {
      pick = rand.nextInt(100);
      intarray.add(pick);
      Collections.sort(intarray);
    }
    System.out.println("12 შემთხვევითი რიცხვია: " + "\n" + intarray);
  }

  public void method2() {
    int i = 0;
    for (Iterator<Integer> iterator = intarray.iterator(); iterator.hasNext();) {
      iterator.next();
      if (i % 2 == 0)
        iterator.remove();
      i++;}

    System.out.println("luwi indexebis amogebit" + intarray);
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.method1();
    obj.method2();

  }
}
