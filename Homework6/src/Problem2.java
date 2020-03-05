import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String string = scanner.nextLine();
        char x = ' ';
        int s = 1;
        for (int i = 0; i < string.length(); i++) {
            if (x == string.charAt(i)) {
                s++;
            }
        }
        System.out.println("There's " + s + " strings");
    }
}
