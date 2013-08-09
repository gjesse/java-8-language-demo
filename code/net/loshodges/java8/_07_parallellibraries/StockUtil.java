package net.loshodges.java8._07_parallellibraries;

public class StockUtil {
  public static StockInfo getPrice(final String ticker) {
    return new StockInfo(ticker, YahooFinance.getPrice(ticker));
  }

  public static boolean isPriceLessThan(
    final StockInfo stockInfo, final double price) {
    
    return stockInfo.price < price;
  }

  public static StockInfo pickHigh(
    final StockInfo stockInfo1, final StockInfo stockInfo2) {
      
    return stockInfo1.price > stockInfo2.price ? stockInfo1 : stockInfo2;
  }
}
