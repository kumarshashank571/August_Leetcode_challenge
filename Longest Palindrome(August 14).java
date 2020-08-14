class Solution {
    public int longestPalindrome(String str) {
        if(str.length() == 0){return 0;}
        if(str.length() == 1){return 1;}
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int oldfreq = map.get(ch);
                map.put(ch,oldfreq+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int count = 0;
        boolean bool = true;
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(freq%2==0){count+=freq;}
            else if(freq%2!=0 && bool==true){
                count+=freq;
                bool = false;
            }
            else{
                count += freq-1;
            }
        }
        return count;
    }
}
