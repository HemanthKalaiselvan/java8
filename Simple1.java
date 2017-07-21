class Simple
{
    private Simple(int a)
    {
        System.out.println("hello buddy"+a);
    }
    public static void main(String... args)
    {
        Simple s=new Simple(10);
        Simple s1=new Simple(15);
    }
}