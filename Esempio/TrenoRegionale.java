package Esempio;

import java.util.*;

public class TrenoRegionale extends Treno {

    TrenoRegionale(int numero) {
        super(numero);
        this.classi = new ArrayList<String>() {
            {
                add("Seconda classe");
                add("Prima classe");
            }
        };
        // TODO Auto-generated constructor stub
    }
}