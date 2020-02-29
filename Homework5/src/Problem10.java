import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = scanner.nextInt();
        System.out.print("Input the k integer: ");
        int k = scanner.nextInt();
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
        int s = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            s = 0;
            for (j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    s++;
                }
            }
            if (s == k)
                System.out.println("The element " + i + " (" + arr[i] + ") occured exactly k times");
            //Bolor k angam handipacnery print a anum, aysinqn ete 11-y handipum a 2 angam, inqy 2 angam 11 a tpum.
            // Huys unem pahanjy 1 angam tpel cher pahanjum
        }
    }
}
