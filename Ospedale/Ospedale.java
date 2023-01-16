package Ospedale;

import java.util.*;

public class Ospedale {
    private Collection<Reparto> reparti;

    Ospedale() {
        this.reparti = new ArrayList<>();
    }

    void add_reparto(Reparto r) {
        reparti.add(r);
    }

    boolean controllo(PersonaVisitata pv) {

        for (Reparto re : reparti) {
            if (pv.get_nome_reparto() == re.get_reparto(pv)) {
                return true;
            }
        }
        return false;

    }

}
