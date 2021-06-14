// armstrong number = it is any number of n digits which is equal to sum of nth power of digits in the number. ex = 1634 = 1^4 +6^4+3^4+4^3
import java.util.*;
public class _39armstrongnumber {
    public static void main(String[] args) {
        int num , number ,temp , total = 0;
        System.out.println("enter 3 digit number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number = num;
        for(;number!=0; number/=10){
            temp=number%10;
            total= total+temp*temp*temp;

        }
        if(total==num){
        System.out.println(num +" is an armstrong number");}
        else{
            System.out.println("not an armstrong number");
        }
    }
}
