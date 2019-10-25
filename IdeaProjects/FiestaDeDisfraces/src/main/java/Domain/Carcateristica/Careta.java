package Domain.Carcateristica;

import Domain.Invitado;
import Domain.Personaje;

public class Careta extends Caracteristica {

    private Personaje personaje;

    public void CalcularPuntuacion(Invitado invitado) {
        invitado.getDisfraz().sumarPuntaje(personaje.getPuntos());
    }
}
