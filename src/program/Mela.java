package program;



public class Mela implements Comparable<Mela> {
 private int grammi;
 private String tipo;
 
 public Mela(String tipo, int grammi) {
	 this.tipo = tipo;
	 this.grammi = grammi;
 }
  public int compareTo(Mela m) {
	  return grammi - m.grammi;


}
}	

