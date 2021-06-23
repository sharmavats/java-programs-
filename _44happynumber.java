// happy number = its defined as a number which will yield 1 when its replaced by the sum of square of its digits repeatedly . 
// if this process results in an endless cycle of number containing 4 then is called an unhapy number 
// ex=n=19 1^2+9^2=82 -> 8^2+2^2=68->36+64=100->1^2+0+0=1
import java.util.*;
public class _44happynumber {
    public static void main(String[] args) {
        int num,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        num=sc.nextInt();
        while (sum!=1&&sum!=4) {
            sum=0; 
            while(num>0){
                temp=num%10;
                sum+=(temp*temp);
                num=num/10;
            }
              num = sum;
            }
            if(num==1){
                System.out.println("happy number");
            }
            else{
                System.out.println("unhappy number");
            }
            
        }
    }

