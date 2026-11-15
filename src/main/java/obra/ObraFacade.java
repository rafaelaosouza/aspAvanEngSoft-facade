package obra;

public class ObraFacade {

    public static boolean verificarPendenciasHabiteSe(Obra obra) {
        if (Prefeitura.getInstancia().verificarObraComPendencia(obra)) {
            return false;
        }
        if (CorpoBombeiros.getInstancia().verificarObraComPendencia(obra)) {
            return false;
        }
        if (Concessionaria.getInstancia().verificarObraComPendencia(obra)) {
            return false;
        }
        return true;
    }
}
