import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt(), k = n-1;
        int[] arr = new int[n];
        int i;
        System.out.println("Input the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("The elements of the reversed array are: ");
        int temp = 0;
        for (i = 0; i < k; i++) {
                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
