import java.util.function.Predicate;

class PredicateDemo
{
    static boolean check(int i)
    {
        if(i<10)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> pr=PredicateDemo::check;
        boolean result=(int)pr.test(20);
        System.out.println(result);

    }
}