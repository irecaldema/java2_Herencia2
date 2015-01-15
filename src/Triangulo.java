public class Triangulo extends FiguraGeometrica {
	private double area, peri ;

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	public double area(){
		area = getBase()*getAltura()/2;
		return area;
	}
	//Triángulo equilatero
	public double peri() {
		peri = getBase()*3;
		return peri;
	}
	
	public void mostrar() {
		System.out.println("\nEl area del triangulo es: " + area());
		System.out.println("\nEl perimetro del triangulo es: " + peri());
	}
}