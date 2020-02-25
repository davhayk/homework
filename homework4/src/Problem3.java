import java.util.Scanner;
// input an integer. print mult of that int up to 10
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println( a + " * " + i + " = " + a*i);
            i++;
        }
    }
}
