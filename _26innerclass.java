public class _26innerclass {
    class innerClass{
        void inn_method(){
            System.out.println("method of inner class ");
        }
    }
    void class_method(){
        innerClass in = new innerClass();
        in.inn_method();
    }
    public static void main(String[] args) {
        _26innerclass obj = new _26innerclass();
        obj.class_method();
    }
}
