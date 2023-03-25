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
	
	public int[][] getMatriz(){
		return this.matriz;
		
	}

}


