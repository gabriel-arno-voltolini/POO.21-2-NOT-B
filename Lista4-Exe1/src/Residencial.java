

import java.time.LocalDate;

/**

 */
public class Residencial extends Telefone {
    private boolean conexaoInternet;


    public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}

	public boolean getConexaoInternet() {
        return conexaoInternet;
    }

    public double calcularCustoFixoMensal(){
        return 15.0;
    }
} 