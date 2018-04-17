package interpreter.simple;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 16:56 2018/4/17
 *@Modified By:
 *
 */
public class PlusOperation extends NonTerminalExpression {

    public PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    //将两个表达式相加
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }
}
