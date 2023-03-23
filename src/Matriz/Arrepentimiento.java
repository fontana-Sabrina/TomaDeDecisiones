package Matriz;

public class Arrepentimiento extends Matriz{
	//private int mayor []; 
	public int MayorArrepe [];
	public int MayorGanan [];
	
	public Arrepentimiento(int a) {
		super(a);
		MayorArrepe = new int[a];
		MayorGanan = new int[a];
		for (int i = 0;i<MayorArrepe.length;i++) {
			MayorArrepe[i]=0;
			MayorGanan[i]=0;
		}
	}
	public void getMayorArrepe() {
		
		for (int i = 0;i<MayorArrepe.length;i++) {
			System.out.print("["+MayorArrepe[i]+"]");
		}
		System.out.println();
	}
	
	public void getMayorGanan() {
		
		for (int i = 0;i<MayorGanan.length;i++) {
			System.out.print("["+MayorGanan[i]+"]");
		}
		System.out.println();
	}

	public void buscarMayorGananciaColumpa(int m [][]) {
		for (int i = 0;i<MayorGanan.length;i++) {
			for (int j= 0; j<MayorGanan.length;j++) {
				if (MayorGanan[i]<m[j][i]) {
					MayorGanan[i]=m[j][i];
				}
			}
		}
	}
	
	public void cargarArrepentimiento(int m [][]) {		
		for (int i = 0;i<MayorGanan.length;i++) {
			for (int j= 0; j<MayorGanan.length;j++) {
				super.matriz[j][i]= MayorGanan[i]-m[j][i];
			}
		}
		super.mostrear();
	}
	
	public void buscarMaxArrepentimiento() {	
		for (int j= 0; j<MayorArrepe.length;j++) {
			for (int i = 0;i<MayorArrepe.length;i++) {
				if (MayorArrepe[j]<super.matriz[j][i]) {
					MayorArrepe[j]=super.matriz[j][i];
				}
			}
		}
	}
	
	public int [] tomaDecision() {
		int min[] = new int[2];
		min [0]= 0;
		min [1]= MayorArrepe[0];
		for (int j= 0; j<MayorArrepe.length;j++) {
			if (min[1]>MayorArrepe[j]) {
				min[1]=MayorArrepe[j];
				min[0]=j;
			}
		}
		return min;
	}
}
