class Solution {
    public int[] findRightInterval(int[][] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max = (int)1e8;
            int idx = -1;
            for(int j=0;j<arr.length;j++){
                if(arr[j][0]>=arr[i][1] && arr[j][0]<max){
                    max = arr[j][0];
                    idx = j;
                }
            }
            ans[i] = idx;
        }
        return ans;
    }
}
