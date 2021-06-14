import java.util.*;
public class _37leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any year");
        year = sc.nextInt();
        sc.close();
        boolean isleap = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    isleap=true;
                
                else
                    isleap=false;
            }
                else 
                    isleap=true;
                }
                else{
                    isleap=false;
                }
            
        
   if(isleap==true)
       System.out.println("leap year");
   
   else
System.out.print("not a leap year");
   
   }
}

