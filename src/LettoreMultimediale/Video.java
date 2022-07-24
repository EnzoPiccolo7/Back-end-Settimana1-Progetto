package LettoreMultimediale;

public class Video extends LettoreAstratto implements Volume,Luminosità{
	private int volume;
	private int durata;
	private int luminosita;
	public Video(String titolo, int volume, int durata, int luminosita) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
		this.luminosita = luminosita;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
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

	@Override
	public void AlzaVolume() {
		volume++;
		String Vol = "";
		for(int i = 0; i < this.volume; i++) {
			Vol += "V+";
		}
		System.out.println(Vol);
	}

	@Override
	public void AbbassaVolume() {
		volume--;
		String Vol = "";
		for(int i = 0; i < this.volume; i++) {
			Vol += "V-";
		}
		System.out.println(Vol);
	}

  
}
