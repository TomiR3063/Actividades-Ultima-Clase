package Domain.EstaConformeConElDisfraz;

import Domain.Invitado;

public class Caprichoso implements Conformidad {
    @Override
    public boolean estaConforme(Invitado invitado) {
        return invitado.getDisfraz().getPuntuacion()>10 && invitado.getDisfraz().getNombre().length()%2==0;
    }
}
