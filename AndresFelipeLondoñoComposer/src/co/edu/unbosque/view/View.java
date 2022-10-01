package co.edu.unbosque.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public View() {

	}

	public int leerDatoEntero(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	
	public long leerDatoLong(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		long dato = Integer.parseInt(aux);
		return dato;
	}

	public String leerDatoString(String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}

	public double leerDatoDouble(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		double dato = Double.parseDouble(aux);
		return dato;
	}

	public void mostrarInformacion(String string) {
		JOptionPane.showMessageDialog(null, string);
	}
	

	public int esribirArchivo (String dato) {
		JFileChooser j = new JFileChooser();
		 j.showSaveDialog(j);
		
		 
		 File f = j.getSelectedFile();
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
			
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
}
