class Solution {
public:
    int rand10() {
        int v1 = rand7(),v2 = rand7();
        while(v1>5)v1=rand7();
        while(v2==7)v2=rand7();
        return (v2<=3)?v1:v1+5;
    }
};
