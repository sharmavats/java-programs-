//evil number = an evil number is a non - negative number that has an even number of 1s in its binary expansion ex=3 binary expansion =11 total no of 1's in this 2 i.e even
// odious number = numbers that are not evil are called odious numbers . given a number , the task is to check if it i evil number or odious numbers.
import java.util.*;
public class _50evilodiousnumber {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num= sc.nextInt();
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        if(count%2==0){
            System.out.println("evil number");}
            else{
            System.out.println("odious number");
        }
    }
}
