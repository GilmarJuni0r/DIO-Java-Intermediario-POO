import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        
        System.out.println("Exibir os gatos na ordem de inserção:");
        System.out.println(gatos);

        System.out.println("Exibir os gatos em ordem aleatória:");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Exibir em ordem natural:");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Exibir em ordem de idade:");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Exibir por ordem de cor:");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem Nome/Cor/Idade:");
        //Collections.sort(gatos, new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer Idade;
    private String cor;
    
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        Idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", Idade=" + Idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());        
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        // TODO Auto-generated method stub
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}