
public class Ekranas {
	public void rodytiMeniu() {
		System.out.println("**************************************************");
		System.out.println("*                     LAIVAI                     *");
		System.out.println("* 0 - Iseiti is zaidimo                          *");
		System.out.println("* 1 - Pradeti zaidima                            *");
		System.out.println("* 2 - Atidengti lenta                            *");
		System.out.println("* 3 - Zaidimo instrukcija                        *");
		System.out.println("**************************************************");
	}
	
	public void spausdintiInstrukcija() {
		System.out.println("**************************************************");
		System.out.println("*                 INSTUKCIJA                     *");
		System.out.println("* Langeliu reiksmes:                             *");
		System.out.println("* '.' - Tuscias                                  *");//
		System.out.println("* 'x' - Pataikyta                                *");
		System.out.println("* '0' - Buvo suvis                               *");
		System.out.println("**************************************************");
		System.out.println("*           ATIDENGTOS LENTOS REIKSMES           *");
		System.out.println("* Langeliu reiksmes:                             *");
		System.out.println("* 0 - Tuscias                                    *");//
		System.out.println("* 1 - Laivas                                     *");
		System.out.println("* 2 - Pataikyta                                  *");
		System.out.println("* 3 - Buvo suvis                                 *");
		System.out.println("**************************************************");
	}
	
	public void rodytiKordIvedimoKlausima(int nusLaivSk, int laivSk) {
		System.out.println("Nuskendusiu laivu sk: " + nusLaivSk);
		System.out.println("Likusiu laivu sk: " + (laivSk - nusLaivSk));
		System.out.println("Iveskite suvio kordinates (Raide+Skaicius be tarpo, pvz.A1): ");
	}
	
	public void spausdintiLenta(int[][] mas, String tusti, String pataik, String buvoSuv, String zodis) {
		//for (int i = 0; i < (mas.length / 10)+1; i++ )
		System.out.print("   ");// Spaudiname tarpus pries zodi
		for (char raide : zodis.toCharArray())
			System.out.print(raide);
		System.out.println();
		for (int y = 0; y < mas.length; y++) {
			System.out.printf("%-2s ", y+1);
			for (int x = 0; x < mas[y].length; x++) {
				int skMas = mas[y][x];
				String rezSpausd;
				if ((skMas == 0) && (tusti != "")) 
					rezSpausd = tusti;
				else
					if ((skMas == 2) && (pataik != "")) 
						rezSpausd = pataik;
					else
						if ((skMas == 3) && (buvoSuv != "")) 
							rezSpausd = buvoSuv;
						else
							rezSpausd = "" + mas[y][x];
				
				System.out.print(rezSpausd);
			}
			System.out.println();
		}	
	}
	public void spausdintiLenta(int[][] mas,String zodis) {
		System.out.print("   ");// Spaudiname tarpus pries zodi
		for (char raide : zodis.toCharArray())
			System.out.print(raide);
		System.out.println();
		for (int y = 0; y < mas.length; y++) {
			System.out.printf("%-2s ", y+1);
			for (int x = 0; x < mas[y].length; x++)
				System.out.print(mas[y][x]);
			System.out.println();
		}
	}
}
