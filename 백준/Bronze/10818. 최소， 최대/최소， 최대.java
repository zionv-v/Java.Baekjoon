import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) 
        {
            min = Math.min(numbers[i], min);
            max = Math.max(numbers[i], max);
        }
        System.out.println(min + " " + max);
    }
}