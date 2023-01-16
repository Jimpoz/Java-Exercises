package Ospedale;

public class PersonaVisitata extends Persona {
    private int cod;
    private String nome_reparto;

    PersonaVisitata(int cod, String nome_reparto, String cf) {
        super(cf);
        this.cod = cod;
        this.nome_reparto = nome_reparto;
    }

    void set_cod(int cod) {
        this.cod = cod;
    }

    void set_nome_reparto(String nome_reparto) {
        this.nome_reparto = nome_reparto;
    }

    int get_cod() {
        return this.cod;
    }

    String get_nome_reparto() {
        return this.nome_reparto;
    }

}
