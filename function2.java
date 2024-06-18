import java.util.Scanner;

public class function2 {

    public static void sumOfOddnum(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
        return;

    }

    public static void main(String[] args) {

        Scanner numbScanner = new Scanner(System.in);
        System.out.println("Enter number to add odd numbers: ");
        int n = numbScanner.nextInt();

        sumOfOddnum(n);
    }

}
