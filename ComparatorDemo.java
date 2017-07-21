import java.util.Comparator;

class ComparatorDemo
{
    void check()
    {
        Comparator s=()->{System.out.println("hello");};
        s.compare();
    }
    public static void main(String[] args) {
        ComparatorDemo c=new ComparatorDemo();
        c.check();
}
}