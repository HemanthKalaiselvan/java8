public class ObjectHashCodeDemo extends Student
{
public ObjectHashCodeDemo()
    {
     System.out.println("hello");   
    }
    public static void main(String[] args) {
       
        Student student=new Student(5);
        Student student2=new Student(8);
        System.out.println(student.getAge());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
    }
}