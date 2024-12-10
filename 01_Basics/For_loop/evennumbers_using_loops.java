package For_loop;
import java.util.Scanner;

public class evennumbers_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i%2==0) {
                System.out.println(i);
            }            
        }
        sc.close();
    }
}
