package Domain.Carcateristica;

import Domain.Carcateristica.Caracteristica;
import Domain.Invitado;

public class Gracioso extends Caracteristica {

    public void CalcularPuntuacion(Invitado invitado) {
        if (invitado.getEdad()>=50) {
            invitado.getDisfraz().sumarPuntaje(invitado.getDisfraz().getNivelDeGracia() * 3);
        }
        else {
            invitado.getDisfraz().sumarPuntaje(invitado.getDisfraz().getNivelDeGracia());
        }
    }
}
