import java.util.Scanner;

/* fascinating number = multiplying a number by two and thee separately , the number obtained by writing the results 
obtained with the given number will be called a fascinating number . if the result obtained after concatation contain all digits from 1 to 9, exactly once.
ex= 327 -> 327*2=654 , 327*3=981 so concat = 327654981(all no 1 to 9) so facinating number */ 
import java.util.*; 
public class _46fasinatingnumber {
    static boolean isfascinating(int n){
        String strnum = ""+n+(n*2)+(n*3);
        int concatenum = Integer.parseInt(strnum);
        int freq[]=new int[11];
        for(int i=0; i<strnum.length(); i++){
            int digit = strnum.charAt(i)-'0';
            freq[digit]++;
        }
        for(int i=1; i<=9; i++){
            if(freq[i]!=1)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 3 digit number:");
        int num = sc.nextInt();
        if(isfascinating(num)){
            System.out.println(num+" is a fascinating number");
        }
        else{
            System.out.print("not a fascinating number");
        }
    }
}
