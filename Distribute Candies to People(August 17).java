class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
         int[] arr = new int[n];
        int k = candies;
        int num = 1;
        int idx = 0;
        while(k>0){
            arr[idx] += num;
               idx++;
             if(idx==n){idx=0;}
                k = k-num; 
                num++;
            if(num>k){num=k;}
                 }
        return arr;
    }
}
