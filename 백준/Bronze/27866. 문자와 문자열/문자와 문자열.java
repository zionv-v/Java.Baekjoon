import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String  st = sc.next();
        int i = sc.nextInt();
        
        System.out.println(st.charAt(i-1));        
    }
}


