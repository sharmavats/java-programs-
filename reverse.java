import java.util.*;
public class reverse {
    static int reverse(int a){
        int q,rev=0;
       while(a>0){
           q=a%10;
           a=a/10;
           rev=(rev*10)+q;
       }
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int a= sc.nextInt();
        System.out.print("reverse of the number "+a+" is "+reverse(a));
    }
    
}
