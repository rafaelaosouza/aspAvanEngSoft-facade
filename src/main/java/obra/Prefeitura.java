package obra;

public class Prefeitura extends Orgao {

    private static Prefeitura prefeitura = new Prefeitura();

    private Prefeitura() {};

    public static Prefeitura getInstancia() {
        return prefeitura;
    }
}
