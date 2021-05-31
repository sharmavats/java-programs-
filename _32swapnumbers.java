import java.util.*;
public class _32swapnumbers {
    public static void main(String[] args) {
        int x,y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before swapping numbers:"+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("after wapping :" + x+" "+y);

    }
}
