import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
       if(A > 0 && B < 10)
       {
           System.out.println(A - B);
       }
       else
       {
           System.out.println("조건을 만족하지 않습니다.");
       }        
    }
}