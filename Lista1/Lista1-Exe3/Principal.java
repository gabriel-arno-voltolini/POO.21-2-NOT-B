
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Principal
{
    public static void main(String[] args)
    {
        Produto produto1;
        produto1 = new Produto("Caderno", "Caderno em espiral tamanho médio", 4.5F, 15);
        
        Produto produto2 = new Produto("Caneta ESF", "Caneta esferográfica 5mm",1.20f, 2);
        
        Produto produto3 = new Produto();
        produto3.setNome("Esquadro");
        produto3.setDescricao("Esquadro de acrílico 20 cm");
        produto3.setPrecoUnitario(2.35f);
        produto3.setDesconto(10);
        
        
    }

}
