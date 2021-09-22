import java.time.LocalDate;
import java.util.HashMap;

public class Agenda {
	private HashMap<LocalDate, DataAgenda> datasAgenda = new HashMap<LocalDate, DataAgenda>();

	public Compromisso getMenorCompromisso() {
		Compromisso menorCompromisso = null;
		int menorTempoCompromisso = Integer.MAX_VALUE;

		for (DataAgenda dataAgenda : this.datasAgenda.values()) {
			for (Compromisso compromisso : dataAgenda.getCompromissos()) {
				if (compromisso.getTempo() < menorTempoCompromisso) {
					menorCompromisso = compromisso;
					menorTempoCompromisso = compromisso.getTempo();
				}
			}
		}

		return menorCompromisso;
	}

	public void addDataAgenda(DataAgenda dataAgenda) {
		datasAgenda.putIfAbsent(dataAgenda.getData(), dataAgenda);
	}

	public boolean verificaData(LocalDate data) {
		return datasAgenda.containsKey(data);
	}

	public DataAgenda busca(LocalDate data) {
		return datasAgenda.get(data);
	}



}