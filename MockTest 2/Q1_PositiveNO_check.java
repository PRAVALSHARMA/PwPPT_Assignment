import java.util.Scanner;

public class Q1_PositiveNO_check {
    public static void main(String[] args) {
        System.out.println("enter an integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("no is negative.");

        } else if (n > 0) {
            System.out.println(" no is positive.");
        } else {
            System.out.println("no is zero");
        }

    }
}