package Ospedale;

import java.util.*;

public interface Reparto {

    String get_reparto(PersonaVisitata pv);

    PersonaVisitata visita(Persona p);

    PersonaVisitata visita(PersonaVisitata pv);

}
