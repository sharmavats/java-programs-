import java.util.*;
public class _15vector {
    public static void main(String[] args) {
       Vector vector = new Vector(3);
       System.out.println("initial capacity of vector:" +vector.capacity());
       vector.addElement(new Integer(1));
       vector.addElement(new Integer(2));
       vector.addElement(new Integer(3));
       vector.addElement(new Float(2.1549));
       vector.addElement(new Float(3.14159));
       vector.addElement(new String("hello"));
       System.out.println(" capacity after adding elements :" +vector.capacity());
       System.out.println(" size of vector:" +vector.capacity());
       System.out.println(" first item :" +vector.firstElement());
       System.out.println(" last item :" +vector.lastElement());
    }
}
