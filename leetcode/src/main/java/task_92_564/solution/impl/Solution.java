package task_92_564.solution.impl;

public class Solution implements task_92_564.solution.Solution {
    @Override
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        boolean wasBought = false;
        int boughtPrice = 0;

        boolean upTrend = false;
        boolean downTrend = false;

        int maxPriceInTrend = 0;
        int minPriceInTrend = 0;

        for (int currentDay = 0, nextDay = 1; nextDay < prices.length; currentDay++, nextDay++) {
            int currentPrice = prices[currentDay];
            int nextPrice = prices[nextDay];

            // first day
            if (nextDay == 1) {
                // Down_Trend
                if (isDownTrend(currentPrice, nextPrice)) {
                    downTrend = true;
                    upTrend = false;

                    maxPriceInTrend = currentPrice;
                    minPriceInTrend = nextPrice;
                } // Up_Trend
                else if (isUpTrend(currentPrice, nextPrice)) {
                    downTrend = false;
                    upTrend = true;

                    maxPriceInTrend = nextPrice;
                    minPriceInTrend = currentPrice;
                }
                continue;
            }
            // other days
            System.out.println();
            if (isContinueTrend(upTrend, downTrend, currentPrice, nextPrice)) {
                System.out.println("Continue Trend");
                if (upTrend) {
                    downTrend = false;
                    upTrend = true;

                    int max = nextPrice;
                    int min = currentPrice;

                    if (max > maxPriceInTrend) {
                        maxPriceInTrend = max;
                    }

                    if (min < minPriceInTrend) {
                        minPriceInTrend = min;
                    }
                } else if (downTrend) {
                    downTrend = true;
                    upTrend = false;

                    int max = currentPrice;
                    int min = nextPrice;

                    if (max > maxPriceInTrend) {
                        maxPriceInTrend = max;
                    }

                    if (min < minPriceInTrend) {
                        minPriceInTrend = min;
                    }
                }
            } else {
                // change Trend
                System.out.println("Change Trend");
                int max = currentPrice;
                int min = nextPrice;

                if (max > maxPriceInTrend) {
                    maxPriceInTrend = max;
                }
                if (min < minPriceInTrend) {
                    minPriceInTrend = min;
                }

                if (isUpTrend(currentPrice, nextPrice)) {
                    boughtPrice = minPriceInTrend;
                    wasBought = true;

                    upTrend = true;
                    downTrend = false;
                }
                else if (isDownTrend(currentPrice, nextPrice)) {
                    maxProfit += (maxPriceInTrend - boughtPrice);
                    boughtPrice = 0;
                    wasBought = false;

                    upTrend = false;
                    downTrend = true;
                }
                maxPriceInTrend = 0;
                minPriceInTrend = 0;
            }
            // todo do realization for last day (if it need) as other days (maybe)
        }
        return maxProfit;
    }

    private boolean isContinueTrend(boolean upTrend, boolean downTrend, int currentPrice, int nextPrice) {
        return (upTrend == isUpTrend(currentPrice, nextPrice)) || (downTrend == isDownTrend(currentPrice, nextPrice));
    }

    private boolean isDownTrend(int firstPrice, int secondPrice) {
        return firstPrice > secondPrice;
    }

    private boolean isUpTrend(int firstPrice, int secondPrice) {
        return firstPrice < secondPrice;
    }
}
