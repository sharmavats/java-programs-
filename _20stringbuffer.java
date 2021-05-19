import java.io.*;
public class _20stringbuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("helpdesk");
        s.append("developer");
        System.out.println(s);
        s.append("sde1");
        System.out.println(s);
        s.deleteCharAt(20);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        
    }
}
