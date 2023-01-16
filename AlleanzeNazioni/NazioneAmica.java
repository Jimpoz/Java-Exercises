package AlleanzeNazioni;

public class NazioneAmica implements NazioneAmicaInterfaccia {

    private final String nome;

    NazioneAmica(String nome) {
        this.nome = nome;
    }

    @Override
    public String get_nome() {
        return this.nome;
    }

}