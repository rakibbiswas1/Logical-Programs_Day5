import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit (t<50) : ");
        int t = ref.nextInt();

        System.out.println("Enter the velocity of wind in miles/hr (v=3-120) : ");
        int v = ref.nextInt();
        if (t<50 && (v>3 && v<120)) {

            double w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75 * Math.pow(v, 0.16)));

            System.out.println("Wind chill=" + w);
        } else {
            System.out.println("Enter correct values of temperature & wind speed");
        }
    }
}
