import java.util.Scanner;
public class sum5
{

 
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of X");
    int x=sc.nextInt();
    int y=0;


    //nested if statement ka use kr k

        if (x>0) {
            y=1; 
        }
       else if (x==0) {
            y=0;
        }
        if (x<0) {
            y=-1;
        }
        System.out.println("Value of Y is: "+ y);
        sc.close();

          //conditional operator ka use kr k
  if(x == 0)
    y = 0;
  else
    y = x > 0 ? 1 : -1;

    System.out.println("the value of y is: "+y);
        
    }

}
