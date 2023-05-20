package it.itispaleocapa.silviaarnoldi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private Progetto progetto;
   @BeforeEach
    public void setUp() {
        progetto = new Progetto();
        Dirigente d1 = new Dirigente("d1", "Rossi", "Mario", 2001, 9);
        Funzionario f1 = new Funzionario("f1", "Bianchi", "Pietro", 2017, 9);
        Funzionario f2 = new Funzionario("f2", "Garibaldi", "Giuseppe", 2007, 9);
        Tecnico t1 = new Tecnico("t1", "Ferrari", "Massimo", 2008, 9, "informatica-telecomunicazioni", "interno");
        Tecnico t2 = new Tecnico("t2", "Orsini", "Luigi", 2008, 9, "elettronica-automazione", "esterno");
        progetto.aggiungiMembro(d1);
        progetto.aggiungiMembro(f1);
        progetto.aggiungiMembro(f2);
        progetto.aggiungiMembro(t1);
        progetto.aggiungiMembro(t2);
    }

    @Test
    void testAggiungiMembro() {
        Tecnico t = new Tecnico("t3", "Belli", "Roberto", 2008, 9, "elettronica-automazione", "esterno");
        progetto.aggiungiMembro(t);
        assertEquals(6, progetto.membri.size());
    }

    @Test
    void testRimuoviMembro() {
        progetto.rimuoviMembro(progetto.membri.getLast());
        assertEquals(4, progetto.membri.size());
    }
    
    @Test
    void testModificaOre() throws NullMembroException  {
            int nuoveOre=8;
            progetto.modificaOre(progetto.membri.get(1), nuoveOre);
            assertEquals(nuoveOre, progetto.membri.get(1).ore);
        
    }

    @Test
    void testCostoComplessivo() {
        int somma=(progetto.membri.get(0).ore*100)+(progetto.membri.get(1).ore*70)+(progetto.membri.get(2).ore*80)+(progetto.membri.get(3).ore*40+14)+(progetto.membri.get(4).ore*50);
        assertEquals(somma, progetto.costoComplessivo());
    }
}