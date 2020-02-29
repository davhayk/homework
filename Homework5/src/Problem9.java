import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int i;
        System.out.println("Input the elements of the first array: ");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Input the elements of the second array: ");
        for (i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int s = 0;
        for (i = 0; i < n; i++) {
            s = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr2[j]) {
                    s++;
                }
            }
            if (s == 0)
                System.out.println("The " + i + " element didn't occur");
        }
    }
}
