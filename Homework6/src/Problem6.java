import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input parenthesis sequence");
        String firstparenthesis = scanner.nextLine();
        int counterForOpener = 0;
        int counterForCloser = 0;
        char opener = '(';
        char closer = ')';
        char[] firstArr = firstparenthesis.toCharArray();
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == opener) {
                counterForOpener++;
            } else if (firstArr[i] == closer)
                counterForCloser++;
        }
        if (counterForOpener != 0 || counterForCloser != 0) {
            if (counterForOpener == counterForCloser)
                System.out.println("Valid");
            else if (counterForOpener != counterForCloser)
                System.out.println("Invalid");
        } else
            System.out.println("There are no () in here");
    }
}
