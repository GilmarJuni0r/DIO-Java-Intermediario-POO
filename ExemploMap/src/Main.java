import java.rmi.server.SocketSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
        System.out.println("Crie um dicionário que relacione os modelos e seus repectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: "+carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: "+carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: "+ carrosPopulares.keySet());
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println(modeloMaisEficiente+ ", Consumo: "+ consumoMaisEficiente + "Km/l");

        System.out.println("\nExiba o modelo menos econômico e seu consumo:");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();                
        }
        System.out.println(modeloMenosEficiente+ ", Consumo: "+ consumoMenosEficiente + "Km/l");

        System.out.print("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos: "+ (soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l:");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();        
        while(iterator2.hasNext()){
            if(iterator2.next() == 15.6)iterator2.remove();
        }        
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram adicionados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("\nApague o dicionário de carros");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: "+ carrosPopulares.isEmpty());
    }
}
