public class FormulaDoBhaskara {
	private int a;
	private int b;
	private int c;
	private double delta;
	private double y1;
	private double y2;
	public int getPrimeiroValor() {
		return a;
	}
	public void setPrimeiroValor(int a) {
		this.a=a;
	}
	public int getSegundoValor() {
		return b;
	}
	public void setSegundoValor(int b) {
		this.b=b;
	}
	public int getTerceiroValor() {
		return c;
	}
	public void setTerceiroValor(int c) {
		this.c=c;
	}
	public double getDelta() {
		delta= Math.pow(b,2)-(4*a*c);
		return delta;
	}
	public double getPrimeiroY() {
		if(delta<=0) {
			System.out.print("Nao existe: ");
		}else{
			y1=(-b+Math.sqrt(delta))/(2*a);
		}
		return y1;
	}
	public double getSegundoY() {
		if(delta<=0) {
			System.out.print("Nao existe: ");
		}else {
			y2=(-b-Math.sqrt(delta))/(2*a);
		}
		return y2;
	}
}