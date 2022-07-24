package LettoreMultimediale;

public class Immagine extends LettoreAstratto implements Luminosità {
 private int luminosita;

public Immagine(String titolo, int luminosita) {
	super(titolo);
	this.luminosita = luminosita;
}

public int getLuminosita() {
	return luminosita;
}

public void setLuminosita(int luminosita) {
	this.luminosita = luminosita;
}

@Override
public void AlazaLuminosità() {
	luminosita++;
	String lum = "";
	for(int i = 0; i < this.luminosita; i++) {
		lum += "L+";
	}
	System.out.println(lum);
}

	

@Override
public void AbbassaLuminosità() {
	luminosita--;
	String lum = "";
	for(int i = 0; i < this.luminosita; i++) {
		lum += "L-";
	}
	System.out.println(lum);
}
 
}
