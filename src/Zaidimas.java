import java.util.Scanner;

public class Zaidimas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var laivai = new Laivai(sc, "RESPUBLIKA", 10);
		laivai.pradeti();
		
		sc.close();
	}

}
