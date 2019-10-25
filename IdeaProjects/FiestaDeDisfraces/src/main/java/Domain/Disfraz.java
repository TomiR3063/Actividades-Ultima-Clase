package Domain;

import Domain.Carcateristica.Caracteristica;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Disfraz {

    private String nombre;
    private int puntuacion;
    private LocalDate fechaDeFabricacion;
    private int nivelDeGracia;
    private List<Caracteristica> caracteristicas;

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public LocalDate getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public int getNivelDeGracia() {
        return nivelDeGracia;
    }

    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }

    public void  sumarPuntaje(int puntaje){
        this.puntuacion+=puntaje;
    }

    public Disfraz(String unNombre, LocalDate unaFechaDeFabriacion, int unNivelDeGracia, List<Caracteristica> unasCaracteristicas){
        this.nombre=unNombre;
        this.puntuacion=0;
        this.fechaDeFabricacion=unaFechaDeFabriacion;
        this.nivelDeGracia=unNivelDeGracia;
        this.caracteristicas=unasCaracteristicas;
    }
}
