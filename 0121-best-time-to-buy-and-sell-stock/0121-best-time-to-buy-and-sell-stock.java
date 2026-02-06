class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int buy=prices[0];
        for(int x:prices){
            if(x<buy)
                buy=x;
            else
                max=Math.max(max,x-buy);
        }   
        return max;
    }
}