import java.util.Scanner;

public class GP_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter number of Digits: ");
        int n = sc.nextInt();
        System.out.println(a);
        for (int i = 1; i < n; i++) {
            int nextdigit = a * r;
            System.out.println(nextdigit);
            a = nextdigit;
        }

        sc.close();
    }
}