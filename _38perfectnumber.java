//perfect number = a positive no that is equal to the sum of its proper divisors . smallest no is 6 ex= 1,2,3 are divisor of 6 and 1+2+3=6
import java.util.*;
public class _38perfectnumber {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        n= sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum= sum+i;
            }
        }
        if(sum==n){
            System.out.println("given number is perfect number");
        }
        else{
            System.out.println("given number is not perfect");
        }
    }
}
