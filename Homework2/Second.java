import java.io.*; 
public class Second{ 
  public static void main(String[] args)throws Exception 
  { 
  File file = new File("function.txt"); 
  
  BufferedReader bf = new BufferedReader(new FileReader(file)); 
  
  String st; 
  double max = 0;
  double min = 0;
  while ((st = bf.readLine()) != null){
    double d = Double.parseDouble(st);
    if(max==0&&min==0){
      max = d;
      min = d;
    }
    else{
      if(d>max){
        max = d;
      }
      else if(d<min){
        min = d;
      }
      else{
        continue;
      }
    }
  }
  bf.close();
  System.out.println("Max: " + max+"\n"+"Min: " + min);
  } 
} 
