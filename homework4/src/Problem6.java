import java.util.Scanner;

// Input an integer n. Find the following sum: 1+1/2+1/3+1/4+...1/n
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double i = 1;
        while (i <= n) {
            sum = sum + 1 / i;
            i++;
        }
        System.out.print(sum);
    }
}
