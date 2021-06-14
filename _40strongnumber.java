//strong no =its a special number whose sum of the factorial of digit is equal to the original number.
import java.util.*;
public class _40strongnumber {
    public static void main(String[] args) {
        int number,temp,reminder,sum=0,i,factorial;
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER NUMBER");
       number = sc.nextInt();
       temp=number;
       while(temp>0){
           factorial=1;
           i=1;
           reminder=temp%10;
           while(i<=reminder){
               factorial=factorial*i;
               i++;
           }
           System.out.println("the factorial of "+ reminder +"="+factorial);
         sum = sum+factorial;
         temp=temp/10;
        }
        System.out.println("the sum of factorial of a given number "+number+" = "+sum);
        if(number==sum){
            System.out.println("\n "+ number+" is a strong number");
        }
        else{
            System.out.println("\n " + number+ "is not a strong number");
        }
    }
}
