package Domain.EstaConformeConElDisfraz;

import Domain.Invitado;

import java.time.Duration;
import java.time.LocalDate;

public class Pretencioso implements Conformidad {
    @Override
    public boolean estaConforme(Invitado invitado) {
        return invitado.getDisfraz().getPuntuacion()>10 && calcularDiasDeDiferenciaDeFabricacion(invitado)<30;
    }
    public long calcularDiasDeDiferenciaDeFabricacion(Invitado invitado){
        return Duration.between(
                invitado.getDisfraz().getFechaDeFabricacion(),
                LocalDate.now()
        ).toDays();
    }
}
