import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a positive number:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double guess = n/2;
        double r;
        for (int i = 0; i < 4; i++) {
            r = n/guess;
           guess=(guess+r)/2;
        }
        System.out.println(guess);



    }
}