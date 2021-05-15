public class _11labelledloop {
  public static void main(String[] args) {
      outer_loop:
      for (int i = 1; i <=3; i++) {
          inner_loop:
          for (int j = 1; j <=3; j++) {
              if(i==2 && j==2)
              {
                  System.out.println("continue execute for outer loop at i=2 and j=2");
                  continue outer_loop;
              }
              System.out.println("value of i:"+i+"value of j: "+j);
          }
          
      }
  }  
}
