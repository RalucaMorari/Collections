package Exercitii.Ex9StockManagement;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//     9. Scrie o aplicatie pentru bursa
//O bursa este structurata sub forma unei mape,
// cu cheia fiind numele companiei si
// valoarea fiind pretul unei actiuni la acea companie.
//
//Exemplu: {Oracle=56, Google=421, Tesla=950}
//
//Scrie 2 metode:
//
//O metoda care sa gaseasca compania cu cel mai mare pret al unei actiuni din mapa
//O metoda care sa gaseasca pretul mediu al preturilor actiunilor din mapa

        Map<String, Integer> stockPriceByCompany = new HashMap<>();
        stockPriceByCompany.put("Oracle", 56);
        stockPriceByCompany.put("Google", 421);
        stockPriceByCompany.put("Tesla", 950);
        StockMarket stockMarket = new StockMarket(stockPriceByCompany);

        System.out.println(stockPriceByCompany);
        System.out.println(stockMarket.getMostExpensiveCompany());
        System.out.println(stockMarket.getAverageSharePrice());
    }
}
