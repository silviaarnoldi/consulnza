package it.itispaleocapa.silviaarnoldi;
public abstract class Personale {
    String codice;
    String cognome;
    String nome;
    int annoAss;
    int ore;

    public Personale(String cod, String c, String n, int a, int o) {
        this.codice = cod;
        this.cognome = c;
        this.nome = n;
        this.annoAss = a;
        this.ore = o;
    }

    public abstract int calcolaImp();

    public void setOre(int o) {
        this.ore = o;
    }
}