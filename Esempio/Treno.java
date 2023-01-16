package Esempio;

import java.util.*;

public class Treno {
    protected int numero;

    protected Map<String, Date> orari_fermate;
    protected Collection<String> classi;

    Treno(int numero) {
        this.numero = numero;
        this.orari_fermate = new HashMap<>();
    }

    void aggiungi_fermata(String fermata, Date orario) {
        this.orari_fermate.put(fermata, orario);
    }

    Date getTime(String stazione) {
        for (Map.Entry<String, Date> entry : orari_fermate.entrySet()) {
            if (entry.getKey() == stazione) {
                return entry.getValue();
            }
        }
        return null;
    }

    int getTrainNumber() {
        return this.numero;
    }

}