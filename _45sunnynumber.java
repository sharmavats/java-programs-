// sunny number = a number N is called sunny number if the square root of the number N+1 is an integer number . example = 24 as 24+1=25 has a root value 5 that is integer 
import java.util.*;
public class _45sunnynumber {
    public static void main(String[] args) {
        double x;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        x=Math.sqrt(num+1);
        if((int)x==x){
            System.out.println(num+" is a sunny number ");
        }
        else{
            System.out.println(num + " not a sunny number");
        }
        sc.close();
    }
}
