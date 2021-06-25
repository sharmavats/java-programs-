// pronic number = pronic number can be defined as the number which is a product of two consecutive numbers . mathematically pronic number can be defined as 
// ex= N*(N+1) 6=2*3,72=8*9
import java.util.*;
public class _48pronicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num =sc.nextInt();
        int ans =0;
        for(int i=0; i<num; i++){
            if(i*(i+1)==num){
                ans=1;
                break;
            }
        }
        if(ans==1)
        System.out.println("pronic number ");
        else
        System.out.println("not a pronic number ");
    }
}
