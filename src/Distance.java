import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        System.out.print("Enter the value of x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();

        double distance = Math.sqrt(x * x + y * y); // Math.sqrt means root
        System.out.println("the total distance is : " + distance);
    }
}
