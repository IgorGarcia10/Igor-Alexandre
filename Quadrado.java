
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double lado) {
		super(lado, lado);
		
	}

	@Override
	public double calculaDiagonal() {
		//Colocar o Calculo
		
		return Math.pow(super.getAltura(), 2) + Math.pow(super.getBase(), 2);
	}
	

	



}
