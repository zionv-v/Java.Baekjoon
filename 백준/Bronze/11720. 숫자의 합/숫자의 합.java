import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		String st = sc.next();
		sc.close();
		
		int sum = 0;
        
		for(int i = 0; i < n; i++) {
			sum += st.charAt(i)-'0';
		}
		System.out.print(sum);
	}
}