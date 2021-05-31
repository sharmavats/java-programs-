import java.util.Scanner;
public class _33swapwithoutthird {
    public static void main(String[] args) {
     int a; int b;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the values of a and b");
     a=sc.nextInt();
     b=sc.nextInt();
     System.out.println("value of a and b before swapping"+a+" "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("value of a and b after the swapping"+a+" "+b);

    }
}
