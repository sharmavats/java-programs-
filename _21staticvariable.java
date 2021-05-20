class Main_one{
    static int i=1;
    int j=1;
    void method(){
        System.out.println("value of i="+i+"&j="+j);
        i++;
    }
}
public class _21staticvariable {
    public static void main(String[] args) {
        Main_one m1=new Main_one();
        Main_one m2=new Main_one();
        Main_one m3=new Main_one();
  m1.method();;
  m2.method();;
  m3.method();;
    }
}
