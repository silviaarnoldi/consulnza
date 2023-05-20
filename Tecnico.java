package it.itispaleocapa.silviaarnoldi;
import java.time.LocalDate;
public class Tecnico extends Personale {
    String competenza;
    boolean internoEsterno;

    public Tecnico(String cod, String c, String n, int a, int o, String com, String i) {
        super(cod, c, n, a, o);
        this.competenza = com;
        this.internoEsterno = i.equalsIgnoreCase("interno");
    }

    @Override
    public int calcolaImp() {
        LocalDate data = LocalDate.now();
        int corr = data.getYear();
        int cont = corr - annoAss;
        cont-=1;
        if (competenza.equals("informatica-telecomunicazioni")) {
            if (internoEsterno==true) {
                return 40 * ore + cont;
            } else {
                return 40 * ore;
            }
        } else {
            if (internoEsterno==true) {
                return 50 * ore + cont;
            } else {
                return 50 * ore;
            }
        }
    }
}
