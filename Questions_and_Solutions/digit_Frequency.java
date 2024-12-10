package Questions_and_Solutions;

import java.util.Scanner;

public class digit_Frequency {
    public static int getDigitFrequency(int n, int d) {
        int rv = 0;

        while (n > 0) {
            int dig = n % 10;

            if (dig == d) {
                rv++;
            }
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter Target digit: ");
        int d = sc.nextInt();

        int f = getDigitFrequency(n, d);
        System.out.println(f);
        sc.close();
    }
}
