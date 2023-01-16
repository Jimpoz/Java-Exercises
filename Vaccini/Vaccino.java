package Vaccini;

public class Vaccino {
    protected TipoVaccino tipoVaccino;
    protected int identificatore;

    Vaccino(int n, TipoVaccino t) {
        this.tipoVaccino = t;
        this.identificatore = n;
    }

    public TipoVaccino getTipoVaccino() {
        return this.tipoVaccino;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof TipoVaccino) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        Integer i = this.identificatore;
        return 31 * ((i != null) ? i.hashCode() : 1) + ((this.tipoVaccino != null) ? this.tipoVaccino.hashCode() : 1);
    }

}