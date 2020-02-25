import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 2;
        int k = 1;
        int sum = 0;
        char minus = '-';
        char plus = '+';
        while (a <= n && b <= n) {
            if (k % 2 == 1)
                System.out.print("" + a + minus + b);
            else if (k % 2 == 0)
                System.out.print("" + a + plus + b);
            if (a < n && b < n)
                System.out.print(" + ");
            sum = sum + a - b;
            a += 2;
            b += 2;
            k++;
        }
        System.out.print(" = " + sum);
    }
}

