class Solution {
    public int power(int a,int b)
    {
        double m = 1.0*a;
        double n = 1.0*b;
        return (int)Math.pow(m,n);
    }
    
    public int titleToNumber(String str) {
        int ans = 0;
        for(int i=0;i<str.length();i++){
            ans += (str.charAt(i)-'@')*power(26,str.length()-1-i);
        }
        return ans;
    }
}
