import java.util.Scanner;

// input 2 integers x and y. Find the y-th power of integer x;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x;
        int i = 2;
        while (i <= y) {
            sum = sum*x;
            i++;
        }
        System.out.print(x + "^" + y + " = " + sum);
    }
}
