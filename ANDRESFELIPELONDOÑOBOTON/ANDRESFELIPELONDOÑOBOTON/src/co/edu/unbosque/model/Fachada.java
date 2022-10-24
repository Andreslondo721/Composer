package co.edu.unbosque.model;

public class Fachada {

	private ClaseY y;
	private ClaseX x;
	
	public Fachada() {
		
		y = new ClaseY();
		x = new ClaseX();
	}


	public ClaseY getY() {
		return y;
	}


	public void setY(ClaseY y) {
		this.y = y;
	}


	public ClaseX getX() {
		return x;
	}


	public void setX(ClaseX x) {
		this.x = x;
	}


	public String procesarDatoClaseFachada(String dato) {
		return dato+" Procesado por Clase fachada";

}
	public String procesarDatoClaseY(String dato) {
		return dato+" Procesado por Clase Y";
}
}