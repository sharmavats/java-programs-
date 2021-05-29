class superclass{
    superclass(){
        System.out.println("super class constructor called");
    }
}
class subclass extends superclass{
    subclass(){
        super();
        System.out.println("sub class constructor called");
    }
    void msg(){
        System.out.println("hello world");
    }
}
public class _23superkeyword {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.msg();
    }
}
