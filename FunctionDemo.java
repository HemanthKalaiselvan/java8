import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class FunctionDemo
{
    public static void main(String args[])
    {
        Employee e1=new Employee(9,"hello");
        Employee e3=new Employee(4,"hello1");
        Employee e2=new Employee(3,"hello2");
        Function<Employee,String> fun=(Employee e)->{return e.getName();};
    List<Employee> emplist=new ArrayList<Employee>();
    emplist.add(e1);
    emplist.add(e2);
    emplist.add(e3);
    for (Employee var : emplist) {
        
        System.out.println(var.getId());
}
//Function<String,String> emp=(String s)->{return s.substring(0,1);};
List<String> e=FunctionDemo.getNameList(emplist,fun);
e.forEach(System.out::println);
e.forEach(str->System.out.println(str));
    


    }
    public static List<String> getNameList(List<Employee> emp,Function<Employee,String> fun)
    {
        List<String> list=new ArrayList<String>();
        for (Employee var : emp) {
         list.add(fun.apply(var))   ;
        }
        return list;
    }
}