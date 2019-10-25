package Domain.Personalidad;

import Domain.Invitado;
import Domain.Personalidad.Personalidad;

public class Taciturnas implements Personalidad {
    @Override
    public boolean esElInvitadoSexy(Invitado invitado) {
        return invitado.getEdad()<30;
    }
}
