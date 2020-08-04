class Solution {
    public boolean isPowerOfFour(int num) {
        double num1 = 1.00 * num;
        if(num1==1.00){return true;}
        while(num1>3.00){
           // if(num==17 || num==18 || num == 19){return false;}
            if(num1 == 4.00){return true;}
            num1 = num1/4.00;
        }
        return false;
    }
}
