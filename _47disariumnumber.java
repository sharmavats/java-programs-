// disarium number = a number is said to be disarium number when the sum of its digits raised to power of their respective positions is equal to the number itself 
// example = 175 as 1^1+7^2+5^3=1+49+125=175
import java.util.*;
public class _47disariumnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number : ");
        int num = sc.nextInt();
        int copy =num,d=0,sum=0;
        String s = Integer.toString(num);
        int len=s.length();
        while(copy>0){
            d=copy%10;
            sum=sum+(int)Math.pow(d,len);
            len--;
            copy=copy/10;
        }
        if(sum==num){
            System.out.println("disarium number ");}
            else{
            System.out.println("not a disarium number ");
        }
    }
}
