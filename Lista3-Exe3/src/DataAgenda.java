import java.time.LocalDate;
import java.util.ArrayList;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();

	public ArrayList<Compromisso> getCompromissos(){
		// para retornar uma cópia da lista ao invés da lista original
		return (ArrayList<Compromisso>) this.compromissos.clone();
	}
	
	public int getTempoMedio() {
		int tempoTotal = 0;
		for (Compromisso comp : compromissos) {
			tempoTotal += comp.getTempo();
		}
		return tempoTotal / compromissos.size();
	}

	public boolean addCompromisso(Compromisso c) {
		for (Compromisso comp: this.compromissos) {
			if (comp.getHora().equals(c.getHora())) {
				return false;
			}
		}
		compromissos.add(c);
		return true;
	}

	public ArrayList<Compromisso> getCompromissosPrioridade(char prioridade) {
		ArrayList<Compromisso> compromissosPrioridade = new ArrayList<Compromisso>();
		for (Compromisso c : compromissos) {
			if (c.getPrioridade() == prioridade) {
				compromissosPrioridade.add(c);
			}
		}
		return compromissosPrioridade;
	}

	public int getQtdCompromissosPrioridade(char prioridade) {
		int qtdCompromissosPrioridade = 0;
		for (Compromisso c : compromissos) {
			if (c.getPrioridade() == prioridade) {
				qtdCompromissosPrioridade++;
			}
		}
		return qtdCompromissosPrioridade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}

}