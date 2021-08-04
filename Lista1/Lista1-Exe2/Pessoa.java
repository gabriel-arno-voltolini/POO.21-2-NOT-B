
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String estadoCivil = "Solteiro"; // 1a opção

    /**
     * COnstrutor para objetos da classe Pessoa
     */
    public Pessoa(String nome, char sexo, String data)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = data;
        this.estadoCivil = "Solteiro"; // 2a opção
    }

    public String getNome(){
        return this.nome;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
}
