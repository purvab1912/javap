import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner codScanner = new Scanner(System.in);
        System.out.print("Enter a code 0 or 1 to get access of marks rank:");
        n = codScanner.nextInt();

        if (n == 1) {
            Scanner myMarks = new Scanner(System.in);
            System.out.print("Enter yor marks");
            m = codScanner.nextInt();

            if (m <= 100 || m >= 85) {
                System.out.println("You paseed with distinction along with grade A+, Keep going");
            } else if (m <= 84 || m >= 75) {
                System.out.println("You have passed grade A. You need improvement ");
            } else if (m <= 74 || m >= 65) {
                System.out.println("You have passed with grade B. you need improvement");
            } else if (m <= 64) {
                System.out.println("You have passed with grade c. you need improvement");

            } else if (m >= 63) {
                System.out.println("You are fail. Try hard for improvement");
            }

        }

    }

}
