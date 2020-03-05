import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string");
        String firstString = scanner.nextLine();
        System.out.println("Input second string");
        String secondString = scanner.nextLine();
        int s = 0;
        char[] firstArr = firstString.toCharArray();
        char[] secondArr = secondString.toCharArray();
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                for (int j = 0; j < firstString.length(); j++) {
                    if (firstArr[i] == secondArr[j]) {
                        s++;
                        secondArr[j] = ';'; // Es cragiry terutyun uni - ete stringum ; ka, sxal kani
                        break;
                    }
                }
            }
            if (s == firstString.length())
                System.out.println("Is a rotation");
            else
                System.out.println("Is not a rotation");
        }
        else
            System.out.println("Is not a rotation");
    }
}
