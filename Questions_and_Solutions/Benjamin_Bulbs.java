package Questions_and_Solutions;
import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Bulbs: ");
        int n1 = sc.nextInt();

        for (int i = 1; i * i <= n1; i++) {
            System.out.println(i * i);
        }
        sc.close();
    }
}
