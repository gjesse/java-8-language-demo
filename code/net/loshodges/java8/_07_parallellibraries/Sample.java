package net.loshodges.java8._07_parallellibraries;

import java.util.stream.Stream;

public class Sample {
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
  public static void main(String[] args) {
    List<String> tickers = Tickers.symbols;
    
//    long start = System.nanoTime();
//    List<net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo> stockPrices = new ArrayList<>();
//    
//    for(String ticker : tickers) {
//      stockPrices.add(net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockUtil.getPrice(ticker));
//    }
//
//    List<net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo> stocksLessThan500 = new ArrayList<>();
//    for(net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo stockInfo : stockPrices) {
//      if(net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockUtil.isPriceLessThan(stockInfo, 500))
//        stocksLessThan500.add(stockInfo);
//    }
//    
//    net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo highPriced = new net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo("", 0.0);
//    for(net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockInfo stockInfo : stocksLessThan500) {
//      highPriced = net.loshodges.java8.net.loshodges.java8._07_parallellibraries.StockUtil.pickHigh(highPriced, stockInfo);
//    }
//    
//    long end = System.nanoTime();
//    System.out.println(highPriced);
//    System.out.println("Time: " + (end - start)/1.0e9);

    findStock(tickers.stream());
    findStock(tickers.parallelStream());
    
  }
}

