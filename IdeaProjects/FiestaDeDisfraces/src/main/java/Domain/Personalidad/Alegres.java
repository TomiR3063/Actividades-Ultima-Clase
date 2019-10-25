package Domain.Personalidad;

import Domain.Invitado;
import Domain.Personalidad.Personalidad;

public class Alegres implements Personalidad {
    @Override
    public boolean esElInvitadoSexy(Invitado invitado) {
        return false;
    }
}
