 class _2classobjectdemo {
  int class_var1=50;
  float class_var2=3.14f;
  void method(){
      int method_var1=10;
      float method_var2=2.214f;
      System.out.println("class_var 1 :"+ class_var1);
      System.out.println("class_var 2 :"+ class_var2);
      System.out.println("method_var 1 :"+ method_var1);
      System.out.println("method_var 2 :"+ method_var2);
  }
}
class Main{
    public static void main(String[] args) {
    _2classobjectdemo obj1 = new _2classobjectdemo();
    obj1.method();
}
  }  

