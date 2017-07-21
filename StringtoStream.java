import java.util.*;

class StringtoStream1
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.stream().forEach(System.out::println);
        //String[] s={"hello","world","super"};
        int[] s={1,2,3};
    s.stream().foreach(System.out::println);
    }
}