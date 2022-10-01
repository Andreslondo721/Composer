package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.View;

public class Controller {
	private Propiedades p;
	private View v;
	private Cancion c;
	

	public Controller() {
		c = new Cancion();
		v = new View();
		p = new Propiedades();
		funcionar();
	}

	public void funcionar() {
		
		v.esribirArchivo(c.crearCancion());
		v.mostrarInformacion(p.escribirProperties());
		v.mostrarInformacion(c.getFrase2());
	}

}
