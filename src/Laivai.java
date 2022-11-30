import java.util.Scanner;
// -sukelti string simbolius pas->zaidejas naudojamus ekrane spausdinti laiovu simbolius

public class Laivai {
	Scanner sc;
	String zodis = " ";
	int laivSk = 0;
	int masIlg = 0;
	int[][] mas;
	int[][] atsMas;
	boolean arPataike;
	Laivas[] laivMas;
	Logika logika;
	Ekranas ekranas;
	MeniuPasirinkimai meniu;
	Zaidejas zaidejas;

	public Laivai(Scanner sc, String zodis, int laivSk) {
		this.sc = sc;
		this.zodis = zodis;
		this.laivSk = laivSk;
		masIlg = zodis.length();
		zaidejas = new Zaidejas();
		logika = new Logika();
		ekranas = new Ekranas();
		meniu = new MeniuPasirinkimai(sc);
		mas = new int[this.masIlg][this.masIlg];
		atsMas = new int[this.masIlg][this.masIlg];
		laivMas =  new Laivas[this.masIlg];
		arPataike = false;
	}

	public void pradeti() {
		this.ekranas.rodytiMeniu();
		loop : while(true) {
			int intPas = -1;
			String pasirikimas = this.meniu.getStringPasirinkimas();
			//ZAIDZIAM -> TIKRINAM SUVIUS
			if (pasirikimas.length() >= 2) {
				zaidziam(pasirikimas);	
			} else {
				//TIKRINAM MENIU
				intPas = Integer.parseInt(pasirikimas.substring(0,1));
				switch(intPas) {
				case 0:
					System.out.println("***ISEJOTE IS ZAIDIMO.***");
					break loop;
				case 1:
					System.out.println("***PRADEDAME NAUJA ZAIDIMA.***");
					pradetiZaidima();
					break;
				case 2:
					System.out.println("***ATIDENGIAMA LENTA:***");
					this.ekranas.spausdintiLenta(this.mas, "", "", "", this.zodis);
					System.out.println("***ZAIDIMAS BAIGTAS***");
					break loop;
				case 3:
					this.ekranas.spausdintiInstrukcija();
					break;
				default:
					System.out.println("Tokio pasirinkimo nera.");
					this.ekranas.rodytiMeniu();
					break;
				}
			}
		}
	}

	public void pradetiZaidima() {
		logika.uzpildytiPradMas(this.mas);
		logika.generuotiLaivus(2, this.laivSk , this.masIlg, this.laivMas, this.mas);
		logika.uzpildytiPradMas(this.atsMas);
		this.ekranas.spausdintiLenta(this.mas, this.zodis);
		this.ekranas.spausdintiLenta(this.atsMas, "-", "x", "0", this.zodis);
		//TESTAVIMUI GALIME ATSISPAUSDINTI VISUS LAIVUS
		/*System.out.println("Visi laivai:");
		for (Laivas laivas : laivMas) {
			System.out.println("x1="+laivas.getKordX1()+"y1="+laivas.getKordY1()
			+"x2="+laivas.getKordX2()+"y2="+laivas.getKordY2());
		}*/
		this.ekranas.rodytiKordIvedimoKlausima(zaidejas.nusLaivSk, this.laivSk);
	}

	public void zaidziam(String pasirikimas) {
		this.arPataike = logika.tikrintiSuvi(pasirikimas, this.zodis, zaidejas, 
				this.laivSk , this.masIlg, this.laivMas, this.mas, this.atsMas);
		this.ekranas.spausdintiLenta(atsMas, "-", "x", "0", this.zodis);
		if (this.arPataike) {//ar visus laivus nuskandino
			if (this.laivSk == zaidejas.nusLaivSk)
				laimejo();
			else
				this.ekranas.rodytiKordIvedimoKlausima(zaidejas.nusLaivSk, this.laivSk);
		}
		else {
			this.ekranas.rodytiKordIvedimoKlausima(zaidejas.nusLaivSk, this.laivSk);
		}
	}

	public void laimejo() {
		this.ekranas.spausdintiLenta(atsMas, "-", "x", "0", this.zodis);
		System.out.println("***ATIDENGIAMA PIRMINE LENTA:***");
		this.ekranas.spausdintiLenta(this.mas, this.zodis);
		System.out.println("!Sveikiname laimejus zaidima!");
		System.out.println("Padarete is viso:" + zaidejas.suvSk + " suviu.");
	}

}
