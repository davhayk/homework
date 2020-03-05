import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string : ");
        String candidate = scanner.next();
        boolean IsaPalindrome = true;
            for (int i = 0, j = candidate.length() - 1; i < j; i++, j--) {
                if (candidate.charAt(i) != candidate.charAt(j)) {
                    IsaPalindrome = false;
                    break;
                }
            }
        if (IsaPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
