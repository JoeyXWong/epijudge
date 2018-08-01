package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.List;
public class BuyAndSellStock {
  @EpiTest(testDataFile = "buy_and_sell_stock.tsv")
  public static double computeMaxProfit(List<Double> prices) {
    double currMaxProfit = 0.0;
    double currMin = Integer.MAX_VALUE;

    for(int i = 0; i< prices.size(); i++){

        currMaxProfit = Math.max(currMaxProfit, prices.get(i) - currMin);
        currMin = Math.min(prices.get(i), currMin);

    }

    return currMaxProfit;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "BuyAndSellStock.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
