public class Rectangulo extends FiguraGeometrica {
	private double area, peri ;

	public Rectangulo(double base, double altura) {
		super (base,altura);
	}
		
	public double area() {
		area = getBase()*getAltura();
		return area;
	}

	public double peri() {
		peri = 2*getBase()+2*getAltura();
		return peri;
	}
	
	public void mostrar()
	{
		System.out.println("\nEl area del rectangulo es: " + area());
		System.out.println("\nEl perimetro del rectangulo es: " + peri());
	}
}