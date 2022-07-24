package LettoreMultimediale;

public class Audio extends LettoreAstratto implements Volume  {
	private int	Durata;
	private int Volume;
		
	public Audio(String titolo,int Durata, int Volume) {
		super(titolo);
		this.Durata = Durata;
		this.Volume = Volume;
	}


	public int getDurata() {
		return Durata;
	}
	public void setDurata(int durata) {
		Durata = durata;
	}

	public int getVolume() {
		return Volume;
	}


	public void setVolume(int volume) {
		Volume = volume;
	}


	@Override
	public void AlzaVolume() {
		Volume++;
		String Vol = "";
		for(int i = 0; i < this.Volume; i++) {
			Vol += "!";
		}
		System.out.println(Vol);
	}

	@Override
	public void AbbassaVolume() {
		Volume--;
		String Vol = "";
		for(int i = 0; i < this.Volume; i++) {
			Vol += "!";
		}
		System.out.println(Vol);
	}

	
	
}
