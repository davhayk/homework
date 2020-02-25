import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an n integer: ");
        int n = scanner.nextInt();
        int k = n/2;
        int temp = 0;
        if (n == 0) {
            System.out.println("n equals to 0"); // I don't know if 0 is a prime number or not.
        }
        else {
            while (k > 1) {
                if (n % k == 0) {
                    temp++;
                }
                k--;
            }
            if (temp == 0)
                System.out.println("n is a prime number: " + n);
            else
                System.out.println("n is not a prime number: " + n);
        }
    }
}
