class Solution {
    public int pathsuma(TreeNode root,int sum){
        if(root==null){return 0;}
        int res = 0;
        if(root.val==sum){res++;}
        res += pathsuma(root.left,sum-root.val);
        res += pathsuma(root.right,sum-root.val);
        return res;
    }
    public int pathSum(TreeNode root, int sum) {
        if(root==null){return 0;}
        return pathSum(root.left,sum)+pathsuma(root,sum)+pathSum(root.right,sum);
    }
}
