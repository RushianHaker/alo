package behavioral.interpreted;

public class NonTerminaExpression extends AbstractExpressior {

    private AbstractExpressior terminalExpression;
    private AbstractExpressior nonterminalExpression;


    @Override
    public void interpreter(Context context) {
        if(context.position < context.source.length()){
            terminalExpression = new TerminaExpression();
            terminalExpression.interpreter(context);
            context.position++;

            if(context.result){
                nonterminalExpression = new NonTerminaExpression();
                nonterminalExpression.interpreter(context);
            }
        }
    }
}
