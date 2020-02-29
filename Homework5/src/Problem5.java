import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt(), k = 0;
        System.out.print("Input the character: ");
        String character = scanner.next();
        String[] arr = new String[n]; // char
        System.out.println("Input the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next(); // Stex inch-vor error tvec, vor char-y scanner.next()-ov
                                     // input ches kara anes. Urish dzev chgitem chari inputi hamar
        }
        for (int i = 0; i < n; i++) {
            if (character.equals(arr[i])) {
                k++;
            }
        }
        System.out.println("The char occurs in array " + k + " times");
    }
}
