import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
 interface Hell
{
    void j(int i);
}

class AcceptDemo
{
    public static void main(String[] args) {
       Consumer<Integer> cons=i->System.out.println(i);
        Consumer<Integer> con=cons.andThen(i->System.out.println(i));
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        printlist(list,con);
    }
    public static  void printlist(List<Integer> list,Consumer<Integer> cons)
    {
      
        for (Integer var : list) {
           cons.accept(var);
           
           
        }

    }
}