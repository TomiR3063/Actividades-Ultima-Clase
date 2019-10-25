package Domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class FiestaDeDisfraces {

    private String lugar;
    private LocalDate fecha;
    private List<Invitado> invitados;

    public String getLugar() {
        return lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public List<Invitado> getInvitados() {
        return invitados;
    }

    public FiestaDeDisfraces(String unLugar, LocalDate unaFecha, List<Invitado> unosInvitados){
        this.lugar=unLugar;
        this.fecha=unaFecha;
        this.invitados=unosInvitados;
    }
}
