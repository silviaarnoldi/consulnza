package it.itispaleocapa.silviaarnoldi;
public class Dirigente extends Personale {
    public Dirigente(String cod, String c, String n, int a, int o) {
        super(cod, c, n, a, o);
    }

    @Override
    public int calcolaImp() {
        return ore * 100;
    }
}
