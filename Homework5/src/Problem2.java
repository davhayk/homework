import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (n > 0) {
            System.out.print("Input element " + i + ": ");
            arr[i] = scanner.nextInt();
            System.out.println();
            i++;
            n--;
        }
    }
}
