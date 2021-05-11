import java.util.Scanner;
import java.util.*;
class _5switchcase {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i;
      System.out.println("enter any number between 1 to 5");
      i = sc.nextInt();
      sc.close();
      switch (i) {
          case 1:
          System.out.println("YOU ENTER ONE ");
              break;
      case 2:
         System.out.println("YOU ENTER TWO ");
         break;
          case 3:
         System.out.println("YOU ENTER THREE ");
         break; 
         case 4:
         System.out.println("YOU ENTER FOUR ");
         break; 
         case 5:
         System.out.println("YOU ENTER FIVE");
         break;
          default:
         System.out.println("YOU ENTERED WRONG NUMBER ");
       
      }
  }
}