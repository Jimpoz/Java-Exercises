package AlleanzeNazioni;

public interface NazioneAmicaInterfaccia extends Nazione {

    @Override
    default boolean amica() {
        return true;
    }

}