
package tallerinterpreter.context;

public class Context {

    private boolean luzEncendida;
    private boolean puertaAbierta;

    public Context(boolean luzEncendida, boolean puertaAbierta) {
        this.luzEncendida = luzEncendida;
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isLuzEncendida() {
        return luzEncendida;
    }

    public void setLuzEncendida(boolean luzEncendida) {
        this.luzEncendida = luzEncendida;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void mostrarEstado() {
        System.out.println("Estado -> Luz: "
                + (luzEncendida ? "ENCENDIDA" : "APAGADA")
                + " | Puerta: "
                + (puertaAbierta ? "ABIERTA" : "CERRADA"));
    }
}
