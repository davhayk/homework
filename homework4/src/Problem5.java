import java.util.Scanner;

// Input 2 int x and y. Calculate the number and sum of all integer between x and y which are divisible by 9
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (x < y) {
            if (x % 9 == 0)
                System.out.print(x + " ");
            x++;
        }
    }
}
