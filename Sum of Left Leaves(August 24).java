class Solution {
    private int sum = 0;
    private void sumofleftleaves(TreeNode root,boolean isleft){
        if(isleft && root.left == null && root.right==null){
            sum += root.val;
            return;
        }
        if(root.left != null){sumofleftleaves(root.left,true);}
        if(root.right != null){sumofleftleaves(root.right,false);}
    }
    public int sumOfLeftLeaves(TreeNode root) {
               if(root == null){return 0;}
        sumofleftleaves(root,false);
        return sum;
    }
}
