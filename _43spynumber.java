// spy number = a positive number is called a spy number if the sum and product of its digits are equal. ex=1124
import java.util.*;
public class _43spynumber{
    public static void main(String[] args) {
        int n,product=1,sum=0;
        int ld;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            ld=n%10;
            sum=sum+ld;
            product=product*ld;
            n=n/10;
        }
        if(sum==product)
        System.out.println("given number is spy number");
        else{
            System.out.print("not a spy number");
        }

    }
}