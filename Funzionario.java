package it.itispaleocapa.silviaarnoldi;
import java.time.LocalDate;
public class Funzionario extends Personale {
    public Funzionario(String cod, String c, String n, int a, int o) {
        super(cod, c, n, a, o);
    }

    @Override
    public int calcolaImp() {
        LocalDate data = LocalDate.now();
        int corr = data.getYear();
        int cont = corr - annoAss;
        if (cont < 10) {
            return ore * 70;
        } else {
            return ore * 80;
        }
    }
}
