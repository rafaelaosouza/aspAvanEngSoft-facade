package obra;

import java.util.ArrayList;
import java.util.List;

public abstract class Orgao {

    private List<Obra> obrasComPendencia = new ArrayList<Obra>();

    public void addObraPendente(Obra obra) {
        this.obrasComPendencia.add(obra);
    }

    public boolean verificarObraComPendencia(Obra obra) {
        return this.obrasComPendencia.contains(obra);
    }

}
