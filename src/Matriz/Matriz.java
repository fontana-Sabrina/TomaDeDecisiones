package Matriz;

public class Matriz {
	public int matriz [][];
	
	public Matriz(int a) {
		matriz = new int[a][a];
		for (int j= 0; j<matriz.length;j++) {
			for (int i = 0;i<matriz[j].length;i++) {
				this.matriz[i][j] = 0;
			}
		}
	}
	
	public void mostrear(){
		for (int j= 0; j<matriz.length;j++) {
			for (int i = 0;i<matriz[j].length;i++) {
				System.out.print("[" + matriz[j][i]+ "] ");
			}
			System.out.println();
		}
	}

}
/*	private Celda matriz [][];
	
	public Matriz(int a) {
		matriz = new Celda [a][a];
		for (int j= 0; j<matriz.length;j++) {
			for (int i = 0;i<matriz[j].length;i++) {
				this.matriz[i][j] = new Celda(); 
			}
		}
	}

	public void cargarGanancias(int c,int v, int a) {;			
		for (int j= 0; j<matriz.length;j++) {
			for (int i = 0;i<matriz[j].length;i++) {
				if (i>j) {
					this.matriz[j][i].setGanancia(matriz[j][i-1].getGanancia());		//(v-c)*(j+a)
				}else {
					this.matriz[j][i].setGanancia ((v*(i+a))-(c*(j+a))); 				//x=i+a, p= j+a
					
				}
			}
		}
	}

	public void mostrearGanancias(){
		for (int j= 0; j<matriz.length;j++) {
			for (int i = 0;i<matriz[j].length;i++) {
				System.out.print("[" + matriz[j][i].getGanancia()+ "] ");
			}
			System.out.println();
		}
	}
	
	public void prievita(int i,int j) {	
		//System.out.println(matriz[1800-1][1800-1].getGanancia());
		System.out.print("[" + matriz[i][j].getGanancia()+ "] "); 
	}
	
	
}*/


