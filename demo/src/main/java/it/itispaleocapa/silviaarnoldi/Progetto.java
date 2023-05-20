package it.itispaleocapa.silviaarnoldi;
import java.util.*;
public class Progetto {
    public LinkedList<Personale> membri;

    public Progetto() {
        membri = new LinkedList<>();
    }

    public void aggiungiMembro(Personale membro) {
        membri.add(membro);
    }

    public void rimuoviMembro(Personale membro) {
        membri.remove(membro);
    }

    public void modificaOre(Personale membro, int nuoveOre)  throws NullMembroException {
        if (membri.contains(membro)) {
            membro.setOre(nuoveOre);
        }else{
            throw new NullMembroException();
        }
    }

    public int costoComplessivo() {
        int costoComplessivo = 0;
        for (Personale membro : membri) {
            costoComplessivo += membro.calcolaImp();
        }
        return costoComplessivo;
    }
}
