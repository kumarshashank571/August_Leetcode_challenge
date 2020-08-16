class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length==0 || arr.length==1){return 0;}
        int n = arr.length;
        int mpist = 0;
        int leastsf = arr[0];
        int[] dp1 = new int[n];
        for(int i=1;i<n;i++){
            if(arr[i]<leastsf){leastsf=arr[i];}
            mpist = arr[i]-leastsf;
            if(mpist>dp1[i-1]){dp1[i]=mpist;}
            else{dp1[i]=dp1[i-1];}
        }
        int mpibt = 0;
        int maxat = arr[n-1];
        int[] dp2 = new int[n];
            for(int i =n-2;i>=0;i--){
            if(arr[i]>maxat){
                maxat = arr[i];
            }
            mpibt = maxat-arr[i];
            if(mpibt>dp2[i+1]){
                dp2[i]=mpibt;
            }
                else{
                    dp2[i]=dp2[i+1];
                }
        }
        int op = 0;
        for(int i=0;i<n;i++){
            if(dp1[i]+dp2[i]>op){
                op = dp1[i]+dp2[i];
            }
          
        }
          return op;
    }
}
