
public class Principal {
    public static void main(String[] args) {
        String[] entrada = {"Jo�o Aparecido da Silva", "Dores", "Blumenau"};
        System.out.println(NameGenerator.generateStarWarsName(entrada));
        System.out.println(NameGenerator.generateStarWarsName2(entrada));
        
        String[] entrada2 = {"Maria das Gra�as Candido Abreu", "Leite", "Gaspar"};
        System.out.println(NameGenerator.generateStarWarsName(entrada2));
        System.out.println(NameGenerator.generateStarWarsName2(entrada2));
    }
}
