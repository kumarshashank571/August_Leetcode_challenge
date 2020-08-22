class Solution {
    int numpts;
    vector<int> rectcumcount;
    vector<vector<int>> rects;
public:
    Solution(vector<vector<int>>& rects) {
     numpts = 0;
     this-> rects = rects;
        for(vector<int>& rect : rects){
    numpts += (rect[2]-rect[0]+1)*(rect[3]-rect[1]+1);
            rectcumcount.push_back(numpts);
        }
    }
    vector<int> pick() {
        int ptidx = rand() % numpts;
        int l=0,r = rects.size();
        while(l<r){
            int mid = ((l+r)/2);
            if(rectcumcount[mid]<=ptidx){l=mid+1;}
            else{
                r = mid;
            }
        }
        vector<int>& rect = rects[l];
        int xpts = rect[2]-rect[0]+1;
        int ypts = rect[3]-rect[1]+1;
        int ptsinrect = xpts*ypts;
        int ptstart = rectcumcount[l]-ptsinrect;
        int offset = ptidx-ptstart;
        return {rect[0]+offset%xpts,rect[1]+offset/xpts};
    }
};
