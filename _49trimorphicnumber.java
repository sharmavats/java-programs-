// trimorphic number = a number is called trimorphic number if and only if its cube ends in the same digits as the number itself .
// in other words , number appears at the end of its cube  ex = 25 , 25^3=15625
import java.util.*;
public class _49trimorphicnumber {
    public static void main(String[] args) {
        boolean flag = true;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int cube =n*n*n;
    while(n!=0){
        if(n%10!=cube%10){
            flag = false;
            break;
        }
        n/=10;
        cube/=10;
    }
    if(flag){
        System.out.println("number is a trimorphic number");
    }
    else{
        System.out.println("number is not a trimorphic number");
    }
    }
    
}
