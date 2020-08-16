class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        if(arr.length<2){return 0;}
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int count = 0; int lastincluded = 0;
    for(int i=1;i<arr.length;i++){
        if(arr[i][0]<arr[lastincluded][1]){
            count++;
            if(arr[i][1]<arr[lastincluded][1]){lastincluded=i;}
        }
        else{
            lastincluded = i;
        }
    }
    return count;
    }
}
