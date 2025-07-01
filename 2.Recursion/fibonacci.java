import java.util.Scanner;

public class fibonacci {
    // Recursive method to calculate nth Fibonacci number
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
        sc.close();
    }
}
