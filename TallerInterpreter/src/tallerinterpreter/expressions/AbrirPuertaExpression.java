
package tallerinterpreter.expressions;

import tallerinterpreter.context.Context;

public class AbrirPuertaExpression implements Expression {

    @Override
    public void interpret(Context context) {
        context.setPuertaAbierta(true);
        System.out.println("Accion: Abriendo la puerta.");
    }

}
