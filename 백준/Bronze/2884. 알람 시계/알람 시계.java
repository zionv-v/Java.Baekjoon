import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(m>45)
        {
            m -= 45;
        }
        else if(m == 45)
        {
            m = 0;
        }
        else if(m < 45)
        {
            if (h==0)
            {
                h = 23;
                m = 60+(m-45);
            }
            else
            {
                h -= 1;
                m = 60 + (m-45);
            }
        }
        System.out.println(h);
        System.out.println(m);                
    }
}