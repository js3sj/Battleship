
public class Kordinates {
//GENERUOJA LANGELIUS TOKIA TVARKA
	// 1
	//4x2
	// 3
//POZICIJA PIRMO SUGENERUOTO LANGELIO
//	VK	VC	VD
//
//	CK	C	CD
//
//	AK	AC	AD
	public int getXC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 2: rez = 0; break;
		case 3: rez = 1; break;
		case 4: rez = 0; break;
		}
		return rez;
	}

	public int getXVK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = 1; break;
		}
		return rez;
	}

	public int getYVK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 1; break;
		case 3: rez = 1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}

	public int getXVC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYVC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 1; break;
		case 3: rez = 1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		} 
		return rez;
	}
	
	public int getXVD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = -1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYVD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 1; break;
		case 3: rez = 1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}
	
	public int getXCD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = -1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYCD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		case 3: rez = 1; break;
		}
		return rez;
	}

	public int getXAD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = -1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYAD(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 3: rez = -1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}
	
	public int getXAC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = -1; break;
		}
		return rez;
	}

	public int getYAC(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 3: rez = -1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}
	
	public int getXAK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = 1; break;
		}
		return rez;
	}

	public int getYAK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 3: rez = -1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}
	
	public int getXCK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = 0; break;
		case 3: rez = 0; break;
		case 2: rez = 1; break;
		case 4: rez = 1; break;
		}
		return rez;
	}

	public int getYCK(int sk) {
		int rez = 0;
		switch(sk) {
		case 1: rez = -1; break;
		case 3: rez = 1; break;
		case 2: rez = 0; break;
		case 4: rez = 0; break;
		}
		return rez;
	}
}

