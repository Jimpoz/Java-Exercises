package Vaccini;

import java.util.*;

public class TipoVaccino {
    String nome;
    int dosi;
    static Map<String, Integer> vacciniEsistenti = new HashMap<>();

    TipoVaccino(String s, int n) {
        this.nome = s;
        this.dosi = n;
    }

    protected String getNome() {
        return this.nome;
    }

    protected int getDosi() {
        return this.dosi;
    }

    public static void registra(String nome, int dosi) {
        if (!vacciniEsistenti.containsKey(nome)) {
            vacciniEsistenti.put(nome, dosi);
        }
    }

    public static TipoVaccino trova(String nome) {
        if (vacciniEsistenti.containsKey(nome)) {
            TipoVaccino t = new TipoVaccino(nome, vacciniEsistenti.get(nome)); // get(nome) perché ritorna il valore che
                                                                               // si trova nella posizione di quella key
            return t;
        } else
            return null;
    }
}
