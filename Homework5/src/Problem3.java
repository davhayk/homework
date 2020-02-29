import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt(), k = n;
        System.out.print("Input a string, which needs to be found: ");
        String string = scanner.next();
        String[] arr = new String[n];
        int i = 0;
        int p = 0;
        while (k > 0) {
            System.out.print("Input element " + i + ": ");
            arr[i] = scanner.next();
            System.out.println();
            i++;
            k--;
        }
        while (k < n) {
            if (string.equals(arr[k])) {
                System.out.println("There's an equal string in " + k + " element of array");
                p++;
            }
            k++;
        }
        if (p == 0)
            System.out.println("Not found");
    }
}
