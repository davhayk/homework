import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        int k = n;
        int temp = 0;
        int fib1 = 1;
        int fib = 1;
        if (n == 0)
            System.out.println(0);
        else if (n == 1 || n == 2)
            System.out.println(1);
        else {
            while (n > 2) {
                temp = fib1 + fib;
                fib = fib1;
                fib1 = temp;
                n--;
            }
        }
        System.out.println("fib(" + k + ") = " + temp);
    }
}
