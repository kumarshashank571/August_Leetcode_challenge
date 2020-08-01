class Solution {
    public boolean detectCapitalUse(String str) {
        if(str.length()==1){return true;}
        if(str.charAt(0)-'@'>=1 && str.charAt(0)-'@'<=26){
            if(str.charAt(1)-'@'>=1 && str.charAt(1)-'@'<=26){
                for(int i =2;i<str.length();i++){
                if(str.charAt(i)-'@'>=33 && str.charAt(i)-'@'<=58){return false;}
            }
            }
            else{
                for(int i =2;i<str.length();i++){
                if(str.charAt(i)-'@'>=1 && str.charAt(i)-'@'<=26){return false;}
            }
            }
            }
        else{
            for(int i =1;i<str.length();i++){
                if(str.charAt(i)-'@'>=1 && str.charAt(i)-'@'<=26){return false;}
            }
        }
        return true;
    }
}
