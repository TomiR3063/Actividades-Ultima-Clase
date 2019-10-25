package Domain.Carcateristica;

import Domain.Invitado;

public class Sexie extends Caracteristica{
    @Override
    public void CalcularPuntuacion(Invitado invitado) {
        if (invitado.soySexy()){
            invitado.getDisfraz().sumarPuntaje(15);
        }
        else {
            invitado.getDisfraz().sumarPuntaje(2);
        }
    }
}
