class superclass{
    void method(){
        System.out.println("method from super class");
    }
}
class subclass extends superclass{
    void method(){
        super.method();
        System.out.println("method from sub class");
    }
}
public class _23superkeywordmethod {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.method();
    }
}
