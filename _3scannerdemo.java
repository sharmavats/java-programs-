import java.util.*;

public class _3scannerdemo {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("enter your name");
String name = sc.nextLine();
System.out.println("enter your semester");
int sem = sc.nextInt();
System.out.println("enter your cgpa");
float cgpa = sc.nextFloat();
System.out.println("details");
System.out.println("NAME " + name);
System.out.println("SEMESTER " + sem);
System.out.println("CGPA "+ cgpa);
sc.close();
    
}
    
}
