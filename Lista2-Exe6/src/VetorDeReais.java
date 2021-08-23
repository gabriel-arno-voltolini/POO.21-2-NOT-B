
public class VetorDeReais {
	private double[] vetor;

	public VetorDeReais(int tamanho) {
		vetor = new double[tamanho];
	}

	// item a)
	public void setValor(double valor, int posicao) {
		vetor[posicao] = valor;
	}

	// item b)
	public int quantosPares() {
		int qtdPares = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			if ((int)this.vetor[i] % 2 == 0) {
				qtdPares++;
			}
		}
		return qtdPares;
	}
	
	// item c)
	public VetorDeReais divide(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;
		}
		VetorDeReais novo = new VetorDeReais(this.getTamanho());
		double valor;
		for (int i = 0; i < this.vetor.length; i++) {
			// valor = this.vetor[i] / outro.vetor[i];  // quebra o encapsulamento ao acessar diretamente o atributo do outro objeto
			valor = this.vetor[i] / outro.getValor(i);  // característica OO
			novo.setValor(valor,i);
		}
		return novo;
	}
	
	public double getValor(int posicao) {
		return this.vetor[posicao];
	}
	
	public int getTamanho() {
		return this.vetor.length;
	}
	
	// item d)
}
