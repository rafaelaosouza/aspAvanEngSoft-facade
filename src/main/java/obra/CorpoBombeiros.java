package obra;

public class CorpoBombeiros extends Orgao {

    private static CorpoBombeiros corpoBombeiros = new CorpoBombeiros();

    private CorpoBombeiros() {};

    public static CorpoBombeiros getInstancia() {
        return corpoBombeiros;
    }
}
