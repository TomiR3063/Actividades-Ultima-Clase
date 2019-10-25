package Domain.EstaConformeConElDisfraz;

import Domain.Invitado;

public class Numerlogo implements Conformidad {
    private int puntuacion;

    public Numerlogo(int unaPuntuacion){
        this.puntuacion=unaPuntuacion;
    }
    @Override
    public boolean estaConforme(Invitado invitado) {
        return invitado.getDisfraz().getPuntuacion()>10 && invitado.getDisfraz().getPuntuacion()==puntuacion;
    }
}
