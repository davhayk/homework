import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        int i = n;
        while(n > 0) {
            k = 1;
            while(k <= i) {
                if (k % 2 == 1)
                    System.out.print("Black");
                else if (k % 2 == 0)
                    System.out.print("White");
                k++;
            }
            System.out.println("");
            n--;
        }
    }
}
