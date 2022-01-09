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

                    boughtPrice = minPriceInTrend;
                }
                else {
                    maxPriceInTrend = nextPrice;
                    minPriceInTrend = currentPrice;

                    boughtPrice = minPriceInTrend;
                }
                // if it is the last day too
                if (nextDay == prices.length - 1) {
                    int max = Math.max(currentPrice, nextPrice);
                    int min = Math.min(currentPrice, nextPrice);

                    if (max > maxPriceInTrend) {
                        maxPriceInTrend = max;
                    }
                    if (min < minPriceInTrend) {
                        minPriceInTrend = min;
                    }
                    if (wasBought) {
                        if (boughtPrice < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - boughtPrice);
                            break;
                        }
                    } else {
                        if (isUpTrend(currentPrice, nextPrice) && minPriceInTrend < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - minPriceInTrend);
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }

            // last day
            if (nextDay == prices.length - 1) {

                if(isContinueTrend(upTrend, downTrend, currentPrice, nextPrice)) {
                    int max = Math.max(currentPrice, nextPrice);
                    int min = Math.min(currentPrice, nextPrice);

                    if (max > maxPriceInTrend) {
                        maxPriceInTrend = max;
                    }
                    if (min < minPriceInTrend) {
                        minPriceInTrend = min;
                    }
                    if (wasBought) {
                        if (boughtPrice < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - boughtPrice);
                            break;
                        }
                    } else {
                        if (isUpTrend(currentPrice, nextPrice) && minPriceInTrend < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - minPriceInTrend);
                            break;
                        }
                    }
                }
                else {
                    maxPriceInTrend = 0;
                    int max = Math.max(currentPrice, nextPrice);
                    int min = Math.min(currentPrice, nextPrice);

                    if (max > maxPriceInTrend) {
                        maxPriceInTrend = max;
                    }
                    if (min < minPriceInTrend) {
                        minPriceInTrend = min;
                    }
                    if (wasBought) {
                        if (boughtPrice < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - boughtPrice);
                            break;
                        }
                    } else {
                        if (isUpTrend(currentPrice, nextPrice) && minPriceInTrend < maxPriceInTrend) {
                            maxProfit += (maxPriceInTrend - minPriceInTrend);
                            break;
                        }
                    }
                }


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
                    boughtPrice = minPriceInTrend;
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
                    boughtPrice = minPriceInTrend;
                }
            } else {
                // change Trend
                System.out.println("Change Trend");
                int max = Math.max(currentPrice, nextPrice);
                int min = Math.min(currentPrice, nextPrice);

                if (max > maxPriceInTrend) {
                    maxPriceInTrend = max;
                }
                if (min < minPriceInTrend) {
                    minPriceInTrend = min;
                }

                if (isUpTrend(currentPrice, nextPrice)) { // buy
                    boughtPrice = minPriceInTrend;
                    wasBought = true;

                    upTrend = true;
                    downTrend = false;
                } else if (isDownTrend(currentPrice, nextPrice)) { // sell
                    maxProfit += (maxPriceInTrend - boughtPrice);
                    boughtPrice = 0;
                    wasBought = false;

                    upTrend = false;
                    downTrend = true;
                }
                // todo ??? для чего
                maxPriceInTrend = nextPrice;
                minPriceInTrend = nextPrice;
            }
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
