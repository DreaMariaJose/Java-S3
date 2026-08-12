package oops26;
import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        while(a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}
