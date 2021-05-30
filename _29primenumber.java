import java.util.Scanner;
public class _29primenumber {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        n=sc.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is non prime");
        }
    }
}
