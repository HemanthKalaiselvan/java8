import java.util.*;
import java.util.stream.Stream;
class Sort
{
public static void main(String args[])
{
List<Integer> s=new ArrayList<Integer>();
s.add(10);
s.add(20);
s.add(5);
s.add(17);
s.add(15);
System.out.print(s);
Stream<Integer> a=s.stream();
a.sorted().forEach((n)->System.out.println(n));

}
}