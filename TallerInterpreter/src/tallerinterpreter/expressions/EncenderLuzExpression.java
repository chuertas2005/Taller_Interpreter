
package tallerinterpreter.expressions;

import tallerinterpreter.context.Context;

public class EncenderLuzExpression implements Expression {

    @Override
    public void interpret(Context context) {
        context.setLuzEncendida(true);
        System.out.println("Accion: Encendiendo la luz.");
    }

}