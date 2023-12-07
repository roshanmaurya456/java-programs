import java.util.Scanner;

public class sum6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //math ka number lelo
        System.out.print("Enter the marks obtained in Mathematics: ");
        int math = sc.nextInt();
        // physics ka number lelo
        System.out.print("Enter the marks obtained in Physics: ");
        int physics = sc.nextInt();
        //chemistry ka number lelo
        System.out.print("Enter the marks obtained in Chemistry: ");
        int chemistry = sc.nextInt();
        //tino ka total kr lo
        int total = math + physics + chemistry;
        //boolean type leke eligibility check kr lo
        boolean eligible = (math >= 60 && physics >= 50 && chemistry >= 40 &&
                (total >= 200 || math + physics >= 150));
                //agar eligible ho to hn nhi to na....
        if (eligible) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
            sc.close();
        }
    }
}