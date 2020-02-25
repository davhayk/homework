import java.util.Scanner;

// Input an integer n. Calculate the result of the following formula: 1 - 2 + 3 - 4 + 5 - 6 + 7 ...(+-) n
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 2;
        int sum = 0;
        while (a <= n && b <= n) {
            sum = sum + a - b;
            a+=2;
            b+=2;
        }
        System.out.println("The result of the formula is: " + sum);
    }
}
