
public class Frase {
	private String texto;

	public Frase(String texto) {
		this.setTexto(texto);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String[] dividirFrase() {
		String[] retorno;
		retorno = this.texto.split(" ");
		return retorno;
	}
	
}
