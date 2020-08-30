class Solution {
  int find(int x,vector<int>& parent){
    if(parent[x]==-1){
        return x;
    }
    parent[x] = find(parent[x],parent);
    return parent[x];
}
    void _union(int x,int y,vector<int>& parent){
        int xp = find(x,parent);
        int yp = find(y,parent);
        if(xp!=yp){
            parent[yp]=xp;
        }
    }
    
public:
    int largestComponentSize(vector<int>& a) {
        vector<int> parent(100001,-1);
        for(int x:a){
            for(int i=2;i<=sqrt(x);i++){
                if(x%i==0){
                    _union(i,x,parent);
                    _union(x,x/i,parent);
                }
            }
        }
        int count = 0;
        unordered_map<int,int> cache;
        for(int x:a){
            int xp = find(x,parent);
            count = max(count,1+cache[xp]);
            cache[xp] += 1;
        }
        return count;
    }
};
