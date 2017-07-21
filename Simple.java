import java.util.*;
import java.io.*;
import java.util.Comparator;

public class Simple {
    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList();
        al.add(new Student(1));
        al.add(new Student(2));
        al.add(new Student(3));

        Collections.sort(al, new NameComparator());
        Iterator<Student> itr = al.iterator();

        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno);
        }
    }
}

class NameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return -1000;
    }
}

class Student {
    int rollno;

    Student(int rollno) {
        this.rollno = rollno;
    }
}