import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    String sIn;


    try {
      System.out.println("შეიყვანეთ მოქმედება:");
      sIn = d.readLine();
      sIn = opn(sIn);
      System.out.println(calculate(sIn));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static String opn(String sIn) throws Exception {
    StringBuilder sbStack = new StringBuilder(""), sbOut = new StringBuilder("");
    char cIn, cTmp;
    BufferedWriter bfwriter = new BufferedWriter(new FileWriter("file.txt", false));
    bfwriter.write(String.valueOf(sbOut));
    bfwriter.close();

    for (int i = 0; i < sIn.length(); i++) {
      cIn = sIn.charAt(i);
      if (isOp(cIn)) {
        while (sbStack.length() > 0) {
          cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
          if (isOp(cTmp) && (opPrior(cIn) <= opPrior(cTmp))) {
            sbOut.append(" ").append(cTmp).append(" ");
            sbStack.setLength(sbStack.length() - 1);
          } else {
            sbOut.append(" ");
            break;
          }
          
        }
        sbOut.append(" ");
        sbStack.append(cIn);
      } else if ('(' == cIn) {
        sbStack.append(cIn);
      } else if (')' == cIn) {
        cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
        while ('(' != cTmp) {
          if (sbStack.length() < 1) {
            throw new Exception("შეამოწმეთ გამოსახულება.");
          }
          sbOut.append(" ").append(cTmp);
          sbStack.setLength(sbStack.length() - 1);
          cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
        }
        sbStack.setLength(sbStack.length() - 1);
      } else {

        sbOut.append(cIn);
      }
    }

    while (sbStack.length() > 0) {
      sbOut.append(" ").append(sbStack.substring(sbStack.length() - 1));
      sbStack.setLength(sbStack.length() - 1);
    }

    return sbOut.toString();
    
  }

  private static boolean isOp(char c) {
    switch (c) {
    case '-':
    case '+':
    case '*':
    case '/':
    case '^':
      return true;
    }
    return false;
  }

  private static byte opPrior(char op) {
    switch (op) {
    case '^':
      return 3;
    case '*':
    case '/':
    case '%':
      return 2;
    }
    return 1;
  }

  private static double calculate(String sIn) throws Exception {
    double dA = 0, dB = 0;
    String sTmp;
    Deque<Double> stack = new ArrayDeque<Double>();
    StringTokenizer st = new StringTokenizer(sIn);
    
    while (st.hasMoreTokens()) {
      try {
        sTmp = st.nextToken().trim();
        if (1 == sTmp.length() && isOp(sTmp.charAt(0))) {
          if (stack.size() < 2) {
            throw new Exception("მონაცემების არასწორი რაოდენობა " + sTmp);
          }
          dB = stack.pop();
          dA = stack.pop();
          switch (sTmp.charAt(0)) {
          case '+':
            dA += dB;
            break;
          case '-':
            dA -= dB;
            break;
          case '/':
            dA /= dB;
            break;
          case '*':
            dA *= dB;
            break;
          case '%':
            dA %= dB;
            break;
          case '^':
            dA = Math.pow(dA, dB);
            break;
          default:
            throw new Exception("დაუშვებელი ოპერაცია " + sTmp);
          }
          stack.push(dA);
        } else {
          dA = Double.parseDouble(sTmp);
          stack.push(dA);
        }
      } catch (Exception e) {
        throw new Exception("დაუშვებელი სიმბოლო");
      }
    }

    if (stack.size() > 1) {
      throw new Exception("ოპერატორების რაოდენობა არ შეესაბამება ოპერანდების რაოდენობას");
    }

    return stack.pop();
  }
  public void whenWriteStringUsingBufferedWritter_thenCorrect() 
  throws IOException {
    String str = "Hello";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(str);
     
    writer.close();
}
}
