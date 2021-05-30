import java.util.Scanner;
public class _27evenodd {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num%2==0){
            System.out.print("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
