
/**
 * Escreva a descrição da classe InteiroPositivo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class InteiroPositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    // item a)
    public void setValor(int valor){
        if (valor >= 0){
            this.x = valor;
        }
    }

    // item b)
    public long multiplica(InteiroPositivo outro){
        return this.x * outro.getValor();
    }

    public int getValor(){
        return this.x;
    }

    public long fatorial(){
        int fatorial = 1;
        for(int i = this.x; i > 1; i--) {
            fatorial *= i;  // fatorial = fatorial * i;
        }
        return fatorial;

    }

    public String divisoresInteiros(){
        int qtde = 0;
        String resultado = "Os divisores são ";
        for (int denominador=1; denominador <= this.x/2; denominador++){
            if (this.x % denominador == 0){
                resultado = resultado + denominador+ ", ";
                qtde++;
            }
        }
        resultado = resultado + this.x+" e a quantidade de divisores é "+(qtde+1);
        return resultado;
    }

    public int[] fibonacci(){
        // contribuição do Pedro
        int[] retorno = new int[this.x];
        int valAnte = 0;
        int val = 1;
        if(this.x != 0){
            retorno[0] = 1;
        }
        for(int i = 1; i<this.x; i++){
            retorno[i] = val + valAnte;
            valAnte = val;
            val = retorno[i];
        }
        return retorno;
    }
}
