
package tallerinterpreter.main;

import java.util.Arrays;

import tallerinterpreter.context.Context;
import tallerinterpreter.expressions.*;

public class Main {

    public static void main(String[] args) {

        Expression encender = new EncenderLuzExpression();
        Expression apagar = new ApagarLuzExpression();
        Expression abrir = new AbrirPuertaExpression();

        // ---------------- CASO 1 ----------------
        System.out.println("========== CASO 1 ==========");

        Context contexto1 = new Context(false, false);

        encender.interpret(contexto1);
        contexto1.mostrarEstado();

        // ---------------- CASO 2 ----------------
        System.out.println("\n========== CASO 2 ==========");

        Context contexto2 = new Context(false, false);

        Expression secuencia = new SecuenciaExpression(
                Arrays.asList(encender, abrir));

        secuencia.interpret(contexto2);

        contexto2.mostrarEstado();

        // ---------------- CASO 3 ----------------
        System.out.println("\n========== CASO 3 ==========");

        Context contexto3 = new Context(true, false);

        Expression condicion =
                new SiLuzEncendidaExpression(
                        abrir,
                        encender);

        condicion.interpret(contexto3);

        contexto3.mostrarEstado();

        // ---------------- CASO 4 ----------------
        System.out.println("\n========== CASO 4 ==========");

        Context contexto4 = new Context(false, false);

        condicion.interpret(contexto4);

        contexto4.mostrarEstado();

        // ---------------- CASO 5 ----------------
        System.out.println("\n========== CASO 5 ==========");

        Context contexto5 = new Context(false, false);

        Expression expresionFinal =
                new SecuenciaExpression(
                        Arrays.asList(

                                encender,

                                new SiLuzEncendidaExpression(

                                        new SecuenciaExpression(
                                                Arrays.asList(
                                                        abrir,

                                                        new SiLuzEncendidaExpression(
                                                                apagar,
                                                                abrir
                                                        )
                                                )
                                        ),

                                        encender
                                )

                        )
                );

        expresionFinal.interpret(contexto5);

        contexto5.mostrarEstado();

    }

}