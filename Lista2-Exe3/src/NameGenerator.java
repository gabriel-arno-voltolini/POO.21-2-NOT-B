
public class NameGenerator {

	public static String generateStarWarsName(String[] entrada) {
		String nome = "";
		String[] nomes = entrada[0].split(" ");
		nome += nomes[nomes.length - 1].charAt(0);
		nome += nomes[nomes.length - 1].charAt(1);
		nome += nomes[nomes.length - 1].charAt(2);
		nome += entrada[0].charAt(0);
		nome += entrada[0].charAt(1);
		nome += " ";
		nome += entrada[1].charAt(0);
		nome += entrada[1].charAt(1);
		nome += entrada[2].charAt(0);
		nome += entrada[2].charAt(1);
		nome += entrada[2].charAt(2);
		return nome;
	}

	public static String generateStarWarsName2(String[] entrada) {
		String sobrenome = entrada[0].substring(entrada[0].lastIndexOf(" ") + 1);
		return sobrenome.substring(0, 3) + entrada[0].substring(0, 2) + " " + entrada[1].substring(0, 2)
				+ entrada[2].substring(0, 3);
	}
}
