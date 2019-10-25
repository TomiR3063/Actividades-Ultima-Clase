package Domain.EstaConformeConElDisfraz;

import Domain.Invitado;

public class Normal implements Conformidad {
    @Override
    public boolean estaConforme(Invitado invitado) {
        return invitado.getDisfraz().getPuntuacion()>10 ;
    }
}
