class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& A) {
        vector<int> odd;
        vector<int> even;
        for(int i=0;i<A.size();i++){
            if(A[i]%2==0){even.push_back(A[i]);}
            else{odd.push_back(A[i]);}
        }
        vector<int> ans;
        for(int i=0;i<even.size();i++){
            ans.push_back(even[i]);
        }
         for(int i=0;i<odd.size();i++){
            ans.push_back(odd[i]);
        }
        return ans;
    }
};
