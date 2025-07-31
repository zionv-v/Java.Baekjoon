import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int a = sc.nextInt();
		String st = sc.next();
        
		sc.close();
 
		System.out.println(a * (st.charAt(2) - '0'));
		System.out.println(a * (st.charAt(1) - '0'));
		System.out.println(a * (st.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(st));
 
	}
}
 