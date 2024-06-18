import java.util.Scanner;

class variables {
    public static void main(String[] args) {

        System.out.println("hello world");

        // addition5
        int a, b, sum;

        Scanner myfirstScanner = new Scanner(System.in);
        System.out.print("type a number ");
        a = myfirstScanner.nextInt();

        Scanner mysecondscanner = new Scanner(System.in);
        System.out.print("type a second number \n");
        b = mysecondscanner.nextInt();

        sum = a + b;

        System.out.println(sum);

        // even odd (if-else)
        int d;

        Scanner checkeo = new Scanner(System.in);
        System.out.println("Enter a number to check whether number is even or odd");
        d = checkeo.nextInt();

        if (d % 2 == 0) {
            System.out.println("Your entered number is even");
        } else {

            System.out.println("Your enterd number is odd");
        }

    }

}
