 import java.util.*;                                                               
public class _4ifelse {
   public static void main(String[] args) {
       int bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter readings ");
        int readings = sc.nextInt();
        sc.close();
        if(readings>400){
        bill = 2000;
        }
        else if(readings>200){
            bill=1000;
        }
        else {
            bill=500;
        }
        System.out.println("YOUR BILL IS "+ bill);
    }
}
