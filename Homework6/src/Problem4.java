public class Problem4 { // es xndiry chem karacel, es cragiry google-ic uxxaki gtel - pordzel em haskanam. Chem haskace
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(rotate("abcdefg", i));
        }
    }

    public static String rotate(String s, int offset) {
        int i = offset % s.length();
        return s.substring(i) + s.substring(0, i);
    }
}