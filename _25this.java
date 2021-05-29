class student{
    int id;
    String name;
student(int id, String name){
    this.id=id;
    this.name=name;
}
void display(){
    System.out.println("ID:"+id);
    System.out.println("Name: "+name);
}
}
public class _25this {
    public static void main(String[] args) {
        student s= new student(1020,"kamal");
        s.display();
    }
    
}
