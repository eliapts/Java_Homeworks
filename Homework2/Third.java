import java.util.ArrayList;
import java.util.List;


class Main implements interfaceMain {
  public  int a,b;

  Main(int a, int b){
    this.a=a;
    this.b=b;
  }

@Override
public  void methodOne(){ 
System.out.print("\nNumbers between "+ a+" and "+b+" : ");

 for(int i=a;i<=b;i++){
  System.out.print(i+" ");
  }
}

@Override
public void methodTwo(){ 
   System.out.print("\n"+a+"-ის  გამყოფები: ");
    for (int i=1;i<=a;i++) 
            if (a%i==0) {
            
                System.out.printf("%d ",i); }}

@Override
 public void methodThree(){
 System.out.print("\n"+b+"-ის მარტივი გამყოფები: ");

       for(int i = 2; i< b; i++) {
         while(b%i == 0) {
            System.out.print(i+" ");
            b = b/i;
         }
      }
      if(b > 2) 
         System.out.println(b);}
 

@Override
public  int methodFour(int x) { 

if (x < 0) 
    x = -x; 
  
int result = 0;  
int max_count = 1;  

for (int d = 0; d <= 9; d++) 
{ 
    int count = countOccurrences(x,d); 

    if (count >= max_count) 
    { 
        max_count = count; 
        result = d; 
    } 
} 
return result; 

}       

 int countOccurrences(int x, int d) 
{ 
    int count = 0;  
    while (x > 0) 
    { 
        if (x % 10 == d) 
        count++; 
        x = x / 10; 
    } 
    return count; 
}



  public static void main(String[] args) {
    Main myObj = new Main(95,122);
    myObj.methodOne();
    myObj.methodTwo();
    myObj.methodThree();
    System.out.println("\nყველაზე ხშირად გამეორებული ციფრი: " + 
    myObj.methodFour(122));

  }
}
