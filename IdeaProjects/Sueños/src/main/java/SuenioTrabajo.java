public class SuenioTrabajo extends Suenio {

    private String unTrabajoNuevo;
    private int sueldoSuenio;

    public String getUnTrabajo() {
        return unTrabajoNuevo;
    }

    public int getSueldoFuturo() {
        return sueldoSuenio;
    }

    public void comparacionDeSueldo(Persona persona){
        if (persona.getSueldo()){
            (getSueldoFuturo() <= persona.getSueldo());
        }
    }

    @Override
    public void Sueniocumplido(Persona unNombre) {

    }
}
