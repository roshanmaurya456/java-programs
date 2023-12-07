import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter the marks of " + n + " students: ");

        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        int a = 0, b = 0, c = 0, d = 0;

        for (int mark : marks) {
            if (mark >= 81 && mark <= 100) {
                a++;
            } else if (mark >= 61 && mark <= 80) {
                b++;
            } else if (mark >= 41 && mark <= 60) {
                c++;
            } else if (mark >= 0 && mark <= 40) {
                d++;
            }
        }

        System.out.println("Number of students with marks in range 81 to 100: " + a);
        System.out.println("Number of students with marks in range 61 to 80: " + b);
        System.out.println("Number of students with marks in range 41 to 60: " + c);
        System.out.println("Number of students with marks in range 0 to 40: " + d);
        sc.close();
    }
}