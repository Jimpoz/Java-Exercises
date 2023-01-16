package Ospedale;

import java.util.*;
import java.lang.*;

public class RepartoEmergenze implements Reparto {

    @Override
    public String get_reparto(PersonaVisitata pv) {
        return pv.get_nome_reparto();
    }

    @Override
    public PersonaVisitata visita(Persona p) {
        return (PersonaVisitata) p;
    }

    @Override
    public PersonaVisitata visita(PersonaVisitata pv) {
        // effettua un visita boh noccapito
        if (pv.get_cod() > 100) {
            return visita((Persona) pv);
        } else
            return pv;
    }

}
