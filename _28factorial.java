import java.util.Scanner;
public class _28factorial {
    public static void main(String[] args) {
        int fact; int sum=1;
        Scanner sc = new Scanner(System.in);
        fact = sc.nextInt();
        for(int i=1; i<=fact; i++){
            sum = sum*i;
        }
         System.out.println("factorial is "+sum);
    }
}
