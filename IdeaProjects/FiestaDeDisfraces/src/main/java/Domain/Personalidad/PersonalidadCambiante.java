package Domain.Personalidad;

import Domain.Invitado;
import Domain.Personalidad.Personalidad;

public class PersonalidadCambiante implements Personalidad {
    private Personalidad personalidad;
    @Override
    public boolean esElInvitadoSexy(Invitado invitado) {
        return this.personalidad.esElInvitadoSexy(invitado);
    }
}
