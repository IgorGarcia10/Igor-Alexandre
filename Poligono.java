
public abstract class Poligono extends Figura {
	private double base;
	private double altura;
	//private double area; 
	
	
	
	
	public Poligono(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	
	double area() {
		return getAltura()*getBase();
	}
	
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
