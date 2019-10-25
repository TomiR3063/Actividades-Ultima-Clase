public class SuenioFormacion extends Suenio {

    private String unaCarrera;


    public String getUnaCarrera() {
        return unaCarrera;
    }

    public boolean recibirse(Persona persona){
        return getUnaCarrera() .contains((CharSequence) persona.getCarrerasQueQuiereEstudiar()); }

    public boolean carrerasQuePuedeEstudiar (Persona persona, String carrera){
        return persona.getCarrerasTerminadas().stream().anyMatch(c -> c == carrera);
    }


    @Override
    public void Sueniocumplido(Persona unNombre) {
        unNombre.felicidad();

    }
}
/*
List<Zona> misZonas = zonasOperacionesCerradas();
		List<Zona> zonasDelOtro = otroEmpleado.zonasOperacionesCerradas
		return misZonas.stream().anymatch(z --> zonasDelOtro.contains(z));
 */