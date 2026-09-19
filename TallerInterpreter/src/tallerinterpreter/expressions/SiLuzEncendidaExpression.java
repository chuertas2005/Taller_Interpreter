
package tallerinterpreter.expressions;

import tallerinterpreter.context.Context;

public class SiLuzEncendidaExpression implements Expression {

    private Expression expresionVerdadera;
    private Expression expresionFalsa;

    public SiLuzEncendidaExpression(Expression expresionVerdadera,
                                    Expression expresionFalsa) {

        this.expresionVerdadera = expresionVerdadera;
        this.expresionFalsa = expresionFalsa;

    }

    @Override
    public void interpret(Context context) {

        if (context.isLuzEncendida()) {
            System.out.println("Condicion: La luz esta encendida.");
            expresionVerdadera.interpret(context);
        } else {
            System.out.println("Condicion: La luz esta apagada.");
            expresionFalsa.interpret(context);
        }

    }

}