// calculate the sum of the first 20 numbers
public class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while ( i <= 19 ) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of the first 20 numbers is: " + sum);
    }
}
