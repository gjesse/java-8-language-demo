package net.loshodges.java8._04_strategypattern;

import java.util.*;
import java.util.function.Predicate;

public class Sample {
  /*
  //This approach leads to duplication, lacks separation of concern.
  
  public static void totalAssets(List<net.loshodges.java8.strategypattern.Asset> assets) {
    int total = 0;
    for(net.loshodges.java8.strategypattern.Asset asset : assets) {
      total += asset.value;
    }
    System.out.println(total);
  }
  
  public static void totalStockAssets(List<net.loshodges.java8.strategypattern.Asset> assets) {
    int total = 0;
    for(net.loshodges.java8.strategypattern.Asset asset : assets) {
      if(asset.type == net.loshodges.java8.strategypattern.Asset.AssetType.STOCK)
        total += asset.value;
    }
    System.out.println(total);    
  }

  public static void totalBondAssets(List<net.loshodges.java8.strategypattern.Asset> assets) {
    int total = 0;
    for(net.loshodges.java8.strategypattern.Asset asset : assets) {
      if(asset.type == net.loshodges.java8.strategypattern.Asset.AssetType.BOND)
        total += asset.value;
    }
    System.out.println(total);    
  }
  
  */
  
  
  public static void totalAssets(List<Asset> assets, Predicate<Asset> selector) {
    System.out.println(
      assets.stream()
      .filter(selector)
      .mapToInt(asset -> asset.value)
      .sum());
  }
  
  public static void main(String[] args) {
    List<Asset> assets = Arrays.asList(
      new Asset(Asset.AssetType.STOCK, 100),
      new Asset(Asset.AssetType.BOND, 200),
      new Asset(Asset.AssetType.STOCK, 300),
      new Asset(Asset.AssetType.BOND, 400)
    );
    
    
    //We don't want to go this route.
    //totalAssets(assets);
    //totalStockAssets(assets);
    //totalBondAssets(assets);
    
    totalAssets(assets, asset -> true);
    totalAssets(assets, asset -> asset.type == Asset.AssetType.STOCK);
    totalAssets(assets, asset -> asset.type == Asset.AssetType.BOND);
  }
}

