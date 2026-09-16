import java.util.Random;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int target = rd.nextInt(1, 101);
        int attempts = 0;
        while (true) {
            attempts++;
            System.out.println(" enter a number between 1 to 100");
            int guess = sc.nextInt();
            if (guess > target) {
                System.out.println(" target is greater ");
            } else if (guess == target) {
                System.out.println(" target acheived ");
                System.out.println("No. of attempts: " + attempts);
                break;
            } else {
                System.out.println(" target is lesser ");
            }

        }

    }
}