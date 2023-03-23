package Matriz;

public class Celda {
	private int ganancia,arrepentimiento;			//el valor de la ganancia de la celda y el valor del arrepentimiento de la celda
	
	public Celda() {
		ganancia=0;
		arrepentimiento=0;
	}
	
	public int getGanancia() {
		return ganancia;
	}
	public void setGanancia(int c,int v, int p, int x) {
		this.ganancia = (v*x)-(c*p);
	}
	
	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}

	public int getArrepentimiento() {
		return arrepentimiento;
	}
	public void setArrepentimiento(int arrepentimiento) {
		this.arrepentimiento = arrepentimiento;
	}

}
