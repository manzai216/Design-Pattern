package interpreter.simple;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 13:27 2018/4/8
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {

        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");
        context.add(a, 4);
        context.add(b, 8);
        context.add(c, 2);

        System.out.println(new MinusOperation(new PlusOperation(a,b), c).interpreter(context));
    }
}
