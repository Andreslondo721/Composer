package co.edu.unbosque.model.persistence;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Propiedades {
	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";
	
	public String escribirProperties() {
		
		try {
			prop.setProperty("numeroEstrofas:", " 3");
			prop.setProperty("numeroFrases", " 4");
			prop.store(new FileOutputStream(archivoprop),null );
		}catch(IOException e) {
			return "La canción se creo exitosamente" + "\n"+ "para guardar las propiedades porfavor crea la direccion C:\\data\\archivo.properties";
		}
		
		return "La canción se creo exitosamente";
	}
	
//	public String leerPropiedades() {
//		String linea = "";
//		try {
//			prop.load(new FileInputStream(archivoprop));
//			
//			prop.list(System.out);
//			
//			linea += "nombre del Proyecto: " + prop.getProperty("nombreProyecto") + "\n";
//			linea += "nombre del Archivo: " + prop.getProperty("nombreArchivo") + "\n";
//			linea += "nombre de la Clase Java: " + prop.getProperty("nombreCodigoFuente") + "\n";
//		}catch(IOException ex) {
//			return null;
//		}
//		return linea;
//	}
}

