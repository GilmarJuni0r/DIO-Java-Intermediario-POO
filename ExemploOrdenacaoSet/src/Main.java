import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
public class Main {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '70s show","Comédia",25));
        }};

        System.out.println("Exibir em ordem aleatória: ");
        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " +  serie.getTempoEpisodio());           
        }

        System.out.println("\nExibir em ordem de inserção:");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '70s show","Comédia",25));
        }};
        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " +  serie.getTempoEpisodio());           
        }

        System.out.println("\nExibir por ordem natural:");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie : series3) {
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " +  serie.getTempoEpisodio());  
        }

        System.out.println("\nOrdem Nome/Gênero/TempoEpisodio");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series);
        for (Serie serie : series4) {
            System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " +  serie.getTempoEpisodio());  
        }
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        // TODO Auto-generated method stub
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        
        return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
    }

}


