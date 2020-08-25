class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        dp[n] = 0;
        dp[n-1] = Math.min(costs[0],Math.min(costs[1],costs[2]));
        for(int i=n-2;i>=0;i--){
            int d7 = i;int d30 = i;
            while(d7<n && days[d7]<days[i]+7){d7++;}
            while(d30<n && days[d30]<days[i]+30){d30++;}
            dp[i]=Math.min(costs[0]+dp[i+1],Math.min(costs[1]+dp[d7],costs[2]+dp[d30]));
        }
        return dp[0];
    }
}
