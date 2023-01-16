package Vaccini;

import java.util.*;

public class PersonaVaccinata {
    private Collection<Vaccino> vaccini;

    PersonaVaccinata() {
        this.vaccini = new ArrayList<>();
    }

    void vaccina(Vaccino v) throws VaccinoGiaEffettuatoException {
        for (Vaccino va : vaccini) {
            // boh
            return;
        }
    }

}
