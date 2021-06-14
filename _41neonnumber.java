//a neon number is a number where the sum of digits of square of the number is equal to the number ex = 9 ; 9*9=81 and 8+1=9
import java.util.*;
public class _41neonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a;
        int s=0;
        System.out.println("enter the number");
        n=sc.nextInt();
        m=n*n;
        while(m!=0){
            a=m%10;
            s=s+a;
            m=m/10;
        }
        if(s==n){
            System.out.println(n+" is a neon number");
        }
        else{
            System.out.println("not a neon number");
        }
    }
}
