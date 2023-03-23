package Matriz;

public class Ganancias extends Matriz{

	public Ganancias(int a) {
		super(a);
	}
	
	public void cargarGanancias(int c,int v, int a) {;			
	for (int j= 0; j<super.matriz.length;j++) {
		for (int i = 0;i<matriz[j].length;i++) {
			if (i>j) {
				this.matriz[j][i]=matriz[j][i-1];					//(v-c)*(j+a)
			}else {
				this.matriz[j][i]=(v*(i+a))-(c*(j+a)); 				//x=i+a, p= j+a
				
			}
		}
	}
}
}
