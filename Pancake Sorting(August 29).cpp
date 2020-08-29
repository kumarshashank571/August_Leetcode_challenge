class Solution {
     void flip(vector<int>& a,int idx){
        for(int i=0;i<=idx/2;i++){
            int temp = a[i];
            a[i] = a[idx-i];
            a[idx-i] = temp;
        }
    }
public:
   
    vector<int> pancakeSort(vector<int>& a) {
        vector<int> result;
        for(int i=a.size()-1;i>0;--i){
            for(int j=1;j<=i;j++){
                if(a[j]==i+1){
                    flip(a,j);
                    result.push_back(j+1);
                    break;
                }
            }
            flip(a,i);
            result.push_back(i+1);
        }
        return result;
    }
};
