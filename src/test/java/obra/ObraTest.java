package obra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObraTest {

    @Test
    void deveRetornarPendenciaPrefeituraHabiteSe() {
        Obra obra = new Obra();
        Prefeitura.getInstancia().addObraPendente(obra);

        assertEquals(false, obra.liberarHabiteSe());
    }

    @Test
    void deveRetornarPendenciaCorpoBombeirosHabiteSe() {
        Obra obra = new Obra();
        CorpoBombeiros.getInstancia().addObraPendente(obra);

        assertEquals(false, obra.liberarHabiteSe());
    }

    @Test
    void deveRetornarPendenciaConcessionariaHabiteSe() {
        Obra obra = new Obra();
        Concessionaria.getInstancia().addObraPendente(obra);

        assertEquals(false, obra.liberarHabiteSe());
    }

    @Test
    void deveRetornarObraSemPendenciaHabiteSe() {
        Obra obra = new Obra();

        assertEquals(true, obra.liberarHabiteSe());
    }

    @Test
    void deveRetornarPendenciaEmMaisDeUmOrgaoHabiteSe() {
        Obra obra = new Obra();
        Prefeitura.getInstancia().addObraPendente(obra);
        Concessionaria.getInstancia().addObraPendente(obra);

        assertEquals(false, obra.liberarHabiteSe());
    }

    @Test
    void deveLiberarObraQuandoPendenciaEhDeOutraObra() {
        Obra obraPendente = new Obra();
        Obra obraRegular = new Obra();
        CorpoBombeiros.getInstancia().addObraPendente(obraPendente);

        assertEquals(true, obraRegular.liberarHabiteSe());
    }

}
