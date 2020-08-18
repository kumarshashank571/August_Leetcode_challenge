class Solution {
    public void dfs(int num,int n,int k,List<Integer> result){
        if(n==0){
            result.add(num);
            return;
        }
        int lastdigit = num%10;
        if(lastdigit>=k){dfs(num*10+lastdigit-k,n-1,k,result);}
        if(k>0 && lastdigit+k < 10){dfs(num*10+lastdigit+k,n-1,k,result);}
    }
    
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> result = new ArrayList<>();
        if(N==1){result.add(0);}
        for(int d=1;d<10;d++){
            dfs(d,N-1,K,result);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
