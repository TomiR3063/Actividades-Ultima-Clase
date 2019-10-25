package Domain.Carcateristica;

import Domain.Invitado;

import java.time.Duration;
import java.util.Date;

public class tobara extends Caracteristica{

    public void CalcularPuntuacion(Invitado invitado) {
        if (this.calcularDiasDeDiferencia(invitado) >= 2) {
            invitado.getDisfraz().sumarPuntaje(5);
        }
        else{
            invitado.getDisfraz().sumarPuntaje(3);
        }
    }
    public long calcularDiasDeDiferencia(Invitado invitado){
        return Duration.between(
                invitado.getFechaDeCompra(),
                invitado.getFiestaDeDisfraces().getFecha()
        ).toDays();
    }
}
