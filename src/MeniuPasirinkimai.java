import java.util.Scanner;

public class MeniuPasirinkimai {
	Scanner sc;
	
	MeniuPasirinkimai(Scanner sc){
		this.sc = sc;
	}
	
	private int getPasirinkimas() {
		// patikrinam ar ivede skaiciu. Jei ne grazinam -1
		if (!sc.hasNextInt())
			return -1;

		return sc.nextInt();
	}

	public String getStringPasirinkimas() {
		String zodis = " ";
		loop : while(!zodis.isEmpty()) {
			zodis = sc.nextLine();
			if (zodis.length()>0) {
				break loop;
			}
			else {
				System.out.println("Neivedete teksto!");
				zodis = " ";
			}
		}
		return zodis;
	}
}
