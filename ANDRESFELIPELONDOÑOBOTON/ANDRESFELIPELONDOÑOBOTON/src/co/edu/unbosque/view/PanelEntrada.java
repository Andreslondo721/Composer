package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada, lab2;
	private JTextField txtNumero;
	private JButton butConvertir, butProcesar;
	public static final String CONVERTIR = "Convertir";
	public static final String PROCESAR = "Procesar";
	
	public PanelEntrada() {
		setLayout( new GridLayout(2,3) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		lab2 = new JLabel();
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butConvertir = new JButton("Convertir");
		butConvertir.setActionCommand(CONVERTIR);
		
		butProcesar = new JButton("Procesar");
		butProcesar.setActionCommand(PROCESAR);
		
		add(labEntrada);
		
		add(txtNumero);
		
		add(butProcesar);
		
		add(butConvertir);
		
		
	}
	
	
	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButConvertir() {
		return butConvertir;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}


	public static String getConvertir() {
		return CONVERTIR;
	}


	public static String getProcesar() {
		return PROCESAR;
	}


	public JButton getButProcesar() {
		return butProcesar;
	}


	public void setButProcesar(JButton butProcesar) {
		this.butProcesar = butProcesar;
	}
	
}
