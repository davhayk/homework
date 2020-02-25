import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        int k = n;
        int factorial = 1;
        while ( n > 0) {
            factorial = factorial*n;
            n--;
        }
        System.out.println(k + "! = " + factorial );
    }
}
