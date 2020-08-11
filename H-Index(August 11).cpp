class Solution {
public:
    int hIndex(vector<int>& arr) {
        
        sort(arr.begin(),arr.end());
        int i,n = arr.size();
        for(i=1;i<=n;i++){
            if(arr[n-i]<i){break;}
        }
        return i-1;
    }
};
