package behavioral.interpreted;

public class TerminaExpression extends AbstractExpressior {
    @Override
    public void interpreter(Context context) {
        context.result =  context.source.charAt(context.position) == context.vocabulary;
    }
}
