import java.util.*;
public class _9whileloop {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        while(i!=1){
         System.out.println("you are inside while loop");
         System.out.println("press 1 to exit from loop");
         i=sc.nextInt();
        }
        System.out.println("you are out of while loop");
        sc.close();
    }
}
