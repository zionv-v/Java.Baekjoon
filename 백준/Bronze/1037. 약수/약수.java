import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] divisor = new int[n];

        for (int i = 0; i < n; i++)
            divisor[i] = sc.nextInt();

        Arrays.sort(divisor);

        System.out.println(divisor[0] * divisor[n - 1]);
    }
}