package Esempio;

public class Biglietto {
    private boolean valido;
    private String classe;
    private int numeroIdentificativo;

    Biglietto(boolean validato, String nome, int num) {
        this.valido = validato;
        this.classe = nome;
        this.numeroIdentificativo = num;
    }

    public boolean controllo(FrecciaRossa train) throws BigliettoException {
        boolean flag = false;
        if (this.valido == false) {
            throw new BigliettoException("Il biglietto non è stato validato");
        }

        if (train.numero == this.numeroIdentificativo) {
            for (String s : train.classi) {
                if (s == this.classe) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean controllo(TrenoRegionale train) throws BigliettoException {
        boolean flag = false;
        if (this.valido == false) {
            throw new BigliettoException("Il biglietto non è stato validato");
        }

        for (String s : train.classi) {
            if (s == this.classe) {
                flag = true;
            }
        }
        return flag;
    }

}
