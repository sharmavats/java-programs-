import java.util.*;
public class _10dowhileprogramme {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("you are inside do-while loop");
            System.out.println("press 1 to exit from loop");
            i=sc.nextInt();
        }
        while(i!=1);
        System.out.println("you are out of do while loop");
        sc.close();
    }
}
