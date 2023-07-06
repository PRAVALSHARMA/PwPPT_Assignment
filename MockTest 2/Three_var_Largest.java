import java.util.Scanner;

public class Three_var_Largest {
    public static void main(String[] args) {
        System.out.println("enter thee no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if (a >= b) {
            if (a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } else {
            if (b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
    }
}

// double n1 = -4.5, n2 = 3.9, n3 = 2.5;

// if (n1 >= n2 && n1 >= n3)
// System.out.println(n1 + " is the largest number.");

// else if (n2 >= n1 && n2 >= n3)
// System.out.println(n2 + " is the largest number.");

// else
// System.out.println(n3 + " is the largest number.");
// }
