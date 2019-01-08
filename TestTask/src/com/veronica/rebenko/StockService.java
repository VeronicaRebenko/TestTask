package com.veronica.rebenko;

import java.util.HashMap;
import java.util.Map;

public class StockService {
    public static void addStock(Stock stock) {
        stocks.put(stock.getName(), stock);
    }

    public static void removeStock(String name) {
        stocks.remove(name);
    }

    public static Stock getStock(String name) {
        return stocks.get(name);
    }

    private static Map<String, Stock> stocks = new HashMap<String, Stock>();

    static {
        generateStocks();
    }

    private static void generateStocks() {
        addStock(new Stock("BeerBar","123 Secret str., London, GB, 44100"));
        addStock(new Stock("BestBar", "6170 Beach av., Tampa, USA, 01977"));
    }
}
