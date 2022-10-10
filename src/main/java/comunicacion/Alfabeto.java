package comunicacion;

public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String cade = letras[0];
		for(int i = 1; i<letras.length; i++) {
			cade = cade + ", " + letras[i];
		}
		return cade;
	}
	

}
