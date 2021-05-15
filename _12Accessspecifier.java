  class _demo {
    public int a =10;
    int b=20;
    private int c=30;
    public void method1(){
        System.out.println("public method");
    }
    private void method2(){
        System.out.println("private method");
    }
}
public class _12Accessspecifier{ // public class name should be same as filename
 public static void main(String[] args) {
    _demo obj = new  _demo();
obj.method1();// allowed
}
}