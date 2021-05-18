import java.util.*;
public class _16arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("C");
        arrayList.add("java");
        arrayList.add("ruby");
        arrayList.add("python");
        System.out.println("\n Arraylist:");
        System.out.println( arrayList);
        arrayList.add(2, "c++");
        System.out.println(" \n arraylist after adding");
        System.out.println(arrayList);
        arrayList.remove("C");
        System.out.println("\n array list after removing ");
        System.out.println(arrayList);
        String str;
        Iterator e = arrayList.iterator();
        while (e.hasNext()){
        str = (String)e.next();
        System.out.println(str);   
        }

    }
}
