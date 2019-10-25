package Domain;

import Domain.EstaConformeConElDisfraz.Conformidad;
import Domain.Personalidad.Personalidad;

import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private Disfraz disfraz;
    private int edad;
    private Personalidad personalidad;
    private int puntuacionDeSatisfaccion;
    private FiestaDeDisfraces fiestaDeDisfraces;
    private LocalDate fechaDeCompra;
    private Conformidad conformidad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Personalidad getPersonalidad() {
        return personalidad;
    }

    public int getPuntuacionDeSatisfaccion() {
        return puntuacionDeSatisfaccion;
    }

    public Disfraz getDisfraz() {
        return disfraz;
    }

    public FiestaDeDisfraces getFiestaDeDisfraces() {
        return fiestaDeDisfraces;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setPuntuacion(int puntuacion){
        this.disfraz.setPuntuacion(puntuacion);
    }

    public boolean soySexy(){
        return this.personalidad.esElInvitadoSexy(this);
    }

    public boolean estaConforme(){
        return this.conformidad.estaConforme(this);
    }

    public Invitado(String unNombre, int unaEdad, Personalidad unaPersonalidad, int unaPuntuacionDeSatisfaccion, LocalDate unaFechaDeCompra, Conformidad conformidad){
        this.nombre=unNombre;
        this.edad=unaEdad;
        this.personalidad=unaPersonalidad;
        this.puntuacionDeSatisfaccion=unaPuntuacionDeSatisfaccion;
        this.fechaDeCompra=unaFechaDeCompra;
        this.conformidad=conformidad;
    }
}
