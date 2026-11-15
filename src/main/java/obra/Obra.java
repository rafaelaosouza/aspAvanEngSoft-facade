package obra;

public class Obra {

    public boolean liberarHabiteSe() {
        return ObraFacade.verificarPendenciasHabiteSe(this);
    }
}
