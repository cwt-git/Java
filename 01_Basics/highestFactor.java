import java.util.Scanner;

public class highestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int hightestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                hightestFactor = i;
                break;

            }
            
        }
        System.out.println(hightestFactor);
        sc.close();
    }
}
