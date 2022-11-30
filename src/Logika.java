import java.util.HashSet;
import java.util.Random;

public class Logika {

	// return mas ir laivMas
	public void generuotiLaivus(int laivoIlg, int laivSk, int masIlg, Laivas[] laivMas, int[][] mas) {
		Random rand = new Random();
		//generuoti x1y1
		int sugLaivSk = 0;
		while (sugLaivSk < laivSk) {
			int sugLaivLangSk = 0;
			boolean arSugX = false;
			boolean arSugY = false;
			Laivas laivas = new Laivas(laivoIlg);
			while (!arSugX) {
				int genX = rand.nextInt(masIlg);
				if (checkX1(genX, laivMas)) { //jei x yra
					loop1: while (!arSugY) {
						int genY = rand.nextInt(masIlg);
						if (checkY1(genX, genY, laivMas)) // jei y yra
							continue loop1;
						else
							laivas.setKordX(genX, 0);
						laivas.setKordY(genY, 0);
						laivas.setPoz(genX, genY, masIlg);
						arSugX = true;
						arSugY = true;
					}
				}
				else {// jei x nera
					int genY = rand.nextInt(masIlg);
					laivas.setKordX(genX, 0);
					laivas.setKordY(genY, 0);
					laivas.setPoz(genX, genY, masIlg);
					arSugX = true;
					arSugY = true;
				}
			}
			if (arSugX && arSugY) {
				laivMas[sugLaivSk] = laivas;
				sugLaivSk++;	
			}
			//TEST SU 1 VNT.
			//sugLaivSk = 1;
			mas[laivas.getKordY(0)][laivas.getKordX(0)] = 1;
			sugLaivLangSk++;
			while (sugLaivLangSk < laivoIlg) {
				// generuoti x2y2
				int x1 = laivas.getKordX(0);
				int y1 = laivas.getKordY(0);
				Kordinates kord = new Kordinates();
				boolean arSug = false;
				int kiekGalSalia = laivas.getSaliaGalSk();
				HashSet<String> pasikHash = new HashSet<String>();
				pasikHash.clear();
				//Spaudina sugeneruoto laivo is vieno elemento kordinates
				//System.out.println("LAIVO Nr." + sugLaivSk +" X1="+x1+" Y1="+y1);
				while (arSug == false) {
					int gen;
					gen = (rand.nextInt(4) + 1);
					//System.out.println("gen="+gen);
					int newX = 0;
					int newY = 0;
					//C
					if ((x1 > 0) && (x1 < masIlg-1) && (y1 > 0) && (y1 < masIlg-1)) {
						newX = kord.getXC(gen);
						newY = kord.getYC(gen);
						//System.out.println("cc");
					}
					//VK
					if ((x1 == 0) && (y1 == 0)) {
						newX = kord.getXVK(gen);
						newY = kord.getYVK(gen);
						//System.out.println("vk");
					}
					//VC
					if ((x1 > 0) && (x1 < masIlg-1) && (y1 == 0)) {
						newX = kord.getXVC(gen);
						newY = kord.getYVC(gen);
						//System.out.println("vc");
					}
					//VD
					if ((x1 == masIlg-1) && (y1 == 0)) {
						newX = kord.getXVD(gen);
						newY = kord.getYVD(gen);
						//System.out.println("vd");
					}
					//CD
					if ((x1 == masIlg-1) && (y1 > 0) && (y1 < masIlg-1)) {
						newX = kord.getXCD(gen);
						newY = kord.getYCD(gen);
						//System.out.println("cd");
					}
					//AD
					if ((x1 == masIlg-1) && (y1 == masIlg-1)) {
						newX = kord.getXAD(gen);
						newY = kord.getYAD(gen);
						//System.out.println("ad");
					}
					//AC
					if ((x1 > 0) && (x1 < masIlg-1) && (y1 == masIlg-1)) {
						newX = kord.getXAC(gen);
						newY = kord.getYAC(gen);
						//System.out.println("ac");
					}
					//AK
					if ((x1 == 0) && (y1 == masIlg-1)) {
						newX = kord.getXAK(gen);
						newY = kord.getYAK(gen);
						//System.out.println("ak");
					}
					//CK
					if ((x1 == 0) && (y1 > 0) && (y1 < masIlg-1)) {
						newX = kord.getXCK(gen);
						newY = kord.getYCK(gen);
						//System.out.println("ck");
					}
					newX += x1; // newX buvo delta, dabar priskiriam kaip naujas kord
					newY += y1;

					//priskiriam x ir y jei salia esantis sugeneruotas langelis yra tuscias
					if (mas[newY][newX] == 0) {
						laivas.setKordX(newX, 1);
						laivas.setKordY(newY, 1);
						mas[newY][newX] = 1;
						arSug = true;
						//Tikrinimui PRINT i ekrana
						//System.out.println("Salia tuscia: x2="+newX+" y2="+newY);
						//System.out.println();
					} else {	
						if (pasikHash.size() == kiekGalSalia){//ar pilnas pasikHash, jei taip, tuomet salia visi langeliai yra uzimti, 
							laivas = null; // istriname sukurta laiva, kad ji is naujo sugeneruotu.
							sugLaivSk--;
							arSug = true;
							//Tikrinimui PRINT i ekrana
							//System.out.println("Pilnas hash. x2="+newX+" y2="+newY);
							//System.out.println("Hash size: "+pasikHash.size()+" Hash: "+pasikHash);
							//System.out.println();
						}
						else {//pildom PasikhashSet
							String kordEilute = ""+newX+""+newY;
							if (!pasikHash.contains(kordEilute)) {
								pasikHash.add(kordEilute);
							}
							//Tikrinimui PRINT i ekrana
							//System.out.println("Hash size: "+pasikHash.size()+" Hash: "+pasikHash);
						}
					}	
				}
				sugLaivLangSk++;
			}
		}
	}

	private boolean checkX1(int skX, Laivas[] laivMas) {
		boolean arYraX1 = false;
		for (Laivas elem : laivMas) {
			if (elem != null)
				if (elem.getKordX(0) == skX)
					arYraX1 = true;
		}
		return arYraX1;
	}

	private boolean checkY1(int skX, int skY, Laivas[] laivMas) {
		boolean arYraY1 = false;
		for (Laivas elem : laivMas) {
			if (elem != null)
				if ((elem.getKordX(0) == skX) && (elem.getKordY(0) == skY))
					arYraY1 = true;
		}
		return arYraY1;
	}

	public boolean tikrintiSuvi(String suvioKord, String zodis, Zaidejas zaidejas, 
			int laivSk, int masIlg, Laivas[] laivMas, int[][] mas, int[][] atsMas) {
		boolean arPataike = false;
		if (zodis.contains(suvioKord.substring(0,1).toUpperCase())) {
			int suvX = zodis.indexOf(suvioKord.substring(0,1).toUpperCase());
			int suvY = Integer.parseInt(suvioKord.substring(1)) - 1;
			//Tikrinimui PRINT i ekrana
			//System.out.println("Suvio x=" + suvX + " Suvio y=" + SuvY);
			if (mas[suvY][suvX] == 1) {//pataike
				mas[suvY][suvX] = 2;
				atsMas[suvY][suvX] = 2;
				System.out.println("Pataikete!");
				for (Laivas laiv : laivMas) {
					for (int i = 0; i < laiv.getLaivoIlg(); i++)
						if ((laiv.getKordX(i) == suvX) && (laiv.getKordY(i) == suvY)) {
							zaidejas.suvSk++;
							if (laiv.isArPataike() == false) { // pirmas suvis i laiva
								laiv.setArPataike(true);
								arPataike = true;
								break;
							}
							else {
								System.out.println("Nuskandinote visa laiva!");
								laiv.setArNuskendo(true);
								arPataike = true;
								zaidejas.nusLaivSk++;
								break;
							}
						}
				}
			}
			if (mas[suvY][suvX] == 0) {//pataike
				mas[suvY][suvX] = 3;
				atsMas[suvY][suvX] = 3;
				System.out.println("Nepataikete!");
				zaidejas.suvSk++;
			}
		}
		else {
			System.out.println("Tokiu kordinaciu nera!");
			arPataike =false;
		}
		return arPataike;
	}

	public int[][] uzpildytiPradMas(int[][] mas) {
		for (int y = 0; y < mas.length; y++) {
			for (int x = 0; x < mas[y].length; x++) {
				mas[y][x] = 0;
			}
		}
		return mas;
	}
}
