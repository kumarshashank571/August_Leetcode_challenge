class CombinationIterator {
     static String s = "";
     Queue<String> q = new LinkedList<>();
    
    public void getcombination(int start,int length,String txt){
        if(length==0){
            q.add(txt);
            return;
        }
        for(int i=start;i<=s.length()-length;i++){
            getcombination(i+1,length-1,txt+s.charAt(i));
        }
    }
    public CombinationIterator(String characters, int combinationLength) {
        s = characters;
        String txt = "";
        getcombination(0,combinationLength,txt);
    }
    
    public String next() {
        String str = q.peek();
        q.remove();
        return str;
    }
    
    public boolean hasNext() {
        if(q.size()==0){return false;}
        else{return true;}
    }
}
