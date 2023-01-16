package AlleanzeNazioni;

import java.util.*;

public class UnioneDiNazioni {

    Collection<Nazione> unione;

    UnioneDiNazioni() {
        this.unione = new ArrayList<>();
    }

    boolean remove(Nazione n) {
        if (unione.contains(n)) {
            unione.remove(n);
            return true;
        } else
            return false;
    }
}