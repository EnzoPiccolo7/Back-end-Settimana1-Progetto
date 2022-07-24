package LettoreMultimediale;


import java.util.Scanner;

public class LettoreMenu {
private Video[] oggetti = new Video[5];
int count;
public LettoreMenu() {
	
}

public Video[] getOggetti() {
	return oggetti;
}

public void setOggetti(Video[] oggetti) {
	this.oggetti = oggetti;
}
public void creaoggetto(){
	if (count == 5) {
		seloggetto();
	} else {
		System.out.println("Avvio menu");
		System.out.println("Inserisci Titolo");
		Scanner Scan = new Scanner(System.in);
		String titolo = Scan.nextLine();
		System.out.println("Inserisci il Volume");
		Scanner Scan2 = new Scanner(System.in);
		int Vol = Scan2.nextInt();
		System.out.println("Inserisci la durata");
		Scanner Scan3 = new Scanner(System.in);
		int Dur = Scan3.nextInt();
		System.out.println("Inserisci la luminosità");
		Scanner Scan4 = new Scanner(System.in);
		int Lum = Scan4.nextInt();
		Video obj = new Video(titolo,Vol,Dur,Lum);
		oggetti[count] = obj;
		count++;
		creaoggetto();
	}
	
	
}
public void seloggetto() {
	for (Video video : oggetti) {
		;
	}
	System.out.println("1"+ oggetti[0].getTitolo());
	System.out.println("2"+ oggetti[1].getTitolo());
	System.out.println("3"+ oggetti[2].getTitolo());
	System.out.println("4"+ oggetti[3].getTitolo());
	System.out.println("5"+ oggetti[4].getTitolo());
	Scanner Scan5 = new Scanner(System.in);
	int SceltaTit = Scan5.nextInt();
	
	switch (SceltaTit) {
	case 1:{
		System.out.println(oggetti[0].getTitolo());
		break;}
case 2:{
	System.out.println(oggetti[1].getTitolo());
		break;}
case 3:{
	System.out.println(oggetti[3].getTitolo());
	break;}
case 4:{
	System.out.println(oggetti[4].getTitolo());
	break;}
case 5:{
	System.out.println(oggetti[4].getTitolo());
	break;}
case 0:{
	System.out.println("Programma dafault");
	break;}
		
	default:
		System.out.println("Bottone sbagliato");
		break;
	}
}

}
