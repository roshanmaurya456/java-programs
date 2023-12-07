public class sum {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println(
                "The number of integers greater than 100 and less than 200 that are divisible by 7 is: " + count);
        System.out.println("The sum of all these integers is: " + sum);
    }
}