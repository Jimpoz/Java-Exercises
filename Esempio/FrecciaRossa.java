package Esempio;

import java.util.ArrayList;

public class FrecciaRossa extends Treno {

    FrecciaRossa(int numero) {
        super(numero);
        this.classi = new ArrayList<String>() {
            {
                add("Standard");
                add("Premium");
                add("Business");
                add("Executive");
            }
        };
    }
}
