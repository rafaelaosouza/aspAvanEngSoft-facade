package obra;

public class Concessionaria extends Orgao {

    private static Concessionaria concessionaria = new Concessionaria();

    private Concessionaria() {};

    public static Concessionaria getInstancia() {
        return concessionaria;
    }
}
