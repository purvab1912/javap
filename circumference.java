import java.util.Scanner;

public class circumference {
    public static double circumferenceOfCircle(double radius) {

        return 2 * 3.14 * radius;

    }

    public static void main(String[] args) {
        double radius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle");
        radius = sc.nextDouble();

        System.out.println(circumferenceOfCircle(radius));

    }

}
