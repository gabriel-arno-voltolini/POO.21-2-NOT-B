import java.time.LocalDate;

public class Evento{
	private String titulo;
	private double valor;
	private LocalDate data;
	private Avaliacao avaliacao;

	public Evento(String titulo, double valor, LocalDate data) {
		setTitulo(titulo);
		setValor(valor);
		setData(data);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && titulo.length() > 0)
			this.titulo = titulo;
		else {
			throw new IllegalArgumentException("Título inválido.");
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 0)
			this.valor = valor;
		else {
			throw new IllegalArgumentException("Valor do ingresso inválido.");
		}
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		if (data != null)
			this.data = data;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		if (avaliacao != null)
			this.avaliacao = avaliacao;
	}

	public String exibir() {
		String str = "Evento: " + getTitulo() + ", no dia " + getData() + " R$" + getValor();
		if (avaliacao == null) {
			str += ". Ainda não avaliado.";
		} else {
			str += ", teve "+ avaliacao.getQtdPagantes() + " pagantes que acaharam o evento " + avaliacao.getOpiniaoGeral();
		}
		return str;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+":"+this.titulo;
	}
	
	
}
