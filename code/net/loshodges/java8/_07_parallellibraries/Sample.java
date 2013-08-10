package net.loshodges.java8._07_parallellibraries;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sample {


  public static void main(String[] args) {
    List<String> tickers = Tickers.symbols;
    
    long start = System.nanoTime();
    List<StockInfo> stockPrices = new ArrayList<>();

    for(String ticker : tickers) {
      stockPrices.add(StockUtil.getPrice(ticker));
    }

    List<StockInfo> stocksLessThan500 = new ArrayList<>();
    for(StockInfo stockInfo : stockPrices) {
      if(StockUtil.isPriceLessThan(stockInfo, 500))
        stocksLessThan500.add(stockInfo);
    }

    StockInfo highPriced = new StockInfo("", 0.0);
    for(StockInfo stockInfo : stocksLessThan500) {
      highPriced = StockUtil.pickHigh(highPriced, stockInfo);
    }

    long end = System.nanoTime();
    System.out.println(highPriced);
    System.out.println("Time: " + (end - start)/1.0e9);

    //findStock(tickers.stream());
    //findStock(tickers.parallelStream());
    
  }

    public static void findStock(Stream<String> tickers) {
        long start = System.nanoTime();
        StockInfo highPriced =
                tickers
                        .map(StockUtil::getPrice)
                        .filter(stockInfo -> StockUtil.isPriceLessThan(stockInfo, 500))
                        .reduce(new StockInfo("", 0.0), StockUtil::pickHigh);
        long end = System.nanoTime();

        System.out.println(highPriced);
        System.out.println("Time: " + (end - start)/1.0e9);
    }
}

