class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // O(n)-space and O(n)-time
        
        /*List<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(num)){
                ans.add(num);
            }
            else{
                map.put(num,num);
            }
        }
        return ans;*/
        
        // O(1)-space and O(n)-time
        
        List<Integer> ans = new ArrayList<Integer>();
        for(int n:nums){
           n = Math.abs(n);
            if(nums[n-1]>0){nums[n-1]=-1*nums[n-1];}
            else{ans.add(n);}
        }
        return ans;
    }
}
