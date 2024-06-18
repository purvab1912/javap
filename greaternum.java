import java.util.Scanner;

public class greaternum {
    public static void main(String[] args) {
        int n;
        int m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        n = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter second number");
        m = sc1.nextInt();

        if (n == m) {
            System.out.println("You have entered same number");
        } else if (n > m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }

    }

}
