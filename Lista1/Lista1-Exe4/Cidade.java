public class Cidade {
  private String  nome;
  private String  UF;
  private int populacaoMasculina;
  private int populacaoFeminina;
  private boolean calculado;
  
  public Cidade() {
      this.nome = "";
      this.UF = "";
      this.populacaoMasculina = 0;
      this.populacaoFeminina = 0;
      this.calculado = false;
  }
  public Cidade(String nome, int populacaoFeminina, int populacaoMasculina) {
    this.setNome(nome);
    this.setPopulacaoFeminina(populacaoFeminina);
    this.setPopulacaoMasculina(populacaoMasculina);
  }
  public void setNome(String _nome) {
    this.nome = _nome;
  }
  public void setUF(String _UF) {
    this.UF = _UF;
  }
  public void setPopulacaoFeminina(int _populacaoFeminina) {
    this.populacaoFeminina = _populacaoFeminina;
  }
  public void setPopulacaoMasculina(int _populacaoMasculina) {
    this.populacaoMasculina = _populacaoMasculina;
  }
  public void setCalculado(boolean _calculado) {
    this.calculado = _calculado;
  }
}
