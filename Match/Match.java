package Match;

public abstract class Match {
    private final String nome1, nome2;

    Match(String nome1, String nome2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
    }

    String get_nome1() {
        return this.nome1;
    }

    String get_nome2() {
        return this.nome2;
    }

    abstract String winner();

}
