import java.util.List;

public class Persona {

    private String unNombre;
    private int unaEdad;
    private List<String> carrerasQueQuiereEstudiar;
    private List<String> carrerasTerminadas;
    private int unosHijos;
    private int sueldoDeseado;
    private double felicidonios;
    private String trabjoActual;
    private int sueldo;


    public Persona(String unNombre, int unaEdad) {
        this.unNombre = unNombre;
        this.unaEdad = unaEdad;
        unosHijos = 0;
    }

    public String getUnNombre() {
        return unNombre;
    }

    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    public int getUnaEdad() {
        return unaEdad;
    }

    public int getUnosHijos() {
        return unosHijos;
    }

    public List<String> getCarrerasQueQuiereEstudiar() {
        return carrerasQueQuiereEstudiar;
    }

    public List<String> getCarrerasTerminadas() {
        return carrerasTerminadas;
    }

    public double getFelicidonios() {
        return felicidonios;
    }

    public String getTrabjoActual() {
        return trabjoActual;
    }

    public int getSueldo() {
        return sueldo;
    }

    public double felicidad(){
       return this.getFelicidonios() +1;
    }

}
