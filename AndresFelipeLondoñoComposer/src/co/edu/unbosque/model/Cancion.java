package co.edu.unbosque.model;


public class Cancion {

	
	
	
	private String[] palabra= new String[4];
	private String[] palabra1= new String[4];
	private String[] palabra2= new String[4];
	private String[] palabra3= new String[4];
	private String[] palabra4= new String[4];
	private String[] palabra5= new String[4];
	
	private String frase1, frase2;

	public Cancion() {
		
		
	
		frase1 = "";
		frase2 = "";
	
		
		palabra[0] = "Mami";
		palabra[1] = "Bebe";
		palabra[2] = "Princess";
		palabra[3] = "Mami";
		
		palabra1[0] = "Yo quielo";
		palabra1[1] = "Yo puedo";
		palabra1[2] = "Yo vengo a";
		palabra1[3] = "Voy a";
		
		palabra2[0] = "Enceldelte";
		palabra2[1] = "Amalte";
		palabra2[2] = "Ligal";
		palabra2[3] = "Jugal";
		
		palabra3[0] = "Suave";
		palabra3[1] = "Lento";
		palabra3[2] = "Lapido";
		palabra3[3] = "Fuelte";
		
		palabra4[0] = "Hasta que salga el sol";
		palabra4[1] = "Toda la noche";
		palabra4[2] = "Hasta el amanecel";
		palabra4[3] = "Todo el dia";
		
		palabra5[0] = "Sin anestesia";
		palabra5[1] = "Sin complomiso";
		palabra5[2] = "Feis to feis";
		palabra5[3] = "Sin miedo";
		//ba boni beibe
	}

	

	public String crearEstrofa() {
		int i = 0;

		for (int j = 0; j < 7; j++) {
			
			if (j == 2 || j == 5 || j == 6) {
				
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra[i] + " ";
			
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra1[i] + " ";
			
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra2[i] + " ";
			
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra3[i] + " ";
			
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra4[i] + " " ;
			
				i = (int) Math.floor(Math.random() * (4));
				frase1 += palabra5[i] + " " + "\n";
			}
		}
		return frase1;
	}

	public String crearCancion() {

		for (int j = 0; j < 4; j++) {
			frase2 = crearEstrofa();

		}	

		return frase2;
	}

	public String getFrase2() {
		return frase2;
	}

	public void setFrase2(String frase2) {
		this.frase2 = frase2;
	}

}
