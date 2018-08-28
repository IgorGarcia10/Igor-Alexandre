
public class Circulo extends Figura {
	private double raio;
	
	
	public Circulo(double raio) {
		setRaio(raio);
	}

	@Override
	double area() {
		return (raio*raio)*Math.PI;
	}
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
