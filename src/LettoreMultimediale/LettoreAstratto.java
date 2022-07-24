package LettoreMultimediale;

public abstract class LettoreAstratto {
	private String titolo; 
   
	public LettoreAstratto(String titolo) {
		this.titolo = titolo;
	}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}


}
