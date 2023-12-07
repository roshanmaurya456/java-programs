import java.util.Scanner;
public class sum1 {
 
 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    

    System.out.print("Enter the value of a=");
    int a = sc.nextInt();
    System.out.print("Enter the value of b=");
    int b = sc.nextInt();
    System.out.print("Enter the value of c=");
    int c = sc.nextInt();
    System.out.print("Enter the value of d=");
    int d = sc.nextInt();
    System.out.print("Enter the value of m=");
    int m = sc.nextInt();
    System.out.print("Enter the value of n=");
    int n = sc.nextInt();
    if (a * d == c * b) {
      System.out.println("denominator  is Zero cant calculate");
    } else {
      double x1 = (m * d - b * n) / (a * d - c * b);
      double x2 = (n * a - m * c) / (a * d - c * b);
      System.out.println("Value of x1="+x1);
      System.out.println("Value of x2="+x2);
      sc.close();
    }
  
  }
  
}