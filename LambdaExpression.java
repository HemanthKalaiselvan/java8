interface LambdaExpressionDemo{
   public static void re();
}
class LambdaExpression
{
    LambdaExpressionDemo l=(i)->System.out.println(i);
    public static void main(String[] args) {
        l.re(5);
    }
}