
public class Laivas {
	int kordX1;
	int kordX2;
	int kordY1;
	int kordY2;
	int kordX3;
	int kordY3;
	int kordX4;
	int kordY4;
	
	int[][] kord;
	int laivoIlg;
	
	String poz = "";
	boolean arPataike = false;
	boolean arNuskendo = false;
	
	Laivas(int laivoIlg){
		this.kord = new int[laivoIlg][2];
		this.laivoIlg = laivoIlg;
	}	
	public int getSaliaGalSk() {
		switch (this.poz) {
		case "CC": return 4; 
		case "VC": return 3;
		case "CD": return 3;
		case "AC": return 3;
		case "CK": return 3;
		case "VK": return 2;
		case "VD": return 2;
		case "AD": return 2;
		case "AK": return 2;
		default : return 0;
		}
	}
	
	public void setPoz(int x, int y, int masIlg) {
		//C
		if ((x > 0) && (x < masIlg-1) && (y > 0) && (y < masIlg-1)) {
			this.poz = "CC";
		}
		//VK
		if ((x == 0) && (y == 0)) {
			this.poz = "VK";
		}
		//VC
		if ((x > 0) && (x < masIlg-1) && (y == 0)) {
			this.poz = "VC";
		}
		//VD
		if ((x == masIlg-1) && (y == 0)) {
			this.poz = "VD";
		}
		//CD
		if ((x == masIlg-1) && (y > 0) && (y < masIlg-1)) {
			this.poz = "CD";
		}
		//AD
		if ((x == masIlg-1) && (y == masIlg-1)) {
			this.poz = "AD";
		}
		//AC
		if ((x > 0) && (x < masIlg-1) && (y == masIlg-1)) {
			this.poz = "AC";
		}
		//AK
		if ((x == 0) && (y == masIlg-1)) {
			this.poz = "AK";
		}
		//CK
		if ((x == 0) && (y > 0) && (y < masIlg-1)) {
			this.poz = "CK";
		}
	}
	
	public String getPoz() {
		return poz;
	}
	
	public boolean isArPataike() {
		return arPataike;
	}
	public void setArPataike(boolean arPataike) {
		this.arPataike = arPataike;
	}
	public boolean isArNuskendo() {
		return arNuskendo;
	}
	public void setArNuskendo(boolean arNuskendo) {
		this.arNuskendo = arNuskendo;
	}

	public int getKordY(int lang) {
		return this.kord[lang][0];
	}
	
	public int getKordX(int lang) {
		return this.kord[lang][1];
	}

	public void setKord(int x, int y, int lang) {
		this.kord[lang][0] = y;
		this.kord[lang][1] = x;
	}
	
	public void setKordY(int y, int lang) {
		this.kord[lang][0] = y;
	}
	
	public void setKordX(int x, int lang) {
		this.kord[lang][1] = x;
	}

	public int getLaivoIlg() {
		return laivoIlg;
	}

	public void setLaivoIlg(int laivoIlg) {
		this.laivoIlg = laivoIlg;
	}

}
