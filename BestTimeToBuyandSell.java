public class BestTimeToBuyandSell {

    static int solution(int[] prices) {

        int n = prices.length;
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int currentProfit = prices[i] - min;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {

        int[] prices = { 7, 2, 4, 3, 1 };
        System.out.println("The answer is " + solution(prices));

    }
}