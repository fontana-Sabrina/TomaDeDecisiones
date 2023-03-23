package Matriz;

public class Principal {

	public static void main(String[] args) {
		int c=32;			//costo de producción 
		int v=47;			//precio de venta 
		int a=200;		//mínimo a producir 
		int b=215;	//máximo a producir 
		Matriz m = new Matriz(b-a);
		
		
		m.cargarGanancias(c, v, a);
		m.mostrearGanancias();
		//System.out.println(200-a);
		//m.prievita(2000-a-1, 2000-a-1);
		System.out.println(b-a);
		
	}

}
