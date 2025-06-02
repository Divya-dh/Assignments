import java.util.*;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();      
        long n = sc.nextLong();    

        long countInS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countInS++;
            }
        }

        long fullRepeats = n / s.length();
        long remainder = n % s.length();

        long countInRemainder = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                countInRemainder++;
            }
        }

        long total = (fullRepeats * countInS) + countInRemainder;
        System.out.println(total);
    }
}
