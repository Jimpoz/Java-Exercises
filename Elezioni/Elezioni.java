package Elezioni;

import java.util.*;

public class Elezioni {
    private int p_diritto_voto;
    Map<String, Integer> partiti;

    Elezioni(int p_diritto_voto) {
        this.p_diritto_voto = p_diritto_voto;
        partiti = new HashMap<>();
    }

    void add_partito(String nome, int voti) throws PartitoException {
        if (partiti.containsKey(nome)) {
            throw new PartitoException("Partito già inserito");
        } else {
            partiti.put(nome, voti);
        }
    }

    int getAffluenza(String nome) {
        return (this.partiti.get(nome) / this.p_diritto_voto) * 100;
    }

}
