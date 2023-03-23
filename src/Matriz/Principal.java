package Matriz;

public class Principal {

	public static void main(String[] args) {
		int c=32;			//costo de producción 
		int v=47;			//precio de venta 
		int a=200;		//mínimo a producir 
		int b=2000;	//máximo a producir 
		Ganancias g = new Ganancias (b-a);
		Arrepentimiento ar = new Arrepentimiento(b-a);
		
//		ar.getMayor();
		g.cargarGanancias(c, v, a);		
		g.mostrear();
		ar.buscarMayorGananciaColumpa(g.matriz);
		System.out.println("---------------------------------------------------------------------------------------------");
		ar.getMayorGanan();
		System.out.println("---------------------------------------------------------------------------------------------");
		ar.cargarArrepentimiento(g.matriz);
		System.out.println("---------------------------------------------------------------------------------------------");
		ar.buscarMaxArrepentimiento();
		ar.getMayorArrepe();
		System.out.println("---------------------------------------------------------------------------------------------");
		int m [] = ar.tomaDecision();
		m [0]=m [0]+a;
		System.out.println(m[0]+" "+m[1]);
		//g.mostrear();
		//System.out.println(200-a);
		//m.prievita(2000-a-1, 2000-a-1);
		
	}

}
