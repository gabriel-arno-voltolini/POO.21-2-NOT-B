public class Avaliacao {
	private int qtdPagantes;
	private String opiniaoGeral;

	public Avaliacao(int qtd, String opiniao) {
		setQtdPagantes(qtd);
		setOpiniaoGeral(opiniao);
	}

	public int getQtdPagantes() {
		return qtdPagantes;
	}

	public void setQtdPagantes(int qtdPagantes) {
		if (qtdPagantes > 0)
			this.qtdPagantes = qtdPagantes;
		else {
			throw new IllegalArgumentException("Quantidade de pagantes deve ser maior que zero.");
		}
	}

	public String getOpiniaoGeral() {
		return opiniaoGeral;
	}

	public void setOpiniaoGeral(String opiniaoGeral) {
		if (opiniaoGeral != null && opiniaoGeral.length() > 0)
			this.opiniaoGeral = opiniaoGeral;
		else {
			throw new IllegalArgumentException("Opinião geral inválida.");
		}
	}
}
