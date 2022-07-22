package program;

public class Pera implements Comparable<Pera>{
    private int grammi;
    private String tipo;

    public Pera(String tipo, int grammi){
        this.tipo = tipo;
        this.grammi = grammi;
    }

    public int compareTo(Pera p){
        return grammi - p.grammi;
    }
}