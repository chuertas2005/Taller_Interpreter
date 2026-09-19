
package tallerinterpreter.expressions;

import java.util.List;
import tallerinterpreter.context.Context;

public class SecuenciaExpression implements Expression {

    private List<Expression> expresiones;

    public SecuenciaExpression(List<Expression> expresiones) {
        this.expresiones = expresiones;
    }

    @Override
    public void interpret(Context context) {

        for (Expression expresion : expresiones) {
            expresion.interpret(context);
        }

    }

}
