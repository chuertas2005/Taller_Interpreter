
package tallerinterpreter.expressions;

import tallerinterpreter.context.Context;

public class ApagarLuzExpression implements Expression {

    @Override
    public void interpret(Context context) {
        context.setLuzEncendida(false);
        System.out.println("Accion: Apagando la luz.");
    }

}
