public class Exercise4 {
    
    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    
    public int goodNodes(TreeNode root) {
        return countGood(root, Integer.MIN_VALUE);
    }
    
    private int countGood(TreeNode node, int maxSoFar) {
        
        if (node == null) return 0;

        int res = node.val >= maxSoFar ? 1 : 0;
        res += countGood(node.left, Math.max(maxSoFar, node.val));
        res += countGood(node.right, Math.max(maxSoFar, node.val));
        
        return res;
    }

}
