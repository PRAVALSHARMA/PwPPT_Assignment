import java.util.Scanner;

public class Fibbanacci {

    // public static int series(int n) {
    // int result = 0;
    // for (int i = 0; i <= n; i++) {
    // if (n <= 1) {
    // return n;
    // } else {
    // result = series(n - 1) + series(n - 1);

    // }

    // }

    // return result;
    // }

    // public static void main(String[] args) {
    // System.out.println("enter an integer:");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // System.out.println("The fibbonacci series is:");
    // int result = series(n);
    // System.out.println(result);

    // }

    // }

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String args[]) {
        int count = 10;
        System.out.print(n1 + " " + n2);// printing 0 and 1
        printFibonacci(count - 2);// n-2 because 2 numbers are already printed
    }
}